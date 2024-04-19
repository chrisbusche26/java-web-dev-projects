package org.launchcode;

import java.util.List;
import java.util.Scanner;

public class Question {
    private String QuestionText;
    private List<String> PossibleAnswers;

    Question(String questionText, List<String> possibleAnswers) {
        this.QuestionText = questionText;
        this.PossibleAnswers = possibleAnswers;
    }

    public String getQuestionText() {
        return QuestionText;
    }

    public void setQuestionText(String questionText) {
        QuestionText = questionText;
    }

    public List<String> getPossibleAnswers() {
        return PossibleAnswers;
    }

    public void setPossibleAnswers(List<String> possibleAnswers) {
        PossibleAnswers = possibleAnswers;
    }

    public void printQuestion(){
        System.out.println(QuestionText);
    }

    public String collectAnswer(){
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        userInput = scanner.next();
        return userInput;
    }
}
