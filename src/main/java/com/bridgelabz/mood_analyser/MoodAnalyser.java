package com.bridgelabz.mood_analyser;

/**
 * @author tushar.kasturi_ymedi
 *
 */
public class MoodAnalyser {

	//This method gives SAD or HAPPY mood
	public String analyseMood(String message) {
		if (message.contains("sad")) {
			return "SAD";
		}
		else {
			return "HAPPY";
		}
	}

}
