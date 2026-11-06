package com.jad.model;

public class Model implements IModel {

    private AbstractForest forest;
    private final ForestFactory factory;

    public Model() {
        factory = new ForestFactory();
        generateForest(50, 50, 1);
    }

    @Override
    public AbstractForest getForest() {
        return forest;
    }

    @Override
    public void generateForest(int width, int height, int type) {
        forest = factory.createForest(width, height, type);
    }
}