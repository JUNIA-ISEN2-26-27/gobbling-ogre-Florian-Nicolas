package com.jad.model;

public class Model implements IModel {

    private AbstractForest forest;
    private AbstractFactoryForest factory;

    public Model() {
        factory = new AbstractFactoryForest();
        forest = (AbstractForest) factory.create(50, 50, 1);
    }

    @Override
    public void generateForest(int width, int height, int type) {
        ForestType forestType = ForestType.values()[type];

        forest = (AbstractForest) factory.createForest(
                forestType, width, height, 30
        );
    }

    @Override
    public void displayForest(int zoom) {
        if (zoom < 1) {
            throw new IllegalArgumentException(
                    "Le zoom doit être supérieur ou égal à 1"
            );
        }

        Tile[][] tiles = forest.getTiles();

        for (int row = 0; row < forest.getHeight(); row++) {
            for (int spriteRow = 0; spriteRow < 5; spriteRow++) {
                for (int repeatRow = 0; repeatRow < zoom; repeatRow++) {

                    for (int col = 0; col < forest.getWidth(); col++) {
                        Sprite sprite = tiles[row][col].getSprite();

                        for (int spriteCol = 0; spriteCol < 5; spriteCol++) {
                            for (int repeatCol = 0; repeatCol < zoom; repeatCol++) {
                                System.out.print(
                                        sprite.getImage()[spriteRow][spriteCol]
                                );
                            }
                        }

                        System.out.print(" ");
                    }

                    System.out.println();
                }
            }
        }
    }
}