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

    public Coordinate getCoordinate (){
        return coordinate;
    }

    public Tile getTile(){
        return tile;
    }

    public int getX(){
        return coordinate.getX();
    }

    public int getY(){
        return coordinate.getY();
    }

    public ScoreMultiplier getScoreMult(){
        return scoreMult;
    }

    public void removeMultiplier(){
        scoreMult = null;
    }
}
