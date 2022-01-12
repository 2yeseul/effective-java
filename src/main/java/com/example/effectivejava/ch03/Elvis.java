package com.example.effectivejava.ch03;

public class Elvis {
    private static final Elvis INSTANCE = new Elvis();

    private Elvis() {
        System.out.println("elvis class");
    }

    public static Elvis getInstance() {
        return INSTANCE;
    }
}
