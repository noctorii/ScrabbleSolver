package com.github.noctorii.scrabblesolver;

public class ScoreMultiplier {
    private int mult;
    private boolean isWordMult;

    public ScoreMultiplier (boolean isWordMult, int mult){
        this.isWordMult = isWordMult;
        this.mult = mult;
    }

    public boolean isWordMult(){
        return isWordMult;
    }

    public int getMult(){
        return mult;
    }
}
