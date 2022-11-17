package com.nology.hangman;

import java.util.Random;
import java.util.Scanner;

public class game {
    static Random rand = new Random();
    public static void main(String[] args) {
        int randWordIndex = rand.nextInt(Words.getWords().size());
        String randWord = Words.getWords().get(randWordIndex);
        HangmanDisplay hangmanDisplay = new HangmanDisplay(randWord);
//        hangmanDisplay.nextStage();
//        hangmanDisplay.updateWngLettersDisplay('b');
        hangmanDisplay.printHangmanImage();
        String userInput;
        Scanner scanObj = new Scanner(System.in);
        userInput = scanObj.nextLine();
        if(userInput.length()==1 && userInput.matches ("[a-zA-Z]")){
            System.out.println("Correct");
        }
    }
}
