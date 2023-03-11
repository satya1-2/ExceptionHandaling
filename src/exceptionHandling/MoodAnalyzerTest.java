package exceptionHandling;

import groovy.test.GroovyTestCase;
import org.junit.Test;

public class MoodAnalyzerTest {

    private GroovyTestCase Assert;


    @Test
    public void passMessageSadWhenReturnsSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I Am In Sad Mood");
        String analyzedMood = moodAnalyzer.moodAnalyze();
        Assert.assertEquals("SAD", analyzedMood);
    }

    @Test
    public void passMessageHappyWhenReturnsNotSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I Am In Happy Mood");
        String analyzedMood = moodAnalyzer.moodAnalyze();
        Assert.assertEquals("HAPPY", analyzedMood);
    }

}

