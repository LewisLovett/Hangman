package com.nology.hangman;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class game {
    static Random rand = new Random();

    public static void main(String[] args) {
        int randWordIndex = rand.nextInt(Words.getWords().size());
        String randWord = Words.getWords().get(randWordIndex);
        HangmanDisplay hangmanDisplay = new HangmanDisplay(randWord);
        WordChecker wordChecker = new WordChecker(randWord,6);
        hangmanDisplay.printHangmanImage();

        while (!wordChecker.guessCheck()) {
            Character userInput = wordChecker.getInput();


            if (!wordChecker.usedLetterCheck(userInput)) {
                ArrayList<Integer> charPositions = wordChecker.containsLetter(userInput, randWord);
                if (charPositions.size() != 0) {
                    for (Integer charPos : charPositions) {
                        hangmanDisplay.updateCrrLettersDisplay(charPos, userInput);
                    }
                } else {
                    wordChecker.incrementGuess();
                    hangmanDisplay.nextStage();
                    hangmanDisplay.updateWngLettersDisplay(userInput);
                }
                hangmanDisplay.printHangmanImage();
            }else {
                hangmanDisplay.printHangmanImage();
                System.out.println("You have guessed that character");
            }

        }

    }
}
