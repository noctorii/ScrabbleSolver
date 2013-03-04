package com.github.noctorii.scrabblesolver;

import java.util.Iterator;
import java.util.Set;

public class Play implements Iterable<Space> {
    private int score;
    private Set<Space> play;

    public Play (){
        score = 0;
    }

    public boolean addMove(Tile tile, Space space) {
        boolean legal = space.setTile(tile);
        if (legal)
            play.add(space);
        return legal;
    }

    public int getScore(ScoringEngine scorer){
        if (score == 0)//if score hasn't yet been set, set it
            score = scorer.getScore(this);
        return score;
    }

    public Iterator<Space> iterator(){
        return play.iterator();
    }

}
