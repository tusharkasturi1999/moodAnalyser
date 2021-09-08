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
    	MoodAnalyser  moodAnalyser = new MoodAnalyser("This is a sad message");
    	String mood = moodAnalyser.analyseMood();
    	Assert.assertThat(mood, CoreMatchers.is("SAD"));
    }
    
    @Test
    public void happyMood() throws Exception {
    	MoodAnalyser  moodAnalyser = new MoodAnalyser("This is a happy message ");
    	String mood = moodAnalyser.analyseMood();
    	Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
	}
    
    @Test
    public void anyMood() throws Exception {
    	MoodAnalyser  moodAnalyser = new MoodAnalyser("I am in any mood ");
    	String mood = moodAnalyser.analyseMood();
    	Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
	}
}
