package com.forest.week1.unionfind;

/**
 * Quick union - lazy approach
 * Data structure:
 * Integer array id[] of length N
 * Interpretation: id[i] is parent of i.
 * Root of i is id[id[id[...id[i]...]]].
 *
 * Defect:
 * Find too expensive(could be N array accesses)
 */
public class QuickUnionUF {
    private int[] id;
    public QuickUnionUF(int N){
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    private int root(int i){
        while (i!=id[i]){
            i = id[i];
        }
        return i;
    }

    public boolean connected(int p, int q){
        return root(p) == root(q);
    }

    public void union(int p, int q){
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }
}
