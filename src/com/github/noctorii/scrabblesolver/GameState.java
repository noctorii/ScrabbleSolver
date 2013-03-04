package com.github.noctorii.scrabblesolver;

import java.awt.image.TileObserver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GameState {
    private Space[][] spaces;
    private Set<Space> tiles;

    public GameState (int width, int height){
        spaces = new Space[height][width];
        tiles = new HashSet<Space>();
        for (int x = 0; x < width; x++){
            for (int y = 0; y < height; y++){
                spaces[y][x] = new Space(new Coordinate(x,y));
            }
        }
    }

    public GameState (int width, int height, List<Space> spaces){
        this(width, height);
        for (Space space : spaces){
            int x = space.getCoordinate().getX();
            int y = space.getCoordinate().getY();
            this.spaces[y][x] = space;
            if (space.getTile() != null)
               tiles.add(space);
        }
    }

    public GameState (Space[][] spaces){
        this.spaces = spaces;
    }

    public Space getSpace (int x, int y){
        return spaces[y][x];
    }

    public void setSpace (int x, int y, Space space){
        if (tiles.contains(spaces[y][x]))
            tiles.remove(spaces[y][x]);
        spaces[y][x] = space;
        if (space.getTile() != null)
            tiles.add(space);
    }


    public Set<Space> getAnchors() {
        Set<Space> anchors = new HashSet<Space>();
        for (Space tile : tiles){
            int x = tile.getX();
            int y = tile.getY();
            //if there is at least one free space touching the tile
            if (tiles.contains(spaces[y+1][x]) || tiles.contains(spaces[y-1][x])
                    || tiles.contains(spaces[y][x+1]) || tiles.contains(spaces[y][x-1])){
                anchors.add(tile);
            }
        }
        return anchors;
    }
}
