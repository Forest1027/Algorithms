package com.forest.week2.stacksandqueues;

public class Main {
    public static void main(String[] args) {
        ResizingArrayQueueOfStrings queue = new ResizingArrayQueueOfStrings();
        for (int i = 0; i < 10; i++) {
            System.out.println("enqueue: "+i);
            queue.enqueue(i+"");
            queue.printArray();
            if (i%2 == 0){
                System.out.println("dequeue: "+queue.dequeue());
                queue.printArray();
            }
        }
    }
}
