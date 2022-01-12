package com.example.effectivejava.ch03;

public class Singleton {
    public static final Singleton INSTANCE = new Singleton();

    private Singleton() {
        System.out.println("Hello");
    }
}
