package com.forest.week2.stacksandqueues;

/**
 * Array implementation of a stack
 * Defect: Stack overflows when N exceeds capacity
 */
public class FixedCapacityStackOfStrings {
    private String[] s;
    private int N = 0;

    public FixedCapacityStackOfStrings(int capacity) {
        s = new String[capacity];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void push(String item) {
        s[N++] = item;
    }

    public String pop() {
        // this lead to loitering (holding a reference to an object when it is no longer needed)
        // return s[--N];
        String item = s[--N];
        s[N] = null;
        return item;
    }
}
