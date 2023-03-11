package exceptionHandling;

public class MoodAnalyzer {
    String message;

    String moodAnalyze(String message) {
        if (message == "I Am In Sad Mood") {
            return null;
        } else {
            return "HAPPY";
        }
    }

}