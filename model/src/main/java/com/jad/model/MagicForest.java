
package com.jad.model;

import java.awt.Point;

public class MagicForest extends AbstractForest {

    public MagicForest(int height, int width, Tile[][] tiles) {
        super(height, width, tiles);
    }

    @Override
    protected int wrapX(final int x) {
        return Math.floorMod(x, width);
    }

    @Override
    protected int wrapY(final int y) {
        return Math.floorMod(y, height);
    }

    @Override
    public Tile getTile(Point point) {
        int x = wrapX(point.x);
        int y = wrapY(point.y);

        return tiles[y][x];
    }
}
