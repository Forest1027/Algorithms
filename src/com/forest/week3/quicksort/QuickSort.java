package com.forest.week3.quicksort;

import edu.princeton.cs.algs4.StdRandom;

public class QuickSort {

    public static void sort(Comparable[] a) {
        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    private static int partition(Comparable[] a, int lo, int hi) {
        int i = lo, j = hi + 1;
        while (true) {
            // find item on left to swap
            while (less(a[++i], a[lo])) {
                if (i == hi) break;
            }

            // find item on right to swap
            while (less(a[lo], a[--j])) {
                if (j == lo) break;
            }

            // check if pointers cross
            if (i >= j) break;
            exch(a, i, j);
        }
        // swap with partitioning item
        exch(a, lo, j);
        // return index of item now known to be in place
        return j;
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) <= 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
