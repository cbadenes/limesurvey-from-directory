package es.upm.oeg.lab.survey.lime;

/**
 * Created by cbadenes on 28/09/15.
 */
public class XmlDocument {

    public static String create(StringBuilder answers, StringBuilder questions){
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
                "   <row>\n" +
                "    <gid><![CDATA[1]]></gid>\n" +
                "    <sid><![CDATA[535831]]></sid>\n" +
                "    <group_name><![CDATA[Domains]]></group_name>\n" +
                "    <group_order><![CDATA[0]]></group_order>\n" +
                "    <description><![CDATA[Rank the domains according to the paper's content]]></description>\n" +
                "    <language><![CDATA[en]]></language>\n" +
                "    <randomization_group/>\n" +
                "    <grelevance/>\n" +
                "   </row>\n" +
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
                " <question_attributes>\n" +
                "  <fields>\n" +
                "   <fieldname>qid</fieldname>\n" +
                "   <fieldname>attribute</fieldname>\n" +
                "   <fieldname>value</fieldname>\n" +
                "   <fieldname>language</fieldname>\n" +
                "  </fields>\n" +
                "  <rows>\n" +
                "   <row>\n" +
                "    <qid><![CDATA[1]]></qid>\n" +
                "    <attribute><![CDATA[random_order]]></attribute>\n" +
                "    <value><![CDATA[1]]></value>\n" +
                "   </row>\n" +
                "  </rows>\n" +
                " </question_attributes>\n" +
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
                "    <sid><![CDATA[535831]]></sid>\n" +
                "    <admin><![CDATA[Administrator]]></admin>\n" +
                "    <adminemail><![CDATA[cbadenes@fi.upm.es]]></adminemail>\n" +
                "    <anonymized><![CDATA[N]]></anonymized>\n" +
                "    <faxto/>\n" +
                "    <format><![CDATA[S]]></format>\n" +
                "    <savetimings><![CDATA[Y]]></savetimings>\n" +
                "    <template><![CDATA[default]]></template>\n" +
                "    <language><![CDATA[en]]></language>\n" +
                "    <additional_languages/>\n" +
                "    <datestamp><![CDATA[Y]]></datestamp>\n" +
                "    <usecookie><![CDATA[N]]></usecookie>\n" +
                "    <allowregister><![CDATA[Y]]></allowregister>\n" +
                "    <allowsave><![CDATA[Y]]></allowsave>\n" +
                "    <autonumber_start><![CDATA[3]]></autonumber_start>\n" +
                "    <autoredirect><![CDATA[N]]></autoredirect>\n" +
                "    <allowprev><![CDATA[Y]]></allowprev>\n" +
                "    <printanswers><![CDATA[N]]></printanswers>\n" +
                "    <ipaddr><![CDATA[Y]]></ipaddr>\n" +
                "    <refurl><![CDATA[Y]]></refurl>\n" +
                "    <publicstatistics><![CDATA[N]]></publicstatistics>\n" +
                "    <publicgraphs><![CDATA[N]]></publicgraphs>\n" +
                "    <listpublic><![CDATA[N]]></listpublic>\n" +
                "    <htmlemail><![CDATA[Y]]></htmlemail>\n" +
                "    <sendconfirmation><![CDATA[Y]]></sendconfirmation>\n" +
                "    <tokenanswerspersistence><![CDATA[N]]></tokenanswerspersistence>\n" +
                "    <assessments><![CDATA[N]]></assessments>\n" +
                "    <usecaptcha><![CDATA[N]]></usecaptcha>\n" +
                "    <usetokens><![CDATA[N]]></usetokens>\n" +
                "    <bounce_email><![CDATA[your-email@example.net]]></bounce_email>\n" +
                "    <emailresponseto/>\n" +
                "    <emailnotificationto/>\n" +
                "    <tokenlength><![CDATA[15]]></tokenlength>\n" +
                "    <showxquestions><![CDATA[Y]]></showxquestions>\n" +
                "    <showgroupinfo><![CDATA[B]]></showgroupinfo>\n" +
                "    <shownoanswer><![CDATA[Y]]></shownoanswer>\n" +
                "    <showqnumcode><![CDATA[X]]></showqnumcode>\n" +
                "    <bounceprocessing><![CDATA[N]]></bounceprocessing>\n" +
                "    <showwelcome><![CDATA[Y]]></showwelcome>\n" +
                "    <showprogress><![CDATA[Y]]></showprogress>\n" +
                "    <questionindex><![CDATA[0]]></questionindex>\n" +
                "    <navigationdelay><![CDATA[0]]></navigationdelay>\n" +
                "    <nokeyboard><![CDATA[N]]></nokeyboard>\n" +
                "    <alloweditaftercompletion><![CDATA[N]]></alloweditaftercompletion>\n" +
                "    <googleanalyticsstyle><![CDATA[0]]></googleanalyticsstyle>\n" +
                "    <googleanalyticsapikey/>\n" +
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
                "    <surveyls_survey_id><![CDATA[535831]]></surveyls_survey_id>\n" +
                "    <surveyls_language><![CDATA[en]]></surveyls_language>\n" +
                "    <surveyls_title><![CDATA[SigGraph Dataset]]></surveyls_title>\n" +
                "    <surveyls_description><![CDATA[<span style=\"font-family: SwissRom; font-size: 10px; line-height: 14px;\">SIGGRAPH (short for Special Interest Group on GRAPHics and Interactive Techniques) is the name of the annual conference on computer graphics (CG) convened by the ACM SIGGRAPH organization.</span>]]></surveyls_description>\n" +
                "    <surveyls_welcometext><![CDATA[Welcome to this survey about classification of computer graphic papers]]></surveyls_welcometext>\n" +
                "    <surveyls_endtext><![CDATA[Thanks!!]]></surveyls_endtext>\n" +
                "    <surveyls_url><![CDATA[http://192.168.59.103:8080]]></surveyls_url>\n" +
                "    <surveyls_urldescription><![CDATA[SigGraph Survey]]></surveyls_urldescription>\n" +
                "    <surveyls_email_invite_subj><![CDATA[Invitation to participate in a survey]]></surveyls_email_invite_subj>\n" +
                "    <surveyls_email_invite><![CDATA[Dear {FIRSTNAME},\n" +
                "\n" +
                "you have been invited to participate in a survey.\n" +
                "\n" +
                "The survey is titled:\n" +
                "\"{SURVEYNAME}\"\n" +
                "\n" +
                "\"{SURVEYDESCRIPTION}\"\n" +
                "\n" +
                "To participate, please click on the link below.\n" +
                "\n" +
                "Sincerely,\n" +
                "\n" +
                "{ADMINNAME} ({ADMINEMAIL})\n" +
                "\n" +
                "----------------------------------------------\n" +
                "Click here to do the survey:\n" +
                "{SURVEYURL}\n" +
                "\n" +
                "If you do not want to participate in this survey and don't want to receive any more invitations please click the following link:\n" +
                "{OPTOUTURL}\n" +
                "\n" +
                "If you are blacklisted but want to participate in this survey and want to receive invitations please click the following link:\n" +
                "{OPTINURL}]]></surveyls_email_invite>\n" +
                "    <surveyls_email_remind_subj><![CDATA[Reminder to participate in a survey]]></surveyls_email_remind_subj>\n" +
                "    <surveyls_email_remind><![CDATA[Dear {FIRSTNAME},\n" +
                "\n" +
                "Recently we invited you to participate in a survey.\n" +
                "\n" +
                "We note that you have not yet completed the survey, and wish to remind you that the survey is still available should you wish to take part.\n" +
                "\n" +
                "The survey is titled:\n" +
                "\"{SURVEYNAME}\"\n" +
                "\n" +
                "\"{SURVEYDESCRIPTION}\"\n" +
                "\n" +
                "To participate, please click on the link below.\n" +
                "\n" +
                "Sincerely,\n" +
                "\n" +
                "{ADMINNAME} ({ADMINEMAIL})\n" +
                "\n" +
                "----------------------------------------------\n" +
                "Click here to do the survey:\n" +
                "{SURVEYURL}\n" +
                "\n" +
                "If you do not want to participate in this survey and don't want to receive any more invitations please click the following link:\n" +
                "{OPTOUTURL}]]></surveyls_email_remind>\n" +
                "    <surveyls_email_register_subj><![CDATA[Survey registration confirmation]]></surveyls_email_register_subj>\n" +
                "    <surveyls_email_register><![CDATA[Dear {FIRSTNAME},\n" +
                "\n" +
                "You, or someone using your email address, have registered to participate in an online survey titled {SURVEYNAME}.\n" +
                "\n" +
                "To complete this survey, click on the following URL:\n" +
                "\n" +
                "{SURVEYURL}\n" +
                "\n" +
                "If you have any questions about this survey, or if you did not register to participate and believe this email is in error, please contact {ADMINNAME} at {ADMINEMAIL}.]]></surveyls_email_register>\n" +
                "    <surveyls_email_confirm_subj><![CDATA[Confirmation of your participation in our survey]]></surveyls_email_confirm_subj>\n" +
                "    <surveyls_email_confirm><![CDATA[Dear {FIRSTNAME},\n" +
                "\n" +
                "this email is to confirm that you have completed the survey titled {SURVEYNAME} and your response has been saved. Thank you for participating.\n" +
                "\n" +
                "If you have any further questions about this email, please contact {ADMINNAME} on {ADMINEMAIL}.\n" +
                "\n" +
                "Sincerely,\n" +
                "\n" +
                "{ADMINNAME}]]></surveyls_email_confirm>\n" +
                "    <surveyls_dateformat><![CDATA[9]]></surveyls_dateformat>\n" +
                "    <email_admin_notification_subj><![CDATA[Response submission for survey {SURVEYNAME}]]></email_admin_notification_subj>\n" +
                "    <email_admin_notification><![CDATA[Hello,\n" +
                "\n" +
                "A new response was submitted for your survey '{SURVEYNAME}'.\n" +
                "\n" +
                "Click the following link to reload the survey:\n" +
                "{RELOADURL}\n" +
                "\n" +
                "Click the following link to see the individual response:\n" +
                "{VIEWRESPONSEURL}\n" +
                "\n" +
                "Click the following link to edit the individual response:\n" +
                "{EDITRESPONSEURL}\n" +
                "\n" +
                "View statistics by clicking here:\n" +
                "{STATISTICSURL}]]></email_admin_notification>\n" +
                "    <email_admin_responses_subj><![CDATA[Response submission for survey {SURVEYNAME} with results]]></email_admin_responses_subj>\n" +
                "    <email_admin_responses><![CDATA[Hello,\n" +
                "\n" +
                "A new response was submitted for your survey '{SURVEYNAME}'.\n" +
                "\n" +
                "Click the following link to reload the survey:\n" +
                "{RELOADURL}\n" +
                "\n" +
                "Click the following link to see the individual response:\n" +
                "{VIEWRESPONSEURL}\n" +
                "\n" +
                "Click the following link to edit the individual response:\n" +
                "{EDITRESPONSEURL}\n" +
                "\n" +
                "View statistics by clicking here:\n" +
                "{STATISTICSURL}\n" +
                "\n" +
                "\n" +
                "The following answers were given by the participant:\n" +
                "{ANSWERTABLE}]]></email_admin_responses>\n" +
                "    <surveyls_numberformat><![CDATA[0]]></surveyls_numberformat>\n" +
                "   </row>\n" +
                "  </rows>\n" +
                " </surveys_languagesettings>\n" +
                "</document>";




    }

}
