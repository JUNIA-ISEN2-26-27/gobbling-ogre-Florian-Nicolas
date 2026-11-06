
package com.jad.model;

import java.awt.Point;

public class VerticalMagicForest extends AbstractForest {

    public VerticalMagicForest(int height, int width, Tile[][] tiles) {
        super(height, width, tiles);
    }

    @Override
    protected int wrapX(final int x) {
        if (x < 0 || x >= width) {
            return -1;
        }
        return x;
    }

    @Override
    protected int wrapY(final int y) {
        return Math.floorMod(y, height);
    }

    @Override
    public Tile getTile(Point point) {
        int x = wrapX(point.x);
        int y = wrapY(point.y);

        if (x == -1) {
            return null;
        }

        return tiles[y][x];
    }
}
