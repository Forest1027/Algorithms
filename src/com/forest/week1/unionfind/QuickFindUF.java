package com.forest.week1.unionfind;

/**
 * Quick find - eager approach
 * Data structure:
 * Integer array id[] of length N
 * Interpretation: p and q are connected iff they have the same id.
 *
 * Defect:
 * Union too expensive(N array accesses)
 */
public class QuickFindUF {
    private int[] id;

    public QuickFindUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    // Check if p and q have the same id.
    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    //To merge components containing p and q, change all entries whose id equals id[p] to id[q].
    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) {
                id[i] = qid;
            }
        }
    }
}
