package com.jad.model;

public class F1 extends AbstractForest {

    public F1(int width, int height) {
        super(width, height);
    }

    @Override
    public int[] getX1X2Y1Y2() {
        return new int[]{1, width - 2, 1, height - 2};
    }

    @Override
    public int[] getXY(int x, int y) {
        if (x < 0 || x >= width || y < 0 || y >= height) {
            return null;
        }

        return new int[]{x, y};
    }

    @Override
    public void imposeXY() {
        for (int x = 0; x < width; x++) {
            trees[0][x] = Tile.CHENE;
            trees[height - 1][x] = Tile.CHENE;
        }

        for (int y = 0; y < height; y++) {
            trees[y][0] = Tile.CHENE;
            trees[y][width - 1] = Tile.CHENE;
        }
    }
}