package es.upm.oeg.lab.survey.lime;

import com.google.common.base.CharMatcher;
import com.google.common.io.Files;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Created by cbadenes on 28/09/15.
 */
public class LimeSurvey {


    public void write(String title, String description, String directory, List<String> answers, String host, String outFile) throws IOException {

        File input = new File(directory);

        String domain = input.getParentFile().getName();

        Iterator<File> files = FileUtils.iterateFiles(input, new String[]{"pdf"}, true);

        String surveyId = StringUtils.left(String.valueOf(Math.abs(title.hashCode())), 6); //535831

        StringBuilder answerRows = new StringBuilder();
        StringBuilder questionRows = new StringBuilder();
        StringBuilder groupRows = new StringBuilder();
        int qid = 0;
        int gid = 0;
        while(files.hasNext()){
            File paper = files.next();

            // Initialize counters
            gid += 1;
            qid += 1;

//            String path = paper.getParentFile().getName()+File.separator+paper.getName();

            String path = StringUtils.substringAfterLast(paper.getAbsolutePath(),input.getAbsolutePath());


            String name = CharMatcher.JAVA_LETTER_OR_DIGIT.retainFrom(Files.getNameWithoutExtension(path));



            int aid = 0;
            for (String answer: answers){
                aid += 1;
                // Answers
                StringBuilder answerRow = new StringBuilder();
                answerRow.append("<row>\n");
                answerRow.append("<qid><![CDATA[" + qid + "]]></qid>\n");
                answerRow.append("<code><![CDATA[A" + aid + "]]></code>\n");
                answerRow.append("<answer><![CDATA[" + answer + "]]></answer>\n");
                answerRow.append("<sortorder><![CDATA[1]]></sortorder>\n");
                answerRow.append("<assessment_value><![CDATA[0]]></assessment_value>\n");
                answerRow.append("<language><![CDATA[en]]></language>\n");
                answerRow.append("<scale_id><![CDATA[0]]></scale_id>\n");
                answerRow.append("</row>\n");
                answerRows.append(answerRow.toString());
            }

            // Groups
            StringBuilder groupRow = new StringBuilder();
            groupRow.append("<row>\n");
            groupRow.append("<gid><![CDATA["+gid+"]]></gid>\n");
            groupRow.append("<sid><![CDATA["+surveyId+"]]></sid>\n");
            groupRow.append("<group_name><![CDATA[Paper "+gid+"]]></group_name>\n");
            groupRow.append("<group_order><![CDATA["+gid+"]]></group_order>\n");
            groupRow.append("<description><![CDATA[<br />\n" +
                    "<iframe height=\"768px\" src=\"http://"+host+"/viewer/web/viewer.html?file=http://"+host+"/dataset/"+domain+path+"\" width=\"100%\"></iframe><br />\n" +
                    "]]></description>\n");
            groupRow.append("<language><![CDATA[en]]></language>\n");
            groupRow.append("<randomization_group/>\n");
            groupRow.append("<grelevance/>\n");
            groupRow.append("</row>\n");

            groupRows.append(groupRow.toString());

            // Questions
            StringBuilder questionRow = new StringBuilder();

            // -> Ranking
            String code = "q"+StringUtils.right(paper.getParentFile().getName(), 4)+""+name;
            questionRow.append("<row>\n");
            questionRow.append("<qid><![CDATA["+qid+"]]></qid>\n");
            questionRow.append("<parent_qid><![CDATA[0]]></parent_qid>\n");
            questionRow.append("<sid><![CDATA["+surveyId+"]]></sid>\n");
            questionRow.append("<gid><![CDATA["+gid+"]]></gid>\n");
            questionRow.append("<type><![CDATA[R]]></type>\n");
            questionRow.append("<title><![CDATA["+code+"C1]]></title>\n");
            questionRow.append("<question><![CDATA[Category]]></question>\n");
            questionRow.append("<preg/>\n");
            questionRow.append("<help><![CDATA[Sort these categories according to the content of the paper. The meaning of each category is the one that you consider]]></help>\n");
            questionRow.append("<other><![CDATA[N]]></other>\n");
            questionRow.append("<mandatory><![CDATA[N]]></mandatory>\n");
            questionRow.append("<question_order><![CDATA["+qid+"]]></question_order>\n");
            questionRow.append("<language><![CDATA[en]]></language>\n");
            questionRow.append("<scale_id><![CDATA[0]]></scale_id>\n");
            questionRow.append("<same_default><![CDATA[0]]></same_default>\n");
            questionRow.append("<relevance><![CDATA[1]]></relevance>\n");
            questionRow.append("</row>\n");

            qid += 1;

            // -> Keywords
            questionRow.append("<row>\n");
            questionRow.append("<qid><![CDATA["+qid+"]]></qid>\n");
            questionRow.append("<parent_qid><![CDATA[0]]></parent_qid>\n");
            questionRow.append("<sid><![CDATA["+surveyId+"]]></sid>\n");
            questionRow.append("<gid><![CDATA["+gid+"]]></gid>\n");
            questionRow.append("<type><![CDATA[S]]></type>\n");
            questionRow.append("<title><![CDATA["+code+"C2]]></title>\n");
            questionRow.append("<question><![CDATA[Terms]]></question>\n");
            questionRow.append("<preg/>\n");
            questionRow.append("<help><![CDATA[Identify the most relevant terms separated by semicolon]]></help>\n");
            questionRow.append("<other><![CDATA[N]]></other>\n");
            questionRow.append("<mandatory><![CDATA[N]]></mandatory>\n");
            questionRow.append("<question_order><![CDATA["+qid+"]]></question_order>\n");
            questionRow.append("<language><![CDATA[en]]></language>\n");
            questionRow.append("<scale_id><![CDATA[0]]></scale_id>\n");
            questionRow.append("<same_default><![CDATA[0]]></same_default>\n");
            questionRow.append("<relevance><![CDATA[1]]></relevance>\n");
            questionRow.append("</row>\n");

            questionRows.append(questionRow.toString());
        }

        FileUtils.writeStringToFile(new File(outFile), XmlDocument.create(surveyId, title, description, answerRows, groupRows, questionRows), false);

    }

}
