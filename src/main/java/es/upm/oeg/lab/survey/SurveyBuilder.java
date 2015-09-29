package es.upm.oeg.lab.survey;

import com.google.common.collect.Lists;
import es.upm.oeg.lab.survey.lime.LimeSurvey;

import java.io.IOException;

/**
 * Created by cbadenes on 29/09/15.
 */
public class SurveyBuilder {

    public static void main(String[] args) throws IOException {

        LimeSurvey limeSurvey = new LimeSurvey();

        limeSurvey.write
                ("SigGraph Dataset",
                        "SIGGRAPH (short for Special Interest Group on GRAPHics and Interactive Techniques) is the name of the annual conference on computer graphics (CG) convened by the ACM SIGGRAPH organization",
                        "/Users/cbadenes/Documents/OEG/Projects/DrInventor/datasets/acm-siggraph-2006-2014/papers",
                        Lists.newArrayList("Modeling", "Stereo", "Game", "Animation", "Rendering", "Image", "Perception", "Hardware", "Light", "3DPrinting", "Display"),
                        "192.168.59.103:8080",
                        "siggraph-100-local.lss");

        limeSurvey.write
                ("SigGraph Dataset",
                        "SIGGRAPH (short for Special Interest Group on GRAPHics and Interactive Techniques) is the name of the annual conference on computer graphics (CG) convened by the ACM SIGGRAPH organization",
                        "/Users/cbadenes/Documents/OEG/Projects/DrInventor/datasets/acm-siggraph-2006-2014/papers",
                        Lists.newArrayList("Modeling", "Stereo", "Game", "Animation", "Rendering", "Image", "Perception", "Hardware", "Light", "3DPrinting", "Display"),
                        "zavijava.dia.fi.upm.es:9191",
                        "siggraph-100-zavijava.lss");

        limeSurvey.write
                ("SigGraph Dataset",
                        "SIGGRAPH (short for Special Interest Group on GRAPHics and Interactive Techniques) is the name of the annual conference on computer graphics (CG) convened by the ACM SIGGRAPH organization",
                        "/Users/cbadenes/Documents/OEG/Projects/DrInventor/datasets/acm-siggraph-2006-2014/2-papers",
                        Lists.newArrayList("Modeling", "Stereo", "Game", "Animation", "Rendering", "Image", "Perception", "Hardware", "Light", "3DPrinting", "Display"),
                        "192.168.59.103:8080",
                        "siggraph-2-local.lss");

        limeSurvey.write
                ("SigGraph Dataset",
                        "SIGGRAPH (short for Special Interest Group on GRAPHics and Interactive Techniques) is the name of the annual conference on computer graphics (CG) convened by the ACM SIGGRAPH organization",
                        "/Users/cbadenes/Documents/OEG/Projects/DrInventor/datasets/acm-siggraph-2006-2014/2-papers",
                        Lists.newArrayList("Modeling", "Stereo", "Game", "Animation", "Rendering", "Image", "Perception", "Hardware", "Light", "3DPrinting", "Display"),
                        "zavijava.dia.fi.upm.es:9191",
                        "siggraph-2-zavijava.lss");

        limeSurvey.write
                ("ISWC 2015 Dataset",
                        "Papers from The 14th International Semantic Web Conference",
                        "/Users/cbadenes/Documents/OEG/Projects/DrInventor/datasets/iswc-2015/papers",
                        Lists.newArrayList("Research", "Empirical_Studies_and_Experiments", "In-Use_and_Software", "Data_Sets_and_Ontologies"),
                        "192.168.59.103:8080",
                        "iswc-local.lss");

        limeSurvey.write
                ("ISWC 2015 Dataset",
                        "Papers from The 14th International Semantic Web Conference",
                        "/Users/cbadenes/Documents/OEG/Projects/DrInventor/datasets/iswc-2015/papers",
                        Lists.newArrayList("Research", "Empirical_Studies_and_Experiments", "In-Use_and_Software", "Data_Sets_and_Ontologies"),
                        "zavijava.dia.fi.upm.es:9191",
                        "iswc-zavijava.lss");

        //http://zavijava.dia.fi.upm.es:9191


    }

}
