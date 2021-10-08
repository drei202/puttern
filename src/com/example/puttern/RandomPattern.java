package com.example.puttern;

public class RandomPattern implements Pattern {
    @Override
    public String build(char symbol) {
        StringBuilder builder = new StringBuilder();

        for (int i = 1; i < 10; i++) {
            builder.append("" + Math.random()).append('\n');
        }

        return builder.toString();
    }
}
