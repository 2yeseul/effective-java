package com.example.effectivejava.ch06;

import java.util.regex.Pattern;

public class HighPerformance {
    private static final Pattern SOME_PATTERN = Pattern.compile("/[^A-Za-z0-9_]/");

    static boolean isMatchesSomePattern(String value) {
        return SOME_PATTERN.matcher(value).matches();
    }
}