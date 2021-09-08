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
	public String analyseMood() {
		if (message.contains("sad")) {
			return "SAD";
		} else {
			return "HAPPY";
		}
	}

}
