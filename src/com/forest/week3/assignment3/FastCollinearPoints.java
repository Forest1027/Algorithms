package com.forest.week3.assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class FastCollinearPoints {
    private LineSegment[] lineSegments;

    // finds all line segments containing 4 or more points
    public FastCollinearPoints(Point[] points) {
        if (points == null || points.length == 0) {
            throw new IllegalArgumentException();
        }
        checkNullEntries(points);
        Point[] pointsCopy = Arrays.copyOf(points, points.length);
        Arrays.sort(pointsCopy);
        checkDuplicatedEntries(pointsCopy);
        ArrayList<LineSegment> lines = new ArrayList<>();
        ArrayList<String> cache = new ArrayList<>();
        for (int i = 0; i < pointsCopy.length; i++) {
            Arrays.sort(pointsCopy);
            Point[] collearPoints = new Point[4];
            Point pi = pointsCopy[i];
            Comparator<Point> comparator = pi.slopeOrder();
            Arrays.sort(pointsCopy, comparator);
            for (int j = 1; j < pointsCopy.length - 2; j++) {
                // points[0] is pi
                if (pi.slopeTo(pointsCopy[j]) == pi.slopeTo(pointsCopy[j + 1]) && pi.slopeTo(pointsCopy[j + 1]) == pi.slopeTo(pointsCopy[j + 2])) {
                    collearPoints[0] = pi;
                    collearPoints[1] = pointsCopy[j];
                    collearPoints[2] = pointsCopy[j + 1];
                    collearPoints[3] = pointsCopy[j + 2];
                    Arrays.sort(collearPoints);
                    String pointStr = collearPoints[0].toString() + collearPoints[3].toString();
                    if (cache.contains(pointStr)) {
                        break;
                    }
                    cache.add(pointStr);
                    lines.add(new LineSegment(collearPoints[0], collearPoints[3]));
                    break;
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