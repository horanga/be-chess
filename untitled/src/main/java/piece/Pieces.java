package org.example.piece;

public enum Pieces {

    BLACKPAWN("black", "P"),

    WHITEPAWN("white", "p");


    final String color;
    final String presentation;

    Pieces(String color, String presentation) {
        this.color = color;
        this.presentation = presentation;
    }
}
