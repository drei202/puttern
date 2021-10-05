package com.example.puttern;

public interface Pattern {
    String build(char symbol);

    default void draw(char symbol) {
        System.out.println(build(symbol));
    }
}
