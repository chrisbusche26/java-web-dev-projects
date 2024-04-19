package org.launchcode;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Checkbox extends Question{

    private List<String> CorrectAnswers;
    public Checkbox(String questionText, List<String> possibleAnswers, List<String> correctAnswers) {
        super(questionText, possibleAnswers);
        this.CorrectAnswers = correctAnswers;
    }

    public List<String> getCorrectAnswers() {
        return CorrectAnswers;
    }

    public void printPossibleAnswers(){
        System.out.println(getPossibleAnswers());
    }

    @Override
    public String collectAnswer(){
        Scanner scanner = new Scanner(System.in);

        String userInput = "";
        int counter = 0;

        for (String possibleAnswer : this.getPossibleAnswers()){
            userInput = scanner.next();
            if(getCorrectAnswers().contains(userInput)){
                counter++;
            }
        }
    }


}
