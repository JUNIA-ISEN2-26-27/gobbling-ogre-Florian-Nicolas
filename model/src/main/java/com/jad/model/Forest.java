
package com.jad.model;

import java.awt.Point;

public interface Forest {

    int getHeight();

    int getWidth();

    Tile[][] getTiles();

    Tile getTile(Point point);
}
