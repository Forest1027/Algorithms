package com.forest.week2.elementarysorts;

public class Selection {
    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            System.out.print("Before: ");
            printArr(a);
            int min = i;
            for (int j = i + 1; j < N; j++) {
                System.out.println("i: " + i + "; j: " + j);
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            System.out.println("min index: "+min);
            exch(a, i, min);
            System.out.print("After: ");
            printArr(a);
        }
    }

    private static boolean less(Comparable v, Comparable w) {

        return v.compareTo(w) <= 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static void printArr(Comparable[] a) {
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("]");
        System.out.println();
    }
}
