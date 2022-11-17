package com.nology.hangman;

import java.util.ArrayList;

public class Words {

    ArrayList<String> words = new ArrayList<>();

    public Words (){
        this.words.add("approach");
        this.words.add("sequence");
        this.words.add("tropical");
        this.words.add("epicalyx");
        this.words.add("fraction");
        this.words.add("portrait");
        this.words.add("finished");
    }

    public ArrayList<String> getWords() {
        return words;
    }

    public void setWords(ArrayList<String> words) {
        this.words = words;
    }
}
