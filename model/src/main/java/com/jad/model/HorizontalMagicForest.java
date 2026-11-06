
package com.jad.model;

import java.awt.Point;

public class HorizontalMagicForest extends AbstractForest {

    public HorizontalMagicForest(int height, int width, Tile[][] tiles) {
        super(height, width, tiles);
    }

    @Override
    protected int wrapX(final int x) {
        return Math.floorMod(x, width);
    }

    @Override
    protected int wrapY(final int y) {
        if (y < 0 || y >= height) {
            return -1;
        }
        return y;
    }

    @Override
    public Tile getTile(Point point) {
        int x = wrapX(point.x);
        int y = wrapY(point.y);

        if (y == -1) {
            return null;
        }

        return tiles[y][x];
    }
}
