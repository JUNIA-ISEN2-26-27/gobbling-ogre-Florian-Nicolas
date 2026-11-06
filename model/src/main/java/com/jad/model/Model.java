
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
        // À compléter selon la correspondance de ForestType.
    }
}
