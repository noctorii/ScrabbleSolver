package com.github.noctorii.scrabblesolver;

import java.util.List;
import java.util.Set;

public class SolutionEngine {
    private ScoringEngine scoringEngine;
    private Set<String> words;
    private Set<String> subwords;

    public SolutionEngine (Iterable<String> words, ScoringEngine scoringEngine){
        this.scoringEngine = scoringEngine;
    }

    public Play solve (GameState state, Hand hand){
        Set<Space> anchors = state.getAnchors();
    }

}
