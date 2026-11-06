package com.jad.model;

import java.util.HashMap;

public class AbstractFactoryForest implements FactoryForest{
    private final HashMap<ForestType, FactoryForest> factories;

    public AbstractFactoryForest(){
        this.factories = new HashMap<>();
        this.factories.put(ForestType.MAGIC, new FactoryHorizontalMagicForest());
        this.factories.put(ForestType.HORIZONTAL_MAGIC, new FactoryHorizontalMagicForest());
        this.factories.put(ForestType.VERTICAL_MAGIC, new FactoryHorizontalMagicForest());
        this.factories.put(ForestType.RECTANGLE, new FactoryHorizontalMagicForest());
    }

    @Override
    public Forest create(int width, int height, int density) {
        return this.factories.get(ForestType.MAGIC).create(width, height, density);
    }

    public Forest createForest(final ForestType forestType,final int width,final int height,final int density) {
        return switch (forestType){
            case MAGIC -> this.factories.get(ForestType.MAGIC).create(width,height, density);
            case HORIZONTAL_MAGIC -> this.factories.get(ForestType.HORIZONTAL_MAGIC).create(width,height, density);
            case VERTICAL_MAGIC -> this.factories.get(ForestType.VERTICAL_MAGIC).create(width,height, density);
            case RECTANGLE -> this.factories.get(ForestType.RECTANGLE).create(width,height, density);
        };
    }
}