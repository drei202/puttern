package com.example.puttern;

public class PyramidPattern implements Pattern {
    @Override
    public String build(char symbol) {
        StringBuilder builder = new StringBuilder();

        for (int i = 1; i < 10; i++) {
            builder.append(String.valueOf(symbol).repeat(i)).append('\n');
        }

        return builder.toString();
    }
}
