package com.nology.hangman;

import java.util.ArrayList;

public class HangmanDisplay {
    ArrayList<String> hangmanImage = new ArrayList<>();
    int hangStage;

//            hangmanImage.add("      _______");
//        hangmanImage.add("     |/      |");
//        hangmanImage.add("     |      (_)");
//        hangmanImage.add("     |      \\|/");
//        hangmanImage.add("     |       |");
//        hangmanImage.add("     |      / \\");
//        hangmanImage.add("     |");
//        hangmanImage.add("  ___|___");
    public HangmanDisplay(){
        hangmanImage.add("");
        hangmanImage.add("");
        hangmanImage.add("");
        hangmanImage.add("");
        hangmanImage.add("");
        hangmanImage.add("");
        hangmanImage.add("");
        hangmanImage.add("  _______");
        hangStage = 0;
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
    }



    public void nextStage(){
        if(hangStage == 0){
            hangmanImage.set(4,"     |");
            hangmanImage.set(5,"     |");
            hangmanImage.set(6,"  ___|___");
        }

    }
}
