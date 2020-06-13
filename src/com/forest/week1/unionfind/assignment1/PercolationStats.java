package com.forest.week1.unionfind.assignment1;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;


public class PercolationStats {
    private static final double CONFIDENCE = 1.96;
    private final int trialNum;
    private final double[] results;

    // perform independent trials on an n-by-n grid
    public PercolationStats(int n, int trials) {
        if (trials <= 0) {
            throw new IllegalArgumentException();
        }
        trialNum = trials;
        results = new double[trialNum];
        while (trials > 0) {
            Percolation percolation = new Percolation(n);
            while (!percolation.percolates()) {
                int row = StdRandom.uniform(1, n + 1);
                int col = StdRandom.uniform(1, n + 1);
                percolation.open(row, col);
            }
            double result = (double) percolation.numberOfOpenSites() / (n * n);
            results[trialNum - trials] = result;
            trials--;
        }

    }

    // sample mean of percolation threshold
    public double mean() {
        return StdStats.mean(results);
    }

    // sample standard deviation of percolation threshold
    public double stddev() {
        return StdStats.stddev(results);
    }

    // low endpoint of 95% confidence interval
    public double confidenceLo() {
        return (mean() - CONFIDENCE * stddev() / Math.sqrt(trialNum));
    }

    // high endpoint of 95% confidence interval
    public double confidenceHi() {
        return (mean() + CONFIDENCE * stddev() / Math.sqrt(trialNum));
    }

    // test client (see below)
    public static void main(String[] args) {
        int gridSize = 10;
        int trialCount = 10;
        if (args.length >= 2) {
            gridSize = Integer.parseInt(args[0]);
            trialCount = Integer.parseInt(args[1]);
        }
        PercolationStats stat = new PercolationStats(gridSize, trialCount);
        StdOut.println("mean                    = " + stat.mean());
        StdOut.println("stddev                  = " + stat.stddev());
        System.out.println("95% confidence interval = " + "[" + stat.confidenceLo() + ", " + stat.confidenceHi() + "]");
    }
}
