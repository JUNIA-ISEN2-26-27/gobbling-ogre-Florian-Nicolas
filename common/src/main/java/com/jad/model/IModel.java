
package com.jad.model;

public interface IModel<T> {

    T getForest();

    void generateForest(int width, int height, int type);
}
