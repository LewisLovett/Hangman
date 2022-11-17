package com.nology.hangman;

import java.util.ArrayList;

public class WordChecker {
    int numOfLetters;
    int lettersCorrect;
    int numOfGuesses;
    int guessLimit;
    public WordChecker(String randWord, int guessLimit){
        this.numOfLetters = randWord.length();
        this.lettersCorrect = 0;
        numOfGuesses = 0;
        this.guessLimit = guessLimit;
    }

    public ArrayList<Integer> containsLetter(Character letter, String randWord){
        ArrayList<Integer> letterPos = new ArrayList<>();
        for(int i = 0; i<randWord.length();i++){
            if(randWord.charAt(i)==letter){
                letterPos.add(i);
                lettersCorrect++;
            }
        }
        return letterPos;
    }

    public Boolean guessCheck(){
        Boolean isGameOver = false;
        if(lettersCorrect==numOfLetters){
            isGameOver = true;
            System.out.println("You win");
        }else if(numOfGuesses==guessLimit){
            isGameOver = true;
            System.out.println("You lose");
        }
        return isGameOver;
    }

    public void getInput(){

    }
}
