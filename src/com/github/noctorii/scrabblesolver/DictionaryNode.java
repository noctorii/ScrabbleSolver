package com.github.noctorii.scrabblesolver;

import java.util.ArrayList;
import java.util.LinkedList;


//obsolete; now everything's done with hashes
public class DictionaryNode {
    private LinkedList<Character> word;
    private ArrayList<DictionaryNode> children;

    public DictionaryNode(String word){
        this.word = new LinkedList<Character>();
        char[] myWord = word.toCharArray();
        for (int i = 0; i < myWord.length; i++){
            this.word.add(myWord[i]);
        }

    }

    public DictionaryNode(String word, ArrayList<DictionaryNode> children){
        this.children = children;
    }

    public void addChild (DictionaryNode child){
        children.add(child);
    }


}
