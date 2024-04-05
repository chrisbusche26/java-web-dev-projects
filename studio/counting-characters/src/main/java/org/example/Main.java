package org.example;

import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        String input = "If the product of two terms is zero then common sense says at" +
                " least one of the two terms has to be zero to start with. So if you " +
                "move all the terms over to one side, you can put the quadratics into " +
                "a form that can be factored allowing that side of the equation to" +
                " equal zero. Once you’ve done that, it’s pretty straightforward from " +
                "there.";

        HashMap<Character, Integer> countOfCharacters = new HashMap<>();

        for (Character c : input.toLowerCase().toCharArray()) {
            if(Character.isLetter(c)) {
                if (!countOfCharacters.containsKey(c)) {
                    countOfCharacters.put(c, 1);
                } else {
                    countOfCharacters.put(c, countOfCharacters.get(c) + 1);
                }
            }
        }

            for (Map.Entry<Character, Integer> character : countOfCharacters.entrySet()) {
                System.out.println(character.getKey() + " : " + character.getValue());
            }

    }
}