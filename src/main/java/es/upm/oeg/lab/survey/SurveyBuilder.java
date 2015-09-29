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
                ("/Users/cbadenes/Documents/OEG/Projects/DrInventor/datasets/acm-siggraph-2006-2014/papers/sig100Papers",
                Lists.newArrayList("Modeling", "Stereo", "Game", "Animation", "Rendering", "Image", "Perception", "Hardware", "Light", "3DPrinting", "Display"),
                "192.168.59.103:8080",
                "siggraph.lss");


    }

}
