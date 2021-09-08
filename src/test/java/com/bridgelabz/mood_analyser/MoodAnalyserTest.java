package com.bridgelabz.mood_analyser;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for MoodAnalyser.
 */
public class MoodAnalyserTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testMoodAnalysis()throws Exception 
    {
    	MoodAnalyser  moodAnalyser = new MoodAnalyser();
    	String mood = moodAnalyser.analyseMood("This is a sad message ");
    	Assert.assertThat(mood, CoreMatchers.is("SAD"));
    }
    
    @Test
    public void happyMood() throws Exception {
    	MoodAnalyser  moodAnalyser = new MoodAnalyser();
    	String mood = moodAnalyser.analyseMood("This is a happy message ");
    	Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
	}
}
