package com.github.noctorii.scrabblesolver;


import java.util.List;

public class SolutionEngine {
    private DictionaryGraph dictionary;
    private ScoringEngine scoringEngine;


    public SolutionEngine (List<String> dictionary, ScoringEngine scoringEngine){
        this.dictionary = new DictionaryGraph(dictionary);
        this.scoringEngine = scoringEngine;
    }

    public Play solve (GameState state, Hand hand){

    }

}
