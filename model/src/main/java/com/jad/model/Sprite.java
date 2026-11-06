package com.jad.model;

public class Sprite {

    private final char character;
    private final char[][] image;

    public Sprite(char character, char[][] image) {
        this.character = character;
        this.image = image;
    }

    public char getCharacter() {
        return character;
    }

    public char[][] getImage() {
        return image;
    }
}