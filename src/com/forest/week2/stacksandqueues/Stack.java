package com.forest.week2.stacksandqueues;

import javax.swing.*;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Generic stack
 */
public class Stack<Item> implements Iterable<Item> {
    private Node first = null;

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {
        private Node current = first;

        public boolean hasNext() {
            return current != null;
        }

        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }

        public void remove() {

        }
    }

    private class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void push(Item item) {
        Node oldfirst = first;
        first.next = oldfirst;
        first.item = item;
    }

    public Item pop() {
        Item item = first.item;
        first = first.next;
        return item;
    }
}
