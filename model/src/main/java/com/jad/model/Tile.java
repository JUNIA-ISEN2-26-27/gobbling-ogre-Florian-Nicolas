package com.jad.model;

import java.util.Random;

public enum Tile {

    EMPTY(true, new Sprite('.', new char[][] {
            {' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' '}
    })),

    OAK(false, new Sprite('O', new char[][] {
            {' ', ' ', ',', ',', ' '},
            {' ', 'O', 'O', 'O', ' '},
            {'O', 'O', 'O', 'O', 'O'},
            {' ', ' ', '|', '|', ' '},
            {' ', ' ', '|', '|', ' '}
    })),

    ACACIA(false, new Sprite('A', new char[][] {
            {'A', ' ', ' ', ' ', 'A'},
            {' ', 'A', 'A', 'A', ' '},
            {'A', 'A', 'A', 'A', 'A'},
            {' ', ' ', '|', '|', ' '},
            {' ', ' ', '|', '|', ' '}
    })),

    FIR(false, new Sprite('F', new char[][] {
            {' ', ' ', 'F', ' ', ' '},
            {' ', 'F', 'F', 'F', ' '},
            {'F', 'F', 'F', 'F', 'F'},
            {' ', ' ', '|', '|', ' '},
            {' ', ' ', '|', '|', ' '}
    }));

    private final boolean walkable;
    private final Sprite sprite;

    private static final Random RANDOM = new Random();

    Tile(boolean walkable, Sprite sprite) {
        this.walkable = walkable;
        this.sprite = sprite;
    }

    public boolean isWalkable() {
        return walkable;
    }

    public Sprite getSprite() {
        return sprite;
    }

    public char getSpriteCharacter() {
        return sprite.getCharacter();
    }

    public static Tile getRandomNotWalkableTile() {
        Tile[] trees = {OAK, ACACIA, FIR};
        return trees[RANDOM.nextInt(trees.length)];
    }

    public static Tile getRandomTile(int density) {
        if (RANDOM.nextInt(100) < density) {
            return getRandomNotWalkableTile();
        }

        return EMPTY;
    }
}