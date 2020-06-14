package com.forest.week2.stacksandqueues;

public class ResizingArrayQueueOfStrings {
    private String[] s;
    private int head;
    private int tail;
    private int capacity;

    public ResizingArrayQueueOfStrings() {
        s = new String[1];
        capacity = 1;
    }

    public boolean isEmpty() {
        return head == tail;
    }

    public void enqueue(String item) {
        if (capacity <= tail + 1) {
            if (head != 0) {
                resetHead();
            }
            if (capacity <= tail - head + 1) {
                resize(2 * capacity);
            }
        }

        s[tail++] = item;
    }

    public String dequeue() {
        return s[head++];
    }

    private void resetHead() {
        int move = head;
        String[] copy = new String[capacity];
        for (int i = 0; i < tail - head + 1; i++) {
            copy[i] = s[i + head];
        }
        s = copy;
        head = head - move;
        tail = tail - move;
    }

    private void resize(int newCapacity) {
        String[] copy = new String[newCapacity];
        for (int i = 0; i < capacity; i++) {
            copy[i] = s[i];
        }
        capacity = newCapacity;
        s = copy;
    }

    public void printArray() {
        System.out.print("array: ");
        for (int i = head; i < tail; i++) {
            System.out.print(s[i] + " ");
        }
        System.out.println();
    }
}
