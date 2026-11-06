package com.jad.model;
import java.util.Random;

public class ForestFactory {

    private final Random random = new Random();

    public AbstractForest createForest(int width, int height, int choice) {

        AbstractForest forest;

        switch (choice) {
            case 1:
                forest = new F1(width, height);
                break;

            case 2:
                forest = new F2(width, height);
                break;

            case 3:
                forest = new F3(width, height);
                break;

            case 4:
                forest = new F4(width, height);
                break;

            default:
                throw new IllegalArgumentException("Problem");
        }

        forest.imposeXY();

        int[] limits = forest.getX1X2Y1Y2();

        int x1 = limits[0];
        int x2 = limits[1];
        int y1 = limits[2];
        int y2 = limits[3];

        for (int y = y1; y <= y2; y++) {
            for (int x = x1; x <= x2; x++) {

                if (random.nextDouble() < 0.30) {
                    forest.setTile(x, y, createRandomTree());
                }
            }
        }

        return forest;
    }

    private Tile createRandomTree() {

        int choice = random.nextInt(3);

        switch (choice) {
            case 0:
                return Tile.CHENE;
            case 1:
                return Tile.ACACIA;
            default:
                return Tile.SAPIN;
        }
    }
}
