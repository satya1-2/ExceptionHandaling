package exceptionHandling;

public class MoodAnalyzer {
    String message;

    public MoodAnalyzer() {

    }

    public String getMessage() {
        return message;
    }

    public MoodAnalyzer(String message) {

        this.message = message;
    }

    String moodAnalyze() {
        if (this.message == "I Am In Sad Mood") {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }


}