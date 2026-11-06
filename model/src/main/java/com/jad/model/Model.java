package com.jad.model;

public class Model implements IModel {

    private AbstractForest forest;
    private ForestFactory factory;

    public Model() {
        factory = new ForestFactory();
        forest = factory.createForest(20, 12, 1);
    }

    public AbstractForest getForest() {
        return forest;
    }

    @Override
    public void generateForest(int width, int height, int type) {

    }
}