
package com.jad.model;

public class Model implements IModel<AbstractForest> {

    private AbstractForest forest;
    private AbstractFactoryForest factory;

    public Model() {
        factory = new AbstractFactoryForest();
        forest = (AbstractForest) factory.create(50, 50, 1);
    }

    @Override
    public AbstractForest getForest() {
        return forest;
    }

    @Override
    public void generateForest(int width, int height, int type) {
        ForestType forestType = ForestType.values()[type];

        forest = (AbstractForest) factory.createForest(
                forestType, width, height, 30
        );
    }

    public void displayForest() {
        Tile[][] tiles = forest.getTiles();

        for (int row = 0; row < forest.getHeight(); row++) {
            for (int col = 0; col < forest.getWidth(); col++) {
                System.out.print(tiles[row][col].getSpriteCharacter() + " ");
            }
            System.out.println();
        }
    }
}
