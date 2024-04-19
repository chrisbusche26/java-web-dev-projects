package org.launchcode;

import java.util.List;

public class TrueOrFalse extends Question{

    private Boolean CorrectAnswer;
    public TrueOrFalse(String questionText, List<String> possibleAnswers, Boolean CorrectAnswer) {
        super(questionText, possibleAnswers);
        this.CorrectAnswer = CorrectAnswer;
    }

    public void gradeTheAnswer(String userInput){
        if (userInput.equals(CorrectAnswer.toString())) {
            System.out.println("Correct!");
        }
    }
}
