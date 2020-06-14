package com.forest.week2.stacksandqueues;

/**
 * Linked-list implementation
 *
 * Performance:
 * Every operation takes constant time in the worst case.
 * A stack with N items uses ~40N bytes
 */
public class LinkedStackOfStrings {
    private Node first = null;

    private class Node {
        String item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void push(String item) {
        Node oldfirst = first;
        first.next = oldfirst;
        first.item = item;
    }

    public String pop() {
        String item = first.item;
        first = first.next;
        return item;
    }
}
