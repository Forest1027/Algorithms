package com.forest.week2.stacksandqueues.assignment2;

import edu.princeton.cs.algs4.StdRandom;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class RandomizedQueue<Item> implements Iterable<Item> {
    private Node first;
    private Node last;
    private int size;

    private class Node implements Cloneable {
        Item item;
        Node next;
        Node prev;

        public Node clone() throws CloneNotSupportedException {
            Node node = (Node) super.clone();

            if (next != null) {
                node.next = next.clone();
            }
            return node;
        }
    }

    // construct an empty randomized queue
    public RandomizedQueue() {
    }

    // is the randomized queue empty?
    public boolean isEmpty() {
        return this.size == 0;
    }

    // return the number of items on the randomized queue
    public int size() {
        return this.size;
    }

    // add the item
    public void enqueue(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Enqueue");
        }
        if (isEmpty()) {
            last = new Node();
            last.item = item;
            first = last;
        } else {
            Node oldLast = last;
            last = new Node();
            last.item = item;
            last.next = null;
            last.prev = oldLast;
            oldLast.next = last;
        }
        size++;
    }

    // remove and return a random item
    public Item dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("dequeue");
        }
        if (size == 1) {
            Item item = first.item;
            first = null;
            last = null;
            size--;
            return item;
        }
        int index = StdRandom.uniform(0, size());

        if (index == 0) {
            Node oldFirst = first;
            oldFirst.next.prev = null;
            Item item = first.item;
            first = first.next;
            size--;
            return item;
        } else if (index == size - 1) {
            Item item = last.item;
            Node oldLast = last;
            last = oldLast.prev;
            last.next = null;
            oldLast = null;
            size--;
            return item;
        } else {
            int count = 0;
            Node current = first;
            while (current != null) {
                if (count == index) {
                    Node prev = current.prev;
                    Node next = current.next;
                    prev.next = next;
                    next.prev = prev;
                    Item item = current.item;
                    current = null;
                    size--;
                    return item;
                }
                current = current.next;
                count++;
            }
        }
        return null;
    }

    // return a random item (but do not remove it)
    public Item sample() {
        if (isEmpty()) {
            throw new NoSuchElementException("sample");
        }
        int index = StdRandom.uniform(0, size());
        int count = 0;
        Node current = first;
        while (current != null) {
            if (count == index) {
                return current.item;
            }
            current = current.next;
            count++;
        }
        return null;
    }

    // return an independent iterator over items in random order
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item>, Cloneable {
        private Node copyFirst;
        private Node copyLast;
        private int copySize;

        public ListIterator() {
            try {
                copyFirst = first.clone();
                copyLast = last.clone();
                copySize = size;
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }

        }

        @Override
        public boolean hasNext() {
            return copySize != 0;
        }

        @Override
        public Item next() {
            if (copySize == 0) {
                throw new NoSuchElementException();
            }
            if (copySize == 1) {
                Item item = copyFirst.item;
                copyFirst = null;
                copyLast = null;
                copySize--;
                return item;
            }
            int index = StdRandom.uniform(0, copySize);

            if (index == 0) {
                Item item = copyFirst.item;
                copyFirst = copyFirst.next;
                copySize--;
                return item;
            } else if (index == copySize - 1) {
                Node current = copyFirst;
                while (current != null) {
                    if (current.next.next == null) {
                        Item item = current.next.item;
                        current.next = null;
                        copySize--;
                        return item;
                    }
                    current = current.next;
                }
                Item item = copyLast.item;
                copyLast = null;
                copySize--;
                return item;
            } else {
                int count = 0;
                Node current = copyFirst;
                while (current != null) {
                    Node currentNext = current.next;
                    if (count == index - 1) {
                        Item item = currentNext.item;
                        current.next = currentNext.next;
                        copySize--;
                        return item;
                    }
                    current = current.next;
                    count++;
                }
            }
            return null;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }
    }

    private void printRandomizedQueue() {
        System.out.print("RandomizedQueue:");
        Iterator<Item> it = this.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }

    // unit testing (required)

    public static void main(String[] args) {
        RandomizedQueue<Integer> queue = new RandomizedQueue<>();
        int count = 10;
        while (count > 0) {
            queue.enqueue(count);
            count--;
        }
        queue.printRandomizedQueue();
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.printRandomizedQueue();
        System.out.println(queue.sample());
        System.out.println(queue.sample());
        System.out.println(queue.sample());
        System.out.println(queue.sample());
    }
}
