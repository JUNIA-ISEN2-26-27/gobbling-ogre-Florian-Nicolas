package com.jad.model;

public class F2 extends AbstractForest {

    public F2(int width, int height) {
        super(width, height);
    }

    @Override
    public int[] getX1X2Y1Y2() {
        return new int[]{0, width - 1, 1, height - 2};
    }

    @Override
    public int[] getXY(int x, int y) {
        if (y < 0 || y >= height) {
            return null;
        }

        x = Math.floorMod(x, width);

        return new int[]{x, y};
    }

    @Override
    public void imposeXY() {
        for (int x = 0; x < width; x++) {
            trees[0][x] = Tile.CHENE;
            trees[height - 1][x] = Tile.CHENE;
        }
    }
}
