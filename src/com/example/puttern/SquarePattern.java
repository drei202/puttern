package com.example.puttern;

public class SquarePattern implements Pattern {
    @Override
    public String build(char symbol) {
        return "*".repeat(9) + '\n' +
                "*       *\n".repeat(7) +
                "*".repeat(9) + '\n';
    }
}
