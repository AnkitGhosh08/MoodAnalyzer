package com.codinclub;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


/**
 * We have created this test method to check the sad mood.
 * If we provide the string of sad then the method should return sad.
 * We have used the asserts equals to check if the method o/p is sad.
 */
public class MoodAnalyzerTest {
    MoodAnalyzer moodAnalyzer = new MoodAnalyzer();

    @Test
    public void givenMessage_IsProper_ShouldReturnSad() {
        moodAnalyzer.setMessage("I am in Sad Mood");
        String actualResult = moodAnalyzer.analyseMood();
        Assertions.assertEquals("SAD", actualResult);
    }

    @Test
    public void givenMessage_IsProper_ShouldReturnHappy() {
        moodAnalyzer.setMessage("I am in Happy Mood");
        String actualResult = moodAnalyzer.analyseMood();
        Assertions.assertEquals("HAPPY", actualResult);
    }

    /**
     * This method will return Happy if we pass as in any mood.
     */
    @Test
    public void givenMessage_IsProper_AndContain_Any_ShouldReturnHappy() {
        moodAnalyzer.setMessage("I am in any Mood");
        String actualResult = moodAnalyzer.analyseMood();
        Assertions.assertEquals("ANY", actualResult);
    }

    /**
     * We have created this test case to check for NullException.
     * If null value passed then it will return Invalid Mood and will be checked by assert method.
     */
    @Test
    public void NullExceptionHandler() {
        moodAnalyzer.setMessage(null);
        String actualResult = moodAnalyzer.analyseMood();
        Assertions.assertEquals("Invalid Mood", actualResult);
    }
}

