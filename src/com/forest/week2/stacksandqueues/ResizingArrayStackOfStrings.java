package com.forest.week2.stacksandqueues;

import java.util.Iterator;

/**
 * Resizing-array implementation
 * If the array if full, create a new array of twice the size and copy items. (repeated doubling)
 * Cost of inserting first N items. N + (2+4+8+...+N) ~ 3N (ignoring cost to create new array)
 * push(): double size of array s[] when array is full.
 * pop(): halve size of array s[] when array is one-quarter full.
 * pop when one- quarter full instead of one-half full because of thrashing
 * Thrashing: client is push and pop, push and pop. In this case, we will be double and cut in half again and again.
 * <p>
 * Performance:
 * Uses between 8N ~ 32 N bytes to represent a stack with N items
 * 8N when full, 32N when one-quarter full
 */
public class ResizingArrayStackOfStrings implements Iterable<String> {
    private String[] s;
    private int N = 0;

    public ResizingArrayStackOfStrings() {
        s = new String[1];
    }

    public void push(String item) {
        if (N == s.length) {
            resize(2 * s.length);
        }
        s[N++] = item;
    }

    private void resize(int capacity) {
        String[] copy = new String[capacity];
        for (int i = 0; i < N; i++) {
            copy[i] = s[i];
        }
        s = copy;
    }

    public String pop() {
        String item = s[--N];
        s[N] = null;
        if (N > 0 && N == s.length / 4) {
            resize(s.length / 2);
        }
        return item;
    }

    @Override
    public Iterator<String> iterator() {
        return null;
    }

    private class ReverseArrayIterator implements Iterator<String> {
        private int i = N;

        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public String next() {
            return s[--i];
        }
    }
}
