package com.forest.week1.unionfind.assignment1;

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

/**
 * Use virtual top and virtual bottom to lower the calls to WeightedQuickUnionUF
 * Connect every open site in first row to virtual top and every open site in last row to virtual bottom
 * Therefore, when checking ifFull or isPercolate, only need to check if the corresponding sites connect to the virtual top
 */
public class Percolation {
    private boolean[][] grid;
    private final WeightedQuickUnionUF unionUF;
    private final WeightedQuickUnionUF unionUFFull;
    private int currentOpen = 0;
    private final int gridSize;
    private final int virtualTop;
    private final int virtualBottom;

    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n cannot <= 0");
        }
        gridSize = n;
        grid = new boolean[gridSize][gridSize];
        int gridSquare = gridSize * gridSize;
        unionUF = new WeightedQuickUnionUF(gridSquare + 2);
        unionUFFull = new WeightedQuickUnionUF(gridSquare + 1);
        virtualBottom = gridSquare + 1;
        virtualTop = gridSquare;
    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col) {
        if (!withinBoundary(row, col)) {
            throw new IllegalArgumentException("open");
        }
        if (!isOpen(row, col)) {
            grid[row - 1][col - 1] = true;
            currentOpen++;
            int pos1D = xyTo1D(row, col) - 1;
            // connect first line to virtual top
            if (row == 1) {
                unionUF.union(virtualTop, pos1D);
                unionUFFull.union(virtualTop, pos1D);
            }
            // connect last line to virtual bottom
            if (row == gridSize) {
                unionUF.union(virtualBottom, pos1D);
            }
            // connect with neighbors
            if (withinBoundary(row + 1, col)) {
                connectToNeighbor(row + 1, col, pos1D);
            }
            if (withinBoundary(row - 1, col)) {
                connectToNeighbor(row - 1, col, pos1D);
            }
            if (withinBoundary(row, col - 1)) {
                connectToNeighbor(row, col - 1, pos1D);
            }
            if (withinBoundary(row, col + 1)) {
                connectToNeighbor(row, col + 1, pos1D);
            }
        }
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col) {
        if (!withinBoundary(row, col)) {
            throw new IllegalArgumentException("isOpen");
        }
        return grid[row - 1][col - 1];
    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col) {
        if (!withinBoundary(row, col)) {
            throw new IllegalArgumentException("isFull");
        }
        if (!isOpen(row, col)) {
            return false;
        }
        return unionUFFull.find(virtualTop) == unionUFFull.find(xyTo1D(row, col) - 1);
    }

    // returns the number of open sites
    public int numberOfOpenSites() {
        return currentOpen;
    }

    // does the system percolate?
    public boolean percolates() {
        return unionUF.find(virtualTop) == unionUF.find(virtualBottom);
    }

    private int xyTo1D(int row, int col) {
        return (row - 1) * gridSize + col;
    }

    private void connectToNeighbor(int row, int col, int pos1D) {
        if (isOpen(row, col)) {
            unionUF.union(xyTo1D(row, col) - 1, pos1D);
            unionUFFull.union(xyTo1D(row, col) - 1, pos1D);
        }
    }

    private boolean withinBoundary(int row, int col) {
        return row <= gridSize && row > 0 && col <= gridSize && col > 0;
    }


    // test client (optional)
    public static void main(String[] args) {
        int n = 10;
        Percolation percolation = new Percolation(n);
        System.out.println(percolation.numberOfOpenSites());

        while (!percolation.percolates()) {
            int row = StdRandom.uniform(1, 11);
            int col = StdRandom.uniform(1, 11);
            try {
                System.out.println("row:col=" + row + ":" + col);
                percolation.open(row, col);
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
            try {
                System.out.println("is open: " + percolation.isOpen(row, col));
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
            try {
                System.out.println("percolates: " + percolation.percolates());
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
            try {
                System.out.println("number of open sites: " + percolation.numberOfOpenSites());
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
            try {
                System.out.println("is full: " + percolation.isFull(row, col));
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
            System.out.println("------------------------------");
        }
    }
}