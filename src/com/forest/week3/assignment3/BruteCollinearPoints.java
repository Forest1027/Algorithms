package com.forest.week3.assignment3;

import java.util.ArrayList;
import java.util.Arrays;

public class BruteCollinearPoints {
    private LineSegment[] lineSegments;

    // finds all line segments containing 4 points
    public BruteCollinearPoints(Point[] points) {
        if (points == null || points.length == 0) {
            throw new IllegalArgumentException();
        }
        checkNullEntries(points);
        Point[] pointsCopy = Arrays.copyOf(points, points.length);
        Arrays.sort(pointsCopy);
        checkDuplicatedEntries(pointsCopy);
        ArrayList<LineSegment> lines = new ArrayList<>();
        ArrayList<String> cache = new ArrayList<>();
        for (int i = 0; i < pointsCopy.length - 3; i++) {
            Point pi = pointsCopy[i];
            Point[] colPoints = new Point[4];
            for (int j = i + 1; j < pointsCopy.length - 2; j++) {
                Point pj = pointsCopy[j];
                for (int k = j + 1; k < pointsCopy.length - 1; k++) {
                    Point pk = pointsCopy[k];
                    if (pi.slopeTo(pj) != pj.slopeTo(pk)) {
                        continue;
                    }
                    for (int m = k + 1; m < pointsCopy.length; m++) {
                        Point pl = pointsCopy[m];
                        if (pj.slopeTo(pk) != pk.slopeTo(pl)) {
                            continue;
                        }
                        colPoints[0] = pi;
                        colPoints[1] = pj;
                        colPoints[2] = pk;
                        colPoints[3] = pl;
                        Arrays.sort(colPoints);
                        String pointStr = colPoints[0].toString() + colPoints[3].toString();
                        if (!cache.contains(pointStr)) {
                            cache.add(pointStr);
                            lines.add(new LineSegment(colPoints[0], colPoints[3]));
                        }
                    }
                }
            }
        }
        lineSegments = lines.toArray(new LineSegment[lines.size()]);
    }

    private void checkDuplicatedEntries(Point[] points) {
        for (int i = 0; i < points.length - 1; i++) {
            if (points[i].compareTo(points[i + 1]) == 0) {
                throw new IllegalArgumentException("Duplicated entries in given points");
            }
        }
    }

    private void checkNullEntries(Point[] points) {
        for (int i = 0; i < points.length; i++) {
            if (points[i] == null) {
                throw new IllegalArgumentException("One of the point in points array is null");
            }
        }
    }

    // the number of line segments
    public int numberOfSegments() {
        return lineSegments.length;
    }

    // the line segments
    public LineSegment[] segments() {
        return lineSegments;
    }
}