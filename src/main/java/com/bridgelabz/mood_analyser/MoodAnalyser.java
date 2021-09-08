package com.bridgelabz.mood_analyser;

/**
 * @author tushar.kasturi_ymedi
 *
 */
public class MoodAnalyser {

	String message;

	public MoodAnalyser(String message) {

		this.message = message;
	}

	public MoodAnalyser() {
	}

	// This method gives SAD or HAPPY mood
	public String analyseMood() throws MoodAnalysisException {
		try {
			if (message.contains("sad")) {
				return "SAD";
			} else {
				return "HAPPY";
			}
		}
		catch(NullPointerException e) {
			throw new MoodAnalysisException("Please enter proper valid mood");
		}
	}

}
