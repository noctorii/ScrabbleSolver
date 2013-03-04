package com.github.noctorii.scrabblesolver;

import java.awt.image.TileObserver;

public class GameState {
    private Tile[][] tiles;

    public GameState (int width, int height){
        tiles = new Tile[height][width];
    }

    public Tile getTile (int x, int y){
        return tiles[y][x];
    }

    public void setTile (int x, int y, Tile tile){
        tiles[y][x] = tile;
    }


}
