package com.nology.hangman;

import java.util.ArrayList;
import java.util.Scanner;

public class WordChecker {
    int numOfLetters;
    int lettersCorrect;
    int numOfGuesses;
    int guessLimit;
//    ArrayList<Character> lettersUsed = new ArrayList<>();
    ArrayList<Character> charsGuessed = new ArrayList<>();
    Scanner scanObj = new Scanner(System.in);
    public WordChecker(String randWord, int guessLimit){
        this.numOfLetters = randWord.length();
        this.lettersCorrect = 0;
        numOfGuesses = 0;
        this.guessLimit = guessLimit;
    }

    public void incrementGuess(){
        numOfGuesses++;
    }

    public ArrayList<Integer> containsLetter(Character letter, String randWord){
        ArrayList<Integer> letterPos = new ArrayList<>();
        for(int i = 0; i<randWord.length();i++){
            if(randWord.charAt(i)==letter){
                letterPos.add(i);
                lettersCorrect++;
            }
        }
        charsGuessed.add(letter);
        return letterPos;
    }

    public Boolean guessCheck(){
        Boolean isGameOver = false;
        if(lettersCorrect==numOfLetters){
            isGameOver = true;
            System.out.println("-----------YOU WIN-----------");
        }else if(numOfGuesses==guessLimit){
            isGameOver = true;
            System.out.println("-----------YOU LOSE-----------");
        }
        return isGameOver;
    }

    public Character getInput(){
        String userInput;
        Character response = 0;
        Boolean isValidInput = false;
        while (!isValidInput) {
            System.out.println("Please enter a single letter");
            userInput = scanObj.nextLine();

            if (userInput.length() == 1 && userInput.matches("[a-zA-Z]")) {
                response = userInput.toLowerCase().charAt(0);
                isValidInput = true;
            }else{
                System.out.println("That is an incorrect input");
            }
        }
        return response;
    }

    public Boolean usedLetterCheck(Character userInput){
        Boolean response = false;
        if(charsGuessed.contains(userInput)){
            response = true;
        }
        return response;
    }

}
