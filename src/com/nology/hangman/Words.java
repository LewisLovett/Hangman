package com.nology.hangman;

import java.util.ArrayList;

public class Words {

    static ArrayList<String> words = new ArrayList<>();
    static {
        words.add("approach");
        words.add("sequence");
        words.add("tropical");
        words.add("epicalyx");
        words.add("fraction");
        words.add("portrait");
        words.add("finished");
        words.add("antidisestablishmentarianism");
    }


    public static ArrayList<String> getWords() {
        return words;
    }

    public void setWords(ArrayList<String> words) {
        this.words = words;
    }
}
