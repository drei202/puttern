package com.example.puttern;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("This program prints a lot of beautiful patterns");
        System.out.println("Lets get started.");

        var patterns = new ArrayList<Pattern>();

        patterns.add(new PyramidPattern());
        patterns.add(new SquarePattern());

        for (int i = 0; i < patterns.size(); i++) {
            System.out.println(i+1+". Pattern:");
            patterns.get(i).draw('*');
        }
    }
}
