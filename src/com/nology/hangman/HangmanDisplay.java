package com.nology.hangman;

import java.util.ArrayList;

public class HangmanDisplay {
    ArrayList<String> hangmanImage = new ArrayList<>();
    String desiredWord;
    ArrayList<Character> crrLettersDisplay = new ArrayList<>();
    ArrayList<Character> wngLettersDisplay = new ArrayList<>();
    int hangStage;


//            hangmanImage.add("      _______");
//        hangmanImage.add("     |/      |");
//        hangmanImage.add("     |      (_)");
//        hangmanImage.add("     |      \\|/");
//        hangmanImage.add("     |       |");
//        hangmanImage.add("     |      / \\");
//        hangmanImage.add("     |");
//        hangmanImage.add("  ___|___");
    public HangmanDisplay(String desiredWord){
        this.hangmanImage.add("");
        this.hangmanImage.add("");
        this.hangmanImage.add("");
        this.hangmanImage.add("");
        this.hangmanImage.add("");
        this.hangmanImage.add("");
        this.hangmanImage.add("");
        this.hangmanImage.add("  _______");
        this.hangStage = 0;
        this.desiredWord = desiredWord;
        for(int i = 0; i<desiredWord.length();i++){
            crrLettersDisplay.add('_');
        }
    }

    public void setHangmanImage(ArrayList<String> hangmanImage) {
        this.hangmanImage = hangmanImage;
    }

    public ArrayList<String> getHangmanImage() {
        return hangmanImage;
    }

    public int getHangStage() {
        return hangStage;
    }

    public void setHangStage(int hangStage) {
        this.hangStage = hangStage;
    }

    public void printHangmanImage(){
        for(String hangLine: hangmanImage){
            System.out.println(hangLine);
        }
        for(Character letterDisplay: crrLettersDisplay){
            System.out.print(" "+ letterDisplay + " ");
        }
        System.out.print("\nWrong letters: ");
        for(Character letterDisplay: wngLettersDisplay){
            System.out.print(" "+ letterDisplay + " ");
        }
    }

    public void updateCrrLettersDisplay(int index, Character letter){
        crrLettersDisplay.set(index,letter);
    }

    public void updateWngLettersDisplay(Character letter){
        wngLettersDisplay.add(letter);
    }


    public void nextStage(){
        if(hangStage == 0){
            hangmanImage.set(5,"     |");
            hangmanImage.set(6,"     |");
            hangmanImage.set(7,"  ___|___");
            hangStage++;
        }

    }
}
