package com.jad.model;

public enum Tile {

    EMPTY(true, '.'),
    CHENE(false, 'A'),
    ACACIA(false, 'B'),
    SAPIN(false, 'C');

    private final boolean passable;
    private final char sprite;

    Tile(boolean passable, char sprite) {
        this.passable = passable;
        this.sprite = sprite;
    }

    public boolean isPassable() {
        return passable;
    }

    public char getSprite() {
        return sprite;
    }

}