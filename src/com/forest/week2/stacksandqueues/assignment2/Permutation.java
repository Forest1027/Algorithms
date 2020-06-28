package com.forest.week2.stacksandqueues.assignment2;

import edu.princeton.cs.algs4.StdIn;

public class Permutation {
    public static void main(String[] args) {
        if (args.length > 0 && (args[0].matches("\\d*"))) {
            int k = Integer.parseInt(args[0]);
            RandomizedQueue<String> queue = new RandomizedQueue<>();
            while (StdIn.isEmpty()) {
                String string = StdIn.readString();
                System.out.println(string);
                queue.enqueue(string);

            }
            while (k > 0) {
                System.out.println(queue.dequeue());
                k--;
            }

        }
    }
}
