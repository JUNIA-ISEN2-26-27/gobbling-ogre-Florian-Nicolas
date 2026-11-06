package com.jad.model;

public abstract class AbstractForest {

    protected Tile[][] trees;
    protected int width;
    protected int height;

    public AbstractForest(int width, int height) {
        this.width = width;
        this.height = height;
        this.trees = new Tile[height][width];

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                trees[y][x] = Tile.EMPTY;
            }
        }
    }

    public abstract int[] getX1X2Y1Y2();

    public abstract int[] getXY(int x, int y);

    public abstract void imposeXY();

    public Tile getTile(int x, int y) {
        int[] coordinates = getXY(x, y);

        if (coordinates == null) {
            return null;
        }

        return trees[coordinates[1]][coordinates[0]];
    }

    public void setTile(int x, int y, Tile tile) {
        int[] coordinates = getXY(x, y);

        if (coordinates != null) {
            trees[coordinates[1]][coordinates[0]] = tile;
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Tile[][] getTrees() {
        return trees;
    }
}