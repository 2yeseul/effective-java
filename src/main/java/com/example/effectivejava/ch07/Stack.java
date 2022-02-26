package com.example.effectivejava.ch07;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack<T> {
    private T[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = (T[]) new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public T _pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        // stack 에서 꺼내진 후, elements[size]는 다시 사용되지 않는다. 이 메모리들은 stack이 관리하는 메모리이기 때문에, null 처리를 통히
        // 참조 해제를 해주어야 한다.
        return elements[--size];
    }

    public T pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        T result = elements[--size];
        elements[size] = null; // 다 쓴 참조 해제
        return result;
    }

    public void push(T e) {
        ensureCapacity();
        elements[size++] = e;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

}
