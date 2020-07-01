package com.forest.week2.elementarysorts;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[10];
        for (int i = 0; i < arr.length; i++) {
            Random random = new Random();
            arr[i] = random.nextInt(100);
        }
        Selection.sort(arr);
    }
}
