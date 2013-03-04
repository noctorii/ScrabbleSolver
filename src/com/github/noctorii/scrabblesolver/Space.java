package com.github.noctorii.scrabblesolver;

public class Space {
    ScoreMultiplier scoreMult;
    Tile tile;
    Coordinate coordinate;

    public Space (Coordinate coordinate){
        this.coordinate = coordinate;
    }

    public Space (Coordinate coordinate, Tile tile){
        this(coordinate);
    }

    public Space (Coordinate coordinate, Tile tile, ScoreMultiplier scoreMult){
        this(coordinate, tile);
        this.scoreMult = scoreMult;
    }

    public boolean setTile (Tile tile){
        if (tile == null)
            return false;
        else {
            this.tile = tile;
            return true;
        }
    }

    public Tile getTile(){
        return tile;
    }

    public ScoreMultiplier getScoreMult(){
        return scoreMult;
    }

    public void removeMultiplier(){
        scoreMult = null;
    }
}
