package com.jad.model;

public interface IModel {

    AbstractForest getForest();

    void generateForest(int width, int height, int type);
}