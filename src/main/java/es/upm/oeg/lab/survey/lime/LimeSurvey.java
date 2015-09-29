package es.upm.oeg.lab.survey.lime;

import com.google.common.base.CharMatcher;
import com.google.common.io.Files;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/**
 * Created by cbadenes on 28/09/15.
 */
public class LimeSurvey {


    public void write(String directory, List<String> answers, String host, String outFile) throws IOException {

        File input = new File(directory);

        String domain = input.getName();


//        FileFilter filter = new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.getParentFile().getName().contains("sig20");
//            }
//        };

        Iterator<File> files = FileUtils.iterateFiles(input, new String[]{"pdf"}, true);


        StringBuilder answerRows = new StringBuilder();
        StringBuilder questionRows = new StringBuilder();
        int index = 0;
        while(files.hasNext()){
            File paper = files.next();
            if (!paper.getParentFile().getName().contains("sig20")) continue;
            index += 1;

            String path = paper.getParentFile().getName()+File.separator+paper.getName();

            String name = CharMatcher.JAVA_LETTER_OR_DIGIT.retainFrom(Files.getNameWithoutExtension(path));



            int innerIndex = 0;
            for (String answer: answers){
                innerIndex += 1;
                // Answers
                StringBuilder answerRow = new StringBuilder();
                answerRow.append("<row>\n");
                answerRow.append("<qid><![CDATA[" + index + "]]></qid>\n");
                answerRow.append("<code><![CDATA[A" + innerIndex + "]]></code>\n");
                answerRow.append("<answer><![CDATA[" + answer + "]]></answer>\n");
                answerRow.append("<sortorder><![CDATA[1]]></sortorder>\n");
                answerRow.append("<assessment_value><![CDATA[0]]></assessment_value>\n");
                answerRow.append("<language><![CDATA[en]]></language>\n");
                answerRow.append("<scale_id><![CDATA[0]]></scale_id>\n");
                answerRow.append("</row>\n");
                answerRows.append(answerRow.toString());
            }



            // Questions
            StringBuilder questionRow = new StringBuilder();
            questionRow.append("<row>\n");
            questionRow.append("<qid><![CDATA["+index+"]]></qid>\n");
            questionRow.append("<parent_qid><![CDATA[0]]></parent_qid>\n");
            questionRow.append("<sid><![CDATA[535831]]></sid>\n");
            questionRow.append("<gid><![CDATA[1]]></gid>\n");
            questionRow.append("<type><![CDATA[R]]></type>\n");
            questionRow.append("<title><![CDATA["+name+"]]></title>\n");
            questionRow.append("<question><![CDATA[<iframe height=\"768\" src=\"http://"+host+"/viewer/web/viewer.html?file=http://"+host+"/dataset/"+domain+path+"\" width=\"50%\"></iframe><]]></question>\n");
            questionRow.append("<preg/>\n");
            questionRow.append("<help/>\n");
            questionRow.append("<other><![CDATA[N]]></other>\n");
            questionRow.append("<mandatory><![CDATA[N]]></mandatory>\n");
            questionRow.append("<question_order><![CDATA["+index+"]]></question_order>\n");
            questionRow.append("<language><![CDATA[en]]></language>\n");
            questionRow.append("<scale_id><![CDATA[0]]></scale_id>\n");
            questionRow.append("<same_default><![CDATA[0]]></same_default>\n");
            questionRow.append("<relevance><![CDATA[1]]></relevance>\n");
            questionRow.append("</row>\n");
            questionRows.append(questionRow.toString());
        }

        FileUtils.writeStringToFile(new File(outFile), XmlDocument.create(answerRows, questionRows), false);

    }

}
