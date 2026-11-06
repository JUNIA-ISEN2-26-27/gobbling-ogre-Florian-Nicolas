package com.jad.model;

public class F3 extends AbstractForest {

    public F3(int width, int height) {
        super(width, height);
    }

    @Override
    public int[] getX1X2Y1Y2() {
        return new int[]{1, width - 2, 0, height - 1};
    }

    @Override
    public int[] getXY(int x, int y) {
        if (x < 0 || x >= width) {
            return null;
        }

        y = Math.floorMod(y, height);

        return new int[]{x, y};
    }

    @Override
    public void imposeXY() {
        for (int y = 0; y < height; y++) {
            trees[y][0] = Tile.CHENE;
            trees[y][width - 1] = Tile.CHENE;
        }
    }
}