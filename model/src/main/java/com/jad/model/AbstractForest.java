
package com.jad.model;

import java.awt.Point;

public abstract class AbstractForest implements Forest {

    protected final int height;
    protected final int width;
    protected final Tile[][] tiles;

    public AbstractForest(int height, int width, Tile[][] tiles) {
        this.height = height;
        this.width = width;
        this.tiles = tiles;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    public Tile[][] getTiles() {
        return tiles;
    }

    @Override
    public Tile getTile(Point point) {
        int x = wrapX(point.x);
        int y = wrapY(point.y);

        return tiles[y][x];
    }

    protected abstract int wrapX(int x);

    protected abstract int wrapY(int y);
}
