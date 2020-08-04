# Collinear Points

Precision: [here](https://coursera.cs.princeton.edu/algs4/assignments/collinear/specification.php)

# Result

ASSESSMENT SUMMARY

Compilation:  PASSED
API:          PASSED

Spotbugs:     PASSED
PMD:          FAILED (4 warnings)
Checkstyle:   PASSED

Correctness:  33/41 tests passed
Memory:       1/1 tests passed
Timing:       41/41 tests passed

Aggregate score: 88.29%
[Compilation: 5%, API: 5%, Spotbugs: 0%, PMD: 0%, Checkstyle: 0%, Correctness: 60%, Memory: 10%, Timing: 20%]

ASSESSMENT DETAILS

The following files were submitted:
----------------------------------
2.9K Aug  4 16:41 BruteCollinearPoints.java
2.8K Aug  4 16:41 FastCollinearPoints.java
5.1K Aug  4 16:41 Point.java


********************************************************************************
*  COMPILING                                                                    
********************************************************************************


% javac Point.java
*-----------------------------------------------------------

% javac LineSegment.java
*-----------------------------------------------------------

% javac BruteCollinearPoints.java
*-----------------------------------------------------------

% javac FastCollinearPoints.java
*-----------------------------------------------------------


================================================================


Checking the APIs of your programs.
*-----------------------------------------------------------
Point:

BruteCollinearPoints:

FastCollinearPoints:

================================================================


********************************************************************************
*  CHECKING STYLE AND COMMON BUG PATTERNS                                       
********************************************************************************


% spotbugs *.class
*-----------------------------------------------------------
M D RV_RETURN_VALUE_IGNORED_NO_SIDE_EFFECT RV: Calls the method 'numberOfSegments()' but ignores its return value. The method, however, does not produce any effect other than returning a value.  At Point.java:[line 154]
M V EI_EXPOSE_REP EI: Returns a reference to the mutable object stored in the instance variable 'lineSegments', which exposes the internal representation of the class 'BruteCollinearPoints'. Instead, create a defensive copy of the object referenced by 'lineSegments' and return the copy.  At BruteCollinearPoints.java:[line 73]
M V EI_EXPOSE_REP EI: Returns a reference to the mutable object stored in the instance variable 'lineSegments', which exposes the internal representation of the class 'FastCollinearPoints'. Instead, create a defensive copy of the object referenced by 'lineSegments' and return the copy.  At FastCollinearPoints.java:[line 69]
L P SIC_INNER_SHOULD_BE_STATIC_ANON SIC: Should the anonymous inner class 'Point$1' be refactored into a named static nested class?  At Point.java:[line 98]
M C FCCD_FIND_CLASS_CIRCULAR_DEPENDENCY FCCD: Class Point has a circular dependency with other classes  At Point.java:[lines 6-160]
M C FCCD_FIND_CLASS_CIRCULAR_DEPENDENCY FCCD: Class Point has a circular dependency with other classes  At Point.java:[lines 6-160]


================================================================


% pmd .
*-----------------------------------------------------------
BruteCollinearPoints.java:5: The private instance (or static) variable 'lineSegments' can be made 'final'; it is initialized only in the declaration or constructor. [ImmutableField]
BruteCollinearPoints.java:73: Returning 'lineSegments' may expose an internal array. If so, return a defensive copy. [MethodReturnsInternalArray]
FastCollinearPoints.java:6: The private instance (or static) variable 'lineSegments' can be made 'final'; it is initialized only in the declaration or constructor. [ImmutableField]
FastCollinearPoints.java:69: Returning 'lineSegments' may expose an internal array. If so, return a defensive copy. [MethodReturnsInternalArray]
PMD ends with 4 warnings.


================================================================


% checkstyle *.java
*-----------------------------------------------------------

% custom checkstyle checks for Point.java
*-----------------------------------------------------------

% custom checkstyle checks for BruteCollinearPoints.java
*-----------------------------------------------------------

% custom checkstyle checks for FastCollinearPoints.java
*-----------------------------------------------------------


================================================================


********************************************************************************
*  TESTING CORRECTNESS
********************************************************************************

Testing correctness of Point
*-----------------------------------------------------------
Running 3 total tests.

Test 1: p.slopeTo(q)
  * positive infinite slope, where p and q have coordinates in [0, 500)
  * positive infinite slope, where p and q have coordinates in [0, 32768)
  * negative infinite slope, where p and q have coordinates in [0, 500)
  * negative infinite slope, where p and q have coordinates in [0, 32768)
  * positive zero     slope, where p and q have coordinates in [0, 500)
  * positive zero     slope, where p and q have coordinates in [0, 32768)
  * symmetric for random points p and q with coordinates in [0, 500)
  * symmetric for random points p and q with coordinates in [0, 32768)
  * transitive for random points p, q, and r with coordinates in [0, 500)
  * transitive for random points p, q, and r with coordinates in [0, 32768)
  * slopeTo(), where p and q have coordinates in [0, 500)
  * slopeTo(), where p and q have coordinates in [0, 32768)
  * slopeTo(), where p and q have coordinates in [0, 10)
  * throw a java.lang.NullPointerException if argument is null
==> passed

Test 2: p.compareTo(q)
  * reflexive, where p and q have coordinates in [0, 500)
  * reflexive, where p and q have coordinates in [0, 32768)
  * antisymmetric, where p and q have coordinates in [0, 500)
  * antisymmetric, where p and q have coordinates in [0, 32768)
  * transitive, where p, q, and r have coordinates in [0, 500)
  * transitive, where p, q, and r have coordinates in [0, 32768)
  * sign of compareTo(), where p and q have coordinates in [0, 500)
  * sign of compareTo(), where p and q have coordinates in [0, 32768)
  * sign of compareTo(), where p and q have coordinates in [0, 10)
  * throw java.lang.NullPointerException exception if argument is null
==> passed

Test 3: p.slopeOrder().compare(q, r)
  * reflexive, where p and q have coordinates in [0, 500)
  * reflexive, where p and q have coordinates in [0, 32768)
  * antisymmetric, where p, q, and r have coordinates in [0, 500)
  * antisymmetric, where p, q, and r have coordinates in [0, 32768)
  * transitive, where p, q, r, and s have coordinates in [0, 500)
  * transitive, where p, q, r, and s have coordinates in [0, 32768)
  * sign of compare(), where p, q, and r have coordinates in [0, 500)
  * sign of compare(), where p, q, and r have coordinates in [0, 32768)
  * sign of compare(), where p, q, and r have coordinates in [0, 10)
  * throw java.lang.NullPointerException if either argument is null
==> passed


Total: 3/3 tests passed!


================================================================
********************************************************************************
*  TESTING CORRECTNESS (substituting reference Point and LineSegment)
********************************************************************************

Testing correctness of BruteCollinearPoints
*-----------------------------------------------------------
Running 17 total tests.

The inputs satisfy the following conditions:
  - no duplicate points
  - no 5 (or more) points are collinear
  - all x- and y-coordinates between 0 and 32,767

Test 1: points from a file
  * filename = input8.txt
  * filename = equidistant.txt
  * filename = input40.txt
  * filename = input48.txt
==> passed

Test 2a: points from a file with horizontal line segments
  * filename = horizontal5.txt
  * filename = horizontal25.txt
==> passed

Test 2b: random horizontal line segments
  *  1 random horizontal line segment
  *  5 random horizontal line segments
  * 10 random horizontal line segments
  * 15 random horizontal line segments
==> passed

Test 3a: points from a file with vertical line segments
  * filename = vertical5.txt
  * filename = vertical25.txt
==> passed

Test 3b: random vertical line segments
  *  1 random vertical line segment
  *  5 random vertical line segments
  * 10 random vertical line segments
  * 15 random vertical line segments
==> passed

Test 4a: points from a file with no line segments
  * filename = random23.txt
  * filename = random38.txt
==> passed

Test 4b: random points with no line segments
  *  5 random points
  * 10 random points
  * 20 random points
  * 50 random points
==> passed

Test 5: points from a file with fewer than 4 points
  * filename = input1.txt
  * filename = input2.txt
  * filename = input3.txt
==> passed

Test 6: check for dependence on either compareTo() or compare()
        returning { -1, +1, 0 } instead of { negative integer,
        positive integer, zero }
  * filename = equidistant.txt
  * filename = input40.txt
  * filename = input48.txt
==> passed

Test 7: check for fragile dependence on return value of toString()
  * filename = equidistant.txt
    - number of entries in student   solution: 1
    - number of entries in reference solution: 4
    - 3 missing entries in student solution, including:
      '(30000, 0) -> (20000, 10000) -> (10000, 20000) -> (0, 30000)'


  * filename = input40.txt
    - number of entries in student   solution: 1
    - number of entries in reference solution: 4
    - 3 missing entries in student solution, including:
      '(2000, 29000) -> (4000, 29000) -> (22000, 29000) -> (28000, 29000)'


  * filename = input48.txt
    - number of entries in student   solution: 1
    - number of entries in reference solution: 6
    - 5 missing entries in student solution, including:
      '(1000, 26000) -> (9000, 26000) -> (11000, 26000) -> (18000, 26000)'



It is bad style to write code that depends on the particular format of
the output from the toString() method, especially if your reason for
doing so is to circumvent the public API (which intentionally does not
provide access to the x- and y-coordinates).

==> FAILED

Test 8: random line segments, none vertical or horizontal
  *  1 random line segment
  *  5 random line segments
  * 10 random line segments
  * 15 random line segments
==> passed

Test 9: random line segments
  *  1 random line segment
  *  5 random line segments
  * 10 random line segments
  * 15 random line segments
==> passed

Test 10: check that data type is immutable by testing whether each method
         returns the same value, regardless of any intervening operations
  * input8.txt
    - failed after 20 operations involving BruteCollinearPoints
    - first and last call to segments() returned different arrays

    - sequence of operations was:
          BruteCollinearPoints collinear = new BruteCollinearPoints(points);
          collinear.numberOfSegments() -> 2
          collinear.numberOfSegments() -> 2
          collinear.numberOfSegments() -> 2
          mutate points[] array that was passed to constructor
          mutate points[] array that was passed to constructor
          mutate points[] array that was passed to constructor
          mutate points[] array that was passed to constructor
          collinear.numberOfSegments() -> 2
          mutate points[] array that was passed to constructor
          mutate points[] array that was passed to constructor
          collinear.numberOfSegments() -> 2
          mutate points[] array that was passed to constructor
          collinear.numberOfSegments() -> 2
          mutate points[] array that was passed to constructor
          collinear.segments()
          mutate array returned by last call to segments()
          mutate points[] array that was passed to constructor
          collinear.numberOfSegments() -> 2
          collinear.segments()

    - failed on trial 1 of 100

  * equidistant.txt
    - failed after 14 operations involving BruteCollinearPoints
    - first and last call to segments() returned different arrays

    - sequence of operations was:
          BruteCollinearPoints collinear = new BruteCollinearPoints(points);
          collinear.numberOfSegments() -> 4
          mutate points[] array that was passed to constructor
          collinear.numberOfSegments() -> 4
          mutate points[] array that was passed to constructor
          mutate points[] array that was passed to constructor
          collinear.numberOfSegments() -> 4
          mutate points[] array that was passed to constructor
          mutate points[] array that was passed to constructor
          collinear.segments()
          collinear.numberOfSegments() -> 4
          mutate array returned by last call to segments()
          mutate array returned by last call to segments()
          collinear.segments()

    - failed on trial 1 of 100

==> FAILED

Test 11: check that data type does not mutate the constructor argument
  * input8.txt
  * equidistant.txt
==> passed

Test 12: numberOfSegments() is consistent with segments()
  * filename = input8.txt
  * filename = equidistant.txt
  * filename = input40.txt
  * filename = input48.txt
  * filename = horizontal5.txt
  * filename = vertical5.txt
  * filename = random23.txt
==> passed

Test 13: throws an exception if either the constructor argument is null
         or any entry in array is null
  * argument is null
  * Point[] of length 10, number of null entries = 1
  * Point[] of length 10, number of null entries = 10
  * Point[] of length 4, number of null entries = 1
  * Point[] of length 3, number of null entries = 1
  * Point[] of length 2, number of null entries = 1
  * Point[] of length 1, number of null entries = 1
==> passed

Test 14: check that the constructor throws an exception if duplicate points
  * 50 points
  * 25 points
  * 5 points
  * 4 points
  * 3 points
  * 2 points
==> passed


Total: 15/17 tests passed!


================================================================
Testing correctness of FastCollinearPoints
*-----------------------------------------------------------
Running 21 total tests.

The inputs satisfy the following conditions:
  - no duplicate points
  - all x- and y-coordinates between 0 and 32,767

Test 1: points from a file
  * filename = input8.txt
  * filename = equidistant.txt
  * filename = input40.txt
  * filename = input48.txt
  * filename = input299.txt
==> passed

Test 2a: points from a file with horizontal line segments
  * filename = horizontal5.txt
  * filename = horizontal25.txt
  * filename = horizontal50.txt
  * filename = horizontal75.txt
  * filename = horizontal100.txt
==> passed

Test 2b: random horizontal line segments
  *  1 random horizontal line segment
  *  5 random horizontal line segments
  * 10 random horizontal line segments
  * 15 random horizontal line segments
==> passed

Test 3a: points from a file with vertical line segments
  * filename = vertical5.txt
  * filename = vertical25.txt
  * filename = vertical50.txt
  * filename = vertical75.txt
  * filename = vertical100.txt
==> passed

Test 3b: random vertical line segments
  *  1 random vertical line segment
  *  5 random vertical line segments
  * 10 random vertical line segments
  * 15 random vertical line segments
==> passed

Test 4a: points from a file with no line segments
  * filename = random23.txt
  * filename = random38.txt
  * filename = random91.txt
  * filename = random152.txt
==> passed

Test 4b: random points with no line segments
  *  5 random points
  * 10 random points
  * 20 random points
  * 50 random points
==> passed

Test 5a: points from a file with 5 or more on some line segments
  * filename = input9.txt
    - segments() contains a subsegment of a segment in reference solution
    - student   segment 0: (1000, 1000) -> (4000, 4000)
    - reference segment 0: (1000, 1000) -> (2000, 2000) -> (3000, 3000) -> (4000, 4000) -> (5000, 5000) -> (6000, 6000) -> (7000, 7000) -> (8000, 8000) -> (9000, 9000)

    - number of entries in student   solution: 6
    - number of entries in reference solution: 1
    - 5 extra entries in student solution, including:
      '(1000, 1000) -> (8000, 8000)'


  * filename = input10.txt
    - segments() contains a subsegment of a segment in reference solution
    - student   segment 1: (1000, 18000) -> (3500, 28000)
    - reference segment 1: (1000, 18000) -> (2000, 22000) -> (3000, 26000) -> (3500, 28000) -> (4000, 30000)

    - number of entries in student   solution: 3
    - number of entries in reference solution: 2
    - 1 extra entry in student solution:
      '(1000, 18000) -> (3500, 28000)'


  * filename = input20.txt
    - segments() contains a subsegment of a segment in reference solution
    - student   segment 0: (4096, 20992) -> (7168, 20992)
    - reference segment 0: (4096, 20992) -> (5120, 20992) -> (6144, 20992) -> (7168, 20992) -> (8128, 20992)

    - number of entries in student   solution: 7
    - number of entries in reference solution: 5
    - 4 extra entries in student solution, including:
      '(4160, 29184) -> (7168, 29184)'

    - 2 missing entries in student solution, including:
      '(8192, 25088) -> (8192, 26112) -> (8192, 27136) -> (8192, 28160) -> (8192, 29184)'


  * filename = input50.txt
    - segments() contains a subsegment of a segment in reference solution
    - student   segment 1: (1000, 2000) -> (1000, 23000)
    - reference segment 5: (1000, 2000) -> (1000, 9000) -> (1000, 13000) -> (1000, 23000) -> (1000, 26000)

    - number of entries in student   solution: 8
    - number of entries in reference solution: 7
    - 2 extra entries in student solution, including:
      '(18000, 13000) -> (18000, 27000)'

    - 1 missing entry in student solution:
      '(1000, 2000) -> (1000, 9000) -> (1000, 13000) -> (1000, 23000) -> (1000, 26000)'


  * filename = input80.txt
    - segments() contains a subsegment of a segment in reference solution
    - student   segment 9: (2000, 6000) -> (17000, 21000)
    - reference segment 17: (2000, 6000) -> (5000, 9000) -> (9000, 13000) -> (17000, 21000) -> (25000, 29000) -> (27000, 31000)

    - number of entries in student   solution: 33
    - number of entries in reference solution: 31
    - 8 extra entries in student solution, including:
      '(0, 23000) -> (26000, 23000)'

    - 6 missing entries in student solution, including:
      '(26000, 13000) -> (26000, 16000) -> (26000, 22000) -> (26000, 23000)'


  * filename = input300.txt
    - segments() contains a subsegment of a segment in reference solution
    - student   segment 4: (7300, 10050) -> (7300, 25700)
    - reference segment 5: (7300, 10050) -> (7300, 10450) -> (7300, 17000) -> (7300, 25700) -> (7300, 31650)

    - number of entries in student   solution: 7
    - number of entries in reference solution: 6
    - 1 extra entry in student solution:
      '(7300, 10050) -> (7300, 25700)'


  * filename = inarow.txt
    - segments() contains a subsegment of a segment in reference solution
    - student   segment 0: (0, 0) -> (15000, 0)
    - reference segment 1: (0, 0) -> (5000, 0) -> (10000, 0) -> (15000, 0) -> (20000, 0) -> (25000, 0) -> (30000, 0)

    - number of entries in student   solution: 14
    - number of entries in reference solution: 5
    - 10 extra entries in student solution, including:
      '(30000, 0) -> (19000, 27500)'

    - 1 missing entry in student solution:
      '(0, 0) -> (5000, 0) -> (10000, 0) -> (15000, 0) -> (20000, 0) -> (25000, 0) -> (30000, 0)'


==> FAILED

Test 5b: points from a file with 5 or more on some line segments
  * filename = kw1260.txt
    - segments() contains a subsegment of a segment in reference solution
    - student   segment 0: (16454, 121) -> (16613, 1177)
    - reference segment 253: (16454, 121) -> (16507, 473) -> (16560, 825) -> (16613, 1177) -> (16666, 1529)

    - number of entries in student   solution: 525
    - number of entries in reference solution: 288
    - 351 extra entries in student solution, including:
      '(12652, 30395) -> (14236, 30449)'

    - 114 missing entries in student solution, including:
      '(12652, 30395) -> (13180, 30413) -> (13708, 30431) -> (14236, 30449) -> (14764, 30467)'


  * filename = rs1423.txt
==> FAILED

Test 6: points from a file with fewer than 4 points
  * filename = input1.txt
  * filename = input2.txt
  * filename = input3.txt
==> passed

Test 7: check for dependence on either compareTo() or compare()
        returning { -1, +1, 0 } instead of { negative integer,
        positive integer, zero }
  * filename = equidistant.txt
  * filename = input40.txt
  * filename = input48.txt
  * filename = input299.txt
==> passed

Test 8: check for fragile dependence on return value of toString()
  * filename = equidistant.txt
    - number of entries in student   solution: 1
    - number of entries in reference solution: 4
    - 3 missing entries in student solution, including:
      '(30000, 0) -> (20000, 10000) -> (10000, 20000) -> (0, 30000)'


  * filename = input40.txt
    - number of entries in student   solution: 1
    - number of entries in reference solution: 4
    - 3 missing entries in student solution, including:
      '(2000, 29000) -> (4000, 29000) -> (22000, 29000) -> (28000, 29000)'


  * filename = input48.txt
    - number of entries in student   solution: 1
    - number of entries in reference solution: 6
    - 5 missing entries in student solution, including:
      '(1000, 26000) -> (9000, 26000) -> (11000, 26000) -> (18000, 26000)'



It is bad style to write code that depends on the particular format of
the output from the toString() method, especially if your reason for
doing so is to circumvent the public API (which intentionally does not
provide access to the x- and y-coordinates).

==> FAILED

Test 9: random line segments, none vertical or horizontal
  *  1 random line segment
  *  5 random line segments
  * 25 random line segments
  * 50 random line segments
  * 100 random line segments
==> passed

Test 10: random line segments
  *  1 random line segment
  *  5 random line segments
  * 25 random line segments
  * 50 random line segments
  * 100 random line segments
==> passed

Test 11: random distinct points in a given range
  * 5 random points in a 10-by-10 grid
  * 10 random points in a 10-by-10 grid
    - segments() contains a subsegment of a segment in reference solution
    - student   segment 0: (4, 1) -> (8, 5)
    - reference segment 0: (4, 1) -> (6, 3) -> (7, 4) -> (8, 5) -> (9, 6)

    - number of entries in student   solution: 2
    - number of entries in reference solution: 1
    - 1 extra entry in student solution:
      '(4, 1) -> (8, 5)'


    - failed on trial 15 of 500
     10
         7     4
         6     3
         7     3
         2     2
         9     0
         9     6
         8     5
         6     5
         4     1
         0     1

  * 50 random points in a 10-by-10 grid
    - segments() contains a subsegment of a segment in reference solution
    - student   segment 0: (0, 0) -> (6, 0)
    - reference segment 12: (0, 0) -> (3, 0) -> (5, 0) -> (6, 0) -> (8, 0)

    - number of entries in student   solution: 26
    - number of entries in reference solution: 44
    - 12 extra entries in student solution, including:
      '(1, 9) -> (6, 9)'

    - 30 missing entries in student solution, including:
      '(0, 6) -> (1, 6) -> (2, 6) -> (4, 6)'


    - failed on trial 1 of 100

  * 90 random points in a 10-by-10 grid
    - segments() contains a subsegment of a segment in reference solution
    - student   segment 0: (0, 0) -> (3, 0)
    - reference segment 53: (0, 0) -> (1, 0) -> (2, 0) -> (3, 0) -> (4, 0) -> (5, 0) -> (7, 0) -> (8, 0) -> (9, 0)

    - number of entries in student   solution: 41
    - number of entries in reference solution: 131
    - 18 extra entries in student solution, including:
      '(0, 9) -> (8, 9)'

    - 108 missing entries in student solution, including:
      '(9, 6) -> (7, 7) -> (5, 8) -> (3, 9)'


    - failed on trial 1 of 50

  * 200 random points in a 50-by-50 grid
    - segments() contains a subsegment of a segment in reference solution
    - student   segment 1: (44, 0) -> (37, 21)
    - reference segment 11: (44, 0) -> (43, 3) -> (40, 12) -> (37, 21) -> (36, 24) -> (35, 27) -> (28, 48)

    - number of entries in student   solution: 107
    - number of entries in reference solution: 227
    - 30 extra entries in student solution, including:
      '(0, 48) -> (43, 48)'

    - 150 missing entries in student solution, including:
      '(2, 45) -> (6, 45) -> (10, 45) -> (12, 45) -> (19, 45) -> (30, 45)'


    - failed on trial 1 of 10

==> FAILED

Test 12: m*n points on an m-by-n grid
  * 3-by-3 grid
  * 4-by-4 grid
    - number of entries in student   solution: 5
    - number of entries in reference solution: 10
    - 5 missing entries in student solution, including:
      '(3, 0) -> (3, 1) -> (3, 2) -> (3, 3)'


  * 5-by-5 grid
    - segments() contains a subsegment of a segment in reference solution
    - student   segment 0: (0, 0) -> (3, 0)
    - reference segment 3: (0, 0) -> (1, 0) -> (2, 0) -> (3, 0) -> (4, 0)

    - number of entries in student   solution: 12
    - number of entries in reference solution: 16
    - 6 extra entries in student solution, including:
      '(0, 4) -> (3, 4)'

    - 10 missing entries in student solution, including:
      '(0, 1) -> (1, 2) -> (2, 3) -> (3, 4)'


  * 10-by-10 grid
    - segments() contains a subsegment of a segment in reference solution
    - student   segment 0: (0, 0) -> (3, 0)
    - reference segment 67: (0, 0) -> (1, 0) -> (2, 0) -> (3, 0) -> (4, 0) -> (5, 0) -> (6, 0) -> (7, 0) -> (8, 0) -> (9, 0)

    - number of entries in student   solution: 45
    - number of entries in reference solution: 154
    - 21 extra entries in student solution, including:
      '(0, 9) -> (8, 9)'

    - 130 missing entries in student solution, including:
      '(9, 6) -> (7, 7) -> (5, 8) -> (3, 9)'


  * 20-by-20 grid
    - segments() contains a subsegment of a segment in reference solution
    - student   segment 0: (0, 0) -> (3, 0)
    - reference segment 1203: (0, 0) -> (1, 0) -> (2, 0) -> (3, 0) -> (4, 0) -> (5, 0) -> (6, 0) -> (7, 0) -> (8, 0) -> (9, 0) -> (10, 0) -> (11, 0) -> (12, 0) -> (13, 0) -> (14, 0) -> (15, 0) -> (16, 0) -> (17, 0) -> (18, 0) -> (19, 0)

    - number of entries in student   solution: 153
    - number of entries in reference solution: 2446
    - 10 extra entries in student solution, including:
      '(0, 19) -> (18, 19)'

    - 2303 missing entries in student solution, including:
      '(19, 16) -> (17, 17) -> (15, 18) -> (13, 19)'


  * 5-by-4 grid
    - segments() contains a subsegment of a segment in reference solution
    - student   segment 0: (0, 0) -> (3, 0)
    - reference segment 2: (0, 0) -> (1, 0) -> (2, 0) -> (3, 0) -> (4, 0)

    - number of entries in student   solution: 9
    - number of entries in reference solution: 13
    - 4 extra entries in student solution, including:
      '(0, 3) -> (3, 3)'

    - 8 missing entries in student solution, including:
      '(4, 0) -> (4, 1) -> (4, 2) -> (4, 3)'


  * 6-by-4 grid
    - segments() contains a subsegment of a segment in reference solution
    - student   segment 0: (0, 0) -> (3, 0)
    - reference segment 3: (0, 0) -> (1, 0) -> (2, 0) -> (3, 0) -> (4, 0) -> (5, 0)

    - number of entries in student   solution: 12
    - number of entries in reference solution: 16
    - 6 extra entries in student solution, including:
      '(0, 3) -> (4, 3)'

    - 10 missing entries in student solution, including:
      '(5, 0) -> (5, 1) -> (5, 2) -> (5, 3)'


  * 10-by-4 grid
    - segments() contains a subsegment of a segment in reference solution
    - student   segment 0: (0, 0) -> (3, 0)
    - reference segment 12: (0, 0) -> (1, 0) -> (2, 0) -> (3, 0) -> (4, 0) -> (5, 0) -> (6, 0) -> (7, 0) -> (8, 0) -> (9, 0)

    - number of entries in student   solution: 16
    - number of entries in reference solution: 38
    - 6 extra entries in student solution, including:
      '(0, 3) -> (8, 3)'

    - 28 missing entries in student solution, including:
      '(9, 0) -> (9, 1) -> (9, 2) -> (9, 3)'


  * 15-by-4 grid
    - segments() contains a subsegment of a segment in reference solution
    - student   segment 0: (0, 0) -> (3, 0)
    - reference segment 30: (0, 0) -> (1, 0) -> (2, 0) -> (3, 0) -> (4, 0) -> (5, 0) -> (6, 0) -> (7, 0) -> (8, 0) -> (9, 0) -> (10, 0) -> (11, 0) -> (12, 0) -> (13, 0) -> (14, 0)

    - number of entries in student   solution: 21
    - number of entries in reference solution: 79
    - 6 extra entries in student solution, including:
      '(0, 3) -> (13, 3)'

    - 64 missing entries in student solution, including:
      '(14, 0) -> (14, 1) -> (14, 2) -> (14, 3)'


  * 25-by-4 grid
    - segments() contains a subsegment of a segment in reference solution
    - student   segment 0: (0, 0) -> (3, 0)
    - reference segment 92: (0, 0) -> (1, 0) -> (2, 0) -> (3, 0) -> (4, 0) -> (5, 0) -> (6, 0) -> (7, 0) -> (8, 0) -> (9, 0) -> (10, 0) -> (11, 0) -> (12, 0) -> (13, 0) -> (14, 0) -> (15, 0) -> (16, 0) -> (17, 0) -> (18, 0) -> (19, 0) -> (20, 0) -> (21, 0) -> (22, 0) -> (23, 0) -> (24, 0)

    - number of entries in student   solution: 31
    - number of entries in reference solution: 213
    - 6 extra entries in student solution, including:
      '(0, 3) -> (23, 3)'

    - 188 missing entries in student solution, including:
      '(24, 0) -> (24, 1) -> (24, 2) -> (24, 3)'


==> FAILED

Test 13: check that data type is immutable by testing whether each method
         returns the same value, regardless of any intervening operations
  * input8.txt
    - failed after 8 operations involving FastCollinearPoints
    - first and last call to segments() returned different arrays
    - sequence of operations was:
          FastCollinearPoints collinear = new FastCollinearPoints(points);
          mutate points[] array that was passed to constructor
          collinear.segments()
          mutate points[] array that was passed to constructor
          mutate points[] array that was passed to constructor
          collinear.numberOfSegments() -> 2
          mutate array returned by last call to segments()
          collinear.segments()
    - failed on trial 1 of 100

  * equidistant.txt
    - failed after 18 operations involving FastCollinearPoints
    - first and last call to segments() returned different arrays
    - sequence of operations was:
          FastCollinearPoints collinear = new FastCollinearPoints(points);
          mutate points[] array that was passed to constructor
          collinear.numberOfSegments() -> 4
          mutate points[] array that was passed to constructor
          collinear.numberOfSegments() -> 4
          collinear.numberOfSegments() -> 4
          mutate points[] array that was passed to constructor
          collinear.segments()
          collinear.segments()
          mutate points[] array that was passed to constructor
          collinear.numberOfSegments() -> 4
          mutate array returned by last call to segments()
          mutate array returned by last call to segments()
          mutate points[] array that was passed to constructor
          mutate array returned by last call to segments()
          collinear.numberOfSegments() -> 4
          mutate points[] array that was passed to constructor
          collinear.segments()
    - failed on trial 1 of 100

==> FAILED

Test 14: check that data type does not mutate the constructor argument
  * input8.txt
  * equidistant.txt
==> passed

Test 15: numberOfSegments() is consistent with segments()
  * filename = input8.txt
  * filename = equidistant.txt
  * filename = input40.txt
  * filename = input48.txt
  * filename = horizontal5.txt
  * filename = vertical5.txt
  * filename = random23.txt
==> passed

Test 16: throws an exception if either constructor argument is null
         or any entry in array is null
  * argument is null
  * Point[] of length 10, number of null entries = 1
  * Point[] of length 10, number of null entries = 10
  * Point[] of length 4, number of null entries = 1
  * Point[] of length 3, number of null entries = 1
  * Point[] of length 2, number of null entries = 1
  * Point[] of length 1, number of null entries = 1
==> passed

Test 17: check that the constructor throws an exception if duplicate points
  * 50 points
  * 25 points
  * 5 points
  * 4 points
  * 3 points
  * 2 points
==> passed


Total: 15/21 tests passed!


================================================================
********************************************************************************
*  MEMORY
********************************************************************************

Analyzing memory of Point
*-----------------------------------------------------------
Running 1 total tests.

The maximum amount of memory per Point object is 32 bytes.

Student memory = 24 bytes (passed)

Total: 1/1 tests passed!


================================================================



********************************************************************************
*  TIMING
********************************************************************************

Timing BruteCollinearPoints
*-----------------------------------------------------------
Running 10 total tests.

Test 1a-1e: Find collinear points among n random distinct points


                                                      slopeTo()
             n    time     slopeTo()   compare()  + 2*compare()        compareTo()
-----------------------------------------------------------------------------------------------
=> passed    16   0.00         910           0            910                   61         
=> passed    32   0.00        8990           0           8990                  155         
=> passed    64   0.00       79422           0          79422                  370         
=> passed   128   0.01      666750           0         666750                  850         
=> passed   256   0.03     5462270           0        5462270                 1989         
==> 5/5 tests passed

Test 2a-2e: Find collinear points among n/4 arbitrary line segments


                                                      slopeTo()
             n    time     slopeTo()   compare()  + 2*compare()        compareTo()
-----------------------------------------------------------------------------------------------
=> passed    16   0.00        1056           0           1056                   72         
=> passed    32   0.00        9760           0           9760                  180         
=> passed    64   0.00       82798           0          82798                  418         
=> passed   128   0.00      679776           0         679776                  963         
=> passed   256   0.03     5514608           0        5514608                 2172         
==> 5/5 tests passed

Total: 10/10 tests passed!


================================================================



Timing FastCollinearPoints
*-----------------------------------------------------------
Running 31 total tests.

Test 1a-1g: Find collinear points among n random distinct points


                                                      slopeTo()
             n    time     slopeTo()   compare()  + 2*compare()        compareTo()
-----------------------------------------------------------------------------------------------
=> passed    64   0.01        7808       18460          44728                18911         
=> passed   128   0.01       32000       89935         211870                90259         
=> passed   256   0.03      129536      416132         961800               416931         
=> passed   512   0.20      521216     1894978        4311172              1896811         
=> passed  1024   0.42     2091014     8515639       19122292              8528980         
=> passed  2048   1.44     8376458    38051147       84478752             38110057         
==> 6/6 tests passed

lg ratio(slopeTo() + 2*compare()) = lg (84478752 / 19122292) = 2.14
=> passed

==> 7/7 tests passed

Test 2a-2g: Find collinear points among the n points on an n-by-1 grid

                                                      slopeTo()
             n    time     slopeTo()   compare()  + 2*compare()        compareTo()
-----------------------------------------------------------------------------------------------
=> passed    64   0.00         256        4764           9784                 7451         
=> passed   128   0.00         512       17796          36104                23826         
=> passed   256   0.00        1024       68717         138458                81549         
=> passed   512   0.01        2048      269399         540846               296105         
=> passed  1024   0.02        4096     1065026        2134148              1120000         
=> passed  2048   0.04        8192     4231214        8470620              4343801         
=> passed  4096   0.16       16384    16859163       33734710             17088969         
==> 7/7 tests passed

lg ratio(slopeTo() + 2*compare()) = lg (33734710 / 8470620) = 1.99
=> passed

==> 8/8 tests passed

Test 3a-3g: Find collinear points among the n points on an n/4-by-4 grid

                                                      slopeTo()
             n    time     slopeTo()   compare()  + 2*compare()        compareTo()
-----------------------------------------------------------------------------------------------
=> passed    64   0.00         780       14906          30592                17087         
=> passed   128   0.00        1580       43854          89288                63479         
=> passed   256   0.01        3180      149618         302416               240430         
=> passed   512   0.02        6380      548156        1102692               924792         
=> passed  1024   0.06       12780     2087496        4187772              3605834         
=> passed  2048   0.21       25580     8122445       16270470             14171887         
=> passed  4096   0.80       51180    31990953       64033086             56075150         
==> 7/7 tests passed

lg ratio(slopeTo() + 2*compare()) = lg (64033086 / 16270470) = 1.98
=> passed

==> 8/8 tests passed

Test 4a-4g: Find collinear points among the n points on an n/8-by-8 grid

                                                      slopeTo()
             n    time     slopeTo()   compare()  + 2*compare()        compareTo()
-----------------------------------------------------------------------------------------------
=> passed    64   0.00        1184       18045          37274                19054         
=> passed   128   0.00        2384       75863         154110                85005         
=> passed   256   0.01        4784      232229         469242               337085         
=> passed   512   0.03        9584      854545        1718674              1324141         
=> passed  1024   0.12       19184     3260991        6541166              5242077         
=> passed  2048   0.39       38384    12699218       25436820             20854916         
=> passed  4096   1.48       76784    50043244      100163272             83075135         
==> 7/7 tests passed

lg ratio(slopeTo() + 2*compare()) = lg (100163272 / 25436820) = 1.98
=> passed

==> 8/8 tests passed

Total: 31/31 tests passed!


================================================================



