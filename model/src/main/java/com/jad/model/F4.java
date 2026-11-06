package com.jad.model;

public class F4 extends AbstractForest {

    public F4(int width, int height) {
        super(width, height);
    }

    @Override
    public int[] getX1X2Y1Y2() {
        return new int[]{0, width - 1, 0, height - 1};
    }

    @Override
    public int[] getXY(int x, int y) {
        x = Math.floorMod(x, width);
        y = Math.floorMod(y, height);

        return new int[]{x, y};
    }

    @Override
    public void imposeXY() {

    }
}
