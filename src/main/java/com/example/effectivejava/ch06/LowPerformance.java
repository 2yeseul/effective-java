package com.example.effectivejava.ch06;

public class LowPerformance {
    static boolean isMatchesSomePattern(String value) {
        return value.matches("/[^A-Za-z0-9_]/");
    }
}
