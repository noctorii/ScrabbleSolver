package com.github.noctorii.scrabblesolver;

import java.util.Map;

public class ScoringEngine {
    private Map<Tile, Integer> scores;

    public ScoringEngine (Map<Tile, Integer> scores){
        this.scores = scores;
    }

    public int getScore(Play play) {
        int score = 0;
        int wordMult = 1;
        for (Space space : play){
            if (space.getScoreMult().isWordMult())
                wordMult *= space.getScoreMult().getMult();
            score += getScore(space);
        }
        return score*wordMult;
    }

    public int getScore (Space space) {
        int tileScore = getScore(space.getTile());
        //if it doesn't have a multiplier or if it has a word multiplier, return
        //just the score
        if (space.getScoreMult() == null || space.getScoreMult().isWordMult())
            return tileScore;
        else //it has a letter multiplier, so return letter score * multiplier
            return tileScore * space.getScoreMult().getMult();
    }

    public int getScore (Tile tile){
        return scores.get(tile);
    }
}
