package es.upm.oeg.lab.survey.lime;

import org.apache.commons.lang.StringUtils;

/**
 * Created by cbadenes on 28/09/15.
 */
public class XmlDocument {

    public static String create(String surveyId, String title, String description, StringBuilder answers, StringBuilder groups, StringBuilder questions){



        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<document>\n" +
                " <LimeSurveyDocType>Survey</LimeSurveyDocType>\n" +
                " <DBVersion>184</DBVersion>\n" +
                " <languages>\n" +
                "  <language>en</language>\n" +
                " </languages>\n" +
                " <answers>\n" +
                "  <fields>\n" +
                "   <fieldname>qid</fieldname>\n" +
                "   <fieldname>code</fieldname>\n" +
                "   <fieldname>answer</fieldname>\n" +
                "   <fieldname>sortorder</fieldname>\n" +
                "   <fieldname>assessment_value</fieldname>\n" +
                "   <fieldname>language</fieldname>\n" +
                "   <fieldname>scale_id</fieldname>\n" +
                "  </fields>\n" +
                "  <rows>\n" +
                answers.toString() +
                "</rows>\n" +
                " </answers>\n" +
                " <groups>\n" +
                "  <fields>\n" +
                "   <fieldname>gid</fieldname>\n" +
                "   <fieldname>sid</fieldname>\n" +
                "   <fieldname>group_name</fieldname>\n" +
                "   <fieldname>group_order</fieldname>\n" +
                "   <fieldname>description</fieldname>\n" +
                "   <fieldname>language</fieldname>\n" +
                "   <fieldname>randomization_group</fieldname>\n" +
                "   <fieldname>grelevance</fieldname>\n" +
                "  </fields>\n" +
                "  <rows>\n" +
                groups.toString() +
                "  </rows>\n" +
                " </groups>\n" +
                " <questions>\n" +
                "  <fields>\n" +
                "   <fieldname>qid</fieldname>\n" +
                "   <fieldname>parent_qid</fieldname>\n" +
                "   <fieldname>sid</fieldname>\n" +
                "   <fieldname>gid</fieldname>\n" +
                "   <fieldname>type</fieldname>\n" +
                "   <fieldname>title</fieldname>\n" +
                "   <fieldname>question</fieldname>\n" +
                "   <fieldname>preg</fieldname>\n" +
                "   <fieldname>help</fieldname>\n" +
                "   <fieldname>other</fieldname>\n" +
                "   <fieldname>mandatory</fieldname>\n" +
                "   <fieldname>question_order</fieldname>\n" +
                "   <fieldname>language</fieldname>\n" +
                "   <fieldname>scale_id</fieldname>\n" +
                "   <fieldname>same_default</fieldname>\n" +
                "   <fieldname>relevance</fieldname>\n" +
                "  </fields>\n" +
                "  <rows>\n" +
                questions.toString() +
                "</rows>\n" +
                " </questions>\n" +
                " <surveys>\n" +
                "  <fields>\n" +
                "   <fieldname>sid</fieldname>\n" +
                "   <fieldname>admin</fieldname>\n" +
                "   <fieldname>expires</fieldname>\n" +
                "   <fieldname>startdate</fieldname>\n" +
                "   <fieldname>adminemail</fieldname>\n" +
                "   <fieldname>anonymized</fieldname>\n" +
                "   <fieldname>faxto</fieldname>\n" +
                "   <fieldname>format</fieldname>\n" +
                "   <fieldname>savetimings</fieldname>\n" +
                "   <fieldname>template</fieldname>\n" +
                "   <fieldname>language</fieldname>\n" +
                "   <fieldname>additional_languages</fieldname>\n" +
                "   <fieldname>datestamp</fieldname>\n" +
                "   <fieldname>usecookie</fieldname>\n" +
                "   <fieldname>allowregister</fieldname>\n" +
                "   <fieldname>allowsave</fieldname>\n" +
                "   <fieldname>autonumber_start</fieldname>\n" +
                "   <fieldname>autoredirect</fieldname>\n" +
                "   <fieldname>allowprev</fieldname>\n" +
                "   <fieldname>printanswers</fieldname>\n" +
                "   <fieldname>ipaddr</fieldname>\n" +
                "   <fieldname>refurl</fieldname>\n" +
                "   <fieldname>publicstatistics</fieldname>\n" +
                "   <fieldname>publicgraphs</fieldname>\n" +
                "   <fieldname>listpublic</fieldname>\n" +
                "   <fieldname>htmlemail</fieldname>\n" +
                "   <fieldname>sendconfirmation</fieldname>\n" +
                "   <fieldname>tokenanswerspersistence</fieldname>\n" +
                "   <fieldname>assessments</fieldname>\n" +
                "   <fieldname>usecaptcha</fieldname>\n" +
                "   <fieldname>usetokens</fieldname>\n" +
                "   <fieldname>bounce_email</fieldname>\n" +
                "   <fieldname>attributedescriptions</fieldname>\n" +
                "   <fieldname>emailresponseto</fieldname>\n" +
                "   <fieldname>emailnotificationto</fieldname>\n" +
                "   <fieldname>tokenlength</fieldname>\n" +
                "   <fieldname>showxquestions</fieldname>\n" +
                "   <fieldname>showgroupinfo</fieldname>\n" +
                "   <fieldname>shownoanswer</fieldname>\n" +
                "   <fieldname>showqnumcode</fieldname>\n" +
                "   <fieldname>bouncetime</fieldname>\n" +
                "   <fieldname>bounceprocessing</fieldname>\n" +
                "   <fieldname>bounceaccounttype</fieldname>\n" +
                "   <fieldname>bounceaccounthost</fieldname>\n" +
                "   <fieldname>bounceaccountpass</fieldname>\n" +
                "   <fieldname>bounceaccountencryption</fieldname>\n" +
                "   <fieldname>bounceaccountuser</fieldname>\n" +
                "   <fieldname>showwelcome</fieldname>\n" +
                "   <fieldname>showprogress</fieldname>\n" +
                "   <fieldname>questionindex</fieldname>\n" +
                "   <fieldname>navigationdelay</fieldname>\n" +
                "   <fieldname>nokeyboard</fieldname>\n" +
                "   <fieldname>alloweditaftercompletion</fieldname>\n" +
                "   <fieldname>googleanalyticsstyle</fieldname>\n" +
                "   <fieldname>googleanalyticsapikey</fieldname>\n" +
                "  </fields>\n" +
                "  <rows>\n" +
                "   <row>\n" +
                "    <sid><![CDATA["+surveyId+"]]></sid>\n" +
                "    <admin><![CDATA[Administrator]]></admin>\n" +
                "    <adminemail><![CDATA[drinventor.upm@gmail.com]]></adminemail>\n" +
                "    <anonymized><![CDATA[N]]></anonymized>\n" +
                "    <faxto/>\n" +
                "    <format><![CDATA[G]]></format>\n" +
                "    <savetimings><![CDATA[Y]]></savetimings>\n" +
                "    <template><![CDATA[bluengrey]]></template>\n" +
                "    <language><![CDATA[en]]></language>\n" +
                "    <additional_languages/>\n" +
                "    <datestamp><![CDATA[Y]]></datestamp>\n" +
                "    <usecookie><![CDATA[N]]></usecookie>\n" +
                "    <allowregister><![CDATA[N]]></allowregister>\n" +
                "    <allowsave><![CDATA[Y]]></allowsave>\n" +
                "    <autonumber_start><![CDATA[0]]></autonumber_start>\n" +
                "    <autoredirect><![CDATA[N]]></autoredirect>\n" +
                "    <allowprev><![CDATA[Y]]></allowprev>\n" +
                "    <printanswers><![CDATA[N]]></printanswers>\n" +
                "    <ipaddr><![CDATA[Y]]></ipaddr>\n" +
                "    <refurl><![CDATA[Y]]></refurl>\n" +
                "    <publicstatistics><![CDATA[N]]></publicstatistics>\n" +
                "    <publicgraphs><![CDATA[N]]></publicgraphs>\n" +
                "    <listpublic><![CDATA[N]]></listpublic>\n" +
                "    <htmlemail><![CDATA[N]]></htmlemail>\n" +
                "    <sendconfirmation><![CDATA[N]]></sendconfirmation>\n" +
                "    <tokenanswerspersistence><![CDATA[N]]></tokenanswerspersistence>\n" +
                "    <assessments><![CDATA[Y]]></assessments>\n" +
                "    <usecaptcha><![CDATA[N]]></usecaptcha>\n" +
                "    <usetokens><![CDATA[N]]></usetokens>\n" +
                "    <bounce_email><![CDATA[drinventor.upm@gmail.com]]></bounce_email>\n" +
                "    <emailresponseto><![CDATA[drinventor.upm@gmail.com]]></emailresponseto>\n" +
                "    <emailnotificationto><![CDATA[drinventor.upm@gmail.com]]></emailnotificationto>\n" +
                "    <tokenlength><![CDATA[15]]></tokenlength>\n" +
                "    <showxquestions><![CDATA[Y]]></showxquestions>\n" +
                "    <showgroupinfo><![CDATA[B]]></showgroupinfo>\n" +
                "    <shownoanswer><![CDATA[Y]]></shownoanswer>\n" +
                "    <showqnumcode><![CDATA[X]]></showqnumcode>\n" +
                "    <bounceprocessing><![CDATA[N]]></bounceprocessing>\n" +
                "    <showwelcome><![CDATA[Y]]></showwelcome>\n" +
                "    <showprogress><![CDATA[Y]]></showprogress>\n" +
                "    <questionindex><![CDATA[1]]></questionindex>\n" +
                "    <navigationdelay><![CDATA[0]]></navigationdelay>\n" +
                "    <nokeyboard><![CDATA[Y]]></nokeyboard>\n" +
                "    <alloweditaftercompletion><![CDATA[N]]></alloweditaftercompletion>\n" +
                "    <googleanalyticsstyle><![CDATA[0]]></googleanalyticsstyle>\n" +
                "    <googleanalyticsapikey/>" +
                "   </row>\n" +
                "  </rows>\n" +
                " </surveys>\n" +
                " <surveys_languagesettings>\n" +
                "  <fields>\n" +
                "   <fieldname>surveyls_survey_id</fieldname>\n" +
                "   <fieldname>surveyls_language</fieldname>\n" +
                "   <fieldname>surveyls_title</fieldname>\n" +
                "   <fieldname>surveyls_description</fieldname>\n" +
                "   <fieldname>surveyls_welcometext</fieldname>\n" +
                "   <fieldname>surveyls_endtext</fieldname>\n" +
                "   <fieldname>surveyls_url</fieldname>\n" +
                "   <fieldname>surveyls_urldescription</fieldname>\n" +
                "   <fieldname>surveyls_email_invite_subj</fieldname>\n" +
                "   <fieldname>surveyls_email_invite</fieldname>\n" +
                "   <fieldname>surveyls_email_remind_subj</fieldname>\n" +
                "   <fieldname>surveyls_email_remind</fieldname>\n" +
                "   <fieldname>surveyls_email_register_subj</fieldname>\n" +
                "   <fieldname>surveyls_email_register</fieldname>\n" +
                "   <fieldname>surveyls_email_confirm_subj</fieldname>\n" +
                "   <fieldname>surveyls_email_confirm</fieldname>\n" +
                "   <fieldname>surveyls_dateformat</fieldname>\n" +
                "   <fieldname>surveyls_attributecaptions</fieldname>\n" +
                "   <fieldname>email_admin_notification_subj</fieldname>\n" +
                "   <fieldname>email_admin_notification</fieldname>\n" +
                "   <fieldname>email_admin_responses_subj</fieldname>\n" +
                "   <fieldname>email_admin_responses</fieldname>\n" +
                "   <fieldname>surveyls_numberformat</fieldname>\n" +
                "   <fieldname>attachments</fieldname>\n" +
                "  </fields>\n" +
                "  <rows>\n" +
                "   <row>\n" +
                "    <surveyls_survey_id><![CDATA["+surveyId+"]]></surveyls_survey_id>\n" +
                "    <surveyls_language><![CDATA[en]]></surveyls_language>\n" +
                "    <surveyls_title><![CDATA["+title+"]]></surveyls_title>\n" +
                "    <surveyls_description><![CDATA["+description+"]]></surveyls_description>\n" +
                "    <surveyls_welcometext/>\n" +
                "    <surveyls_endtext><![CDATA[Thanks!!]]></surveyls_endtext>\n" +
                "    <surveyls_url><![CDATA[http://drinventor.eu]]></surveyls_url>\n" +
                "    <surveyls_urldescription/>\n" +
                "    <surveyls_email_invite_subj></surveyls_email_invite_subj>\n" +
                "    <surveyls_email_invite></surveyls_email_invite>\n" +
                "    <surveyls_email_remind_subj></surveyls_email_remind_subj>\n" +
                "    <surveyls_email_remind></surveyls_email_remind>\n" +
                "    <surveyls_email_register_subj></surveyls_email_register_subj>\n" +
                "    <surveyls_email_register></surveyls_email_register>\n" +
                "    <surveyls_email_confirm_subj></surveyls_email_confirm_subj>\n" +
                "    <surveyls_email_confirm></surveyls_email_confirm>\n" +
                "    <surveyls_dateformat><![CDATA[9]]></surveyls_dateformat>\n" +
                "    <email_admin_notification_subj></email_admin_notification_subj>\n" +
                "    <email_admin_notification></email_admin_notification>\n" +
                "    <email_admin_responses_subj></email_admin_responses_subj>\n" +
                "    <email_admin_responses></email_admin_responses>\n" +
                "    <surveyls_numberformat><![CDATA[0]]></surveyls_numberformat>\n" +
                "   </row>\n" +
                "  </rows>\n" +
                " </surveys_languagesettings>\n" +
                "</document>";




    }

}
