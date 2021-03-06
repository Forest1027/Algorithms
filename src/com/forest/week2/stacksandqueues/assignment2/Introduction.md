# Queues
Coursera - Algorithms I - Assignment 2

Precision: [here](https://coursera.cs.princeton.edu/algs4/assignments/queues/specification.php)

The code this report reflects does not implement the next() method in RandomizedQueue right. I later implement this method using clone() from java.lang. However, it is forbidden to use. Still needs to try array implementation of this assignment. 

# Results

ASSESSMENT SUMMARY

Compilation:  PASSED
API:          PASSED

Spotbugs:     PASSED
PMD:          FAILED (1 warning)
Checkstyle:   FAILED (0 errors, 10 warnings)

Correctness:  34/45 tests passed
Memory:       48/50 tests passed
Timing:       143/193 tests passed

Aggregate score: 79.75%
[Compilation: 5%, API: 5%, Spotbugs: 0%, PMD: 0%, Checkstyle: 0%, Correctness: 60%, Memory: 10%, Timing: 20%]

ASSESSMENT DETAILS

The following files were submitted:
----------------------------------
3.9K Jun 28 19:30 Deque.java
 630 Jun 28 19:30 Permutation.java
4.8K Jun 28 19:30 RandomizedQueue.java


********************************************************************************
*  COMPILING                                                                    
********************************************************************************


% javac Deque.java
*-----------------------------------------------------------

% javac RandomizedQueue.java
*-----------------------------------------------------------

% javac Permutation.java
*-----------------------------------------------------------


================================================================


Checking the APIs of your programs.
*-----------------------------------------------------------
Deque:

RandomizedQueue:

Permutation:

================================================================


********************************************************************************
*  CHECKING STYLE AND COMMON BUG PATTERNS                                       
********************************************************************************


% spotbugs *.class
*-----------------------------------------------------------
L P UPM_UNCALLED_PRIVATE_METHOD UPM: The private method 'printDeque()' is never called.  At Deque.java:[lines 137-143]
L D DLS_DEAD_LOCAL_STORE_OF_NULL DLS: Assigns the value null to the local variable 'oldLast' but never reads the variable.  At Deque.java:[line 101]


================================================================


% pmd .
*-----------------------------------------------------------
Deque.java:136: Avoid unused private methods, such as 'printDeque()'. [UnusedPrivateMethod]
PMD ends with 1 warning.


================================================================


% checkstyle *.java
*-----------------------------------------------------------
[WARN] Deque.java:94:23: '{' is not preceded with whitespace. [WhitespaceAround]
[WARN] Deque.java:97:9: '}' is not followed by whitespace. [WhitespaceAround]
[WARN] Deque.java:97:10: 'else' is not followed by whitespace. [WhitespaceAround]
[WARN] Deque.java:97:10: 'else' is not preceded with whitespace. [WhitespaceAround]
[WARN] Deque.java:97:14: '{' is not preceded with whitespace. [WhitespaceAround]
[WARN] Deque.java:122:33: '{' is not preceded with whitespace. [WhitespaceAround]
[WARN] RandomizedQueue.java:56:17: '==' is not followed by whitespace. [WhitespaceAround]
[WARN] RandomizedQueue.java:56:17: '==' is not preceded with whitespace. [WhitespaceAround]
[WARN] RandomizedQueue.java:56:21: '{' is not preceded with whitespace. [WhitespaceAround]
[WARN] RandomizedQueue.java:134:33: '{' is not preceded with whitespace. [WhitespaceAround]
Checkstyle ends with 0 errors and 10 warnings.

% custom checkstyle checks for Deque.java
*-----------------------------------------------------------

% custom checkstyle checks for RandomizedQueue.java
*-----------------------------------------------------------
[INFO] RandomizedQueue.java:109: Using a loop in this method might be a performance bug. [Performance]

% custom checkstyle checks for Permutation.java
*-----------------------------------------------------------


================================================================


********************************************************************************
*  TESTING CORRECTNESS
********************************************************************************

Testing correctness of Deque
*-----------------------------------------------------------
Running 17 total tests.

Tests 1-6 make random calls to addFirst(), addLast(), removeFirst(),
removeLast(), isEmpty(), and size(). The probabilities of each
operation are (p1, p2, p3, p4, p5, p6), respectively.

Test 1: check random calls to addFirst(), addLast(), and size()
  *    5 random calls (0.4, 0.4, 0.0, 0.0, 0.0, 0.2)
  *   50 random calls (0.4, 0.4, 0.0, 0.0, 0.0, 0.2)
  *  500 random calls (0.4, 0.4, 0.0, 0.0, 0.0, 0.2)
  * 1000 random calls (0.4, 0.4, 0.0, 0.0, 0.0, 0.2)
==> passed

Test 2: check random calls to addFirst(), removeFirst(), and isEmpty()
  *    5 random calls (0.8, 0.0, 0.1, 0.0, 0.1, 0.0)
  *   50 random calls (0.8, 0.0, 0.1, 0.0, 0.1, 0.0)
  *  500 random calls (0.8, 0.0, 0.1, 0.0, 0.1, 0.0)
  * 1000 random calls (0.8, 0.0, 0.1, 0.0, 0.1, 0.0)
  *    5 random calls (0.1, 0.0, 0.8, 0.0, 0.1, 0.0)
  *   50 random calls (0.1, 0.0, 0.8, 0.0, 0.1, 0.0)
  *  500 random calls (0.1, 0.0, 0.8, 0.0, 0.1, 0.0)
  * 1000 random calls (0.1, 0.0, 0.8, 0.0, 0.1, 0.0)
==> passed

Test 3: check random calls to addFirst(), removeLast(), and isEmpty()
  *    5 random calls (0.8, 0.0, 0.0, 0.1, 0.1, 0.0)
  *   50 random calls (0.8, 0.0, 0.0, 0.1, 0.1, 0.0)
  *  500 random calls (0.8, 0.0, 0.0, 0.1, 0.1, 0.0)
  * 1000 random calls (0.8, 0.0, 0.0, 0.1, 0.1, 0.0)
  *    5 random calls (0.1, 0.0, 0.0, 0.8, 0.1, 0.0)
  *   50 random calls (0.1, 0.0, 0.0, 0.8, 0.1, 0.0)
  *  500 random calls (0.1, 0.0, 0.0, 0.8, 0.1, 0.0)
  * 1000 random calls (0.1, 0.0, 0.0, 0.8, 0.1, 0.0)
==> passed

Test 4: check random calls to addLast(), removeLast(), and isEmpty()
  *    5 random calls (0.0, 0.8, 0.0, 0.1, 0.1, 0.0)
  *   50 random calls (0.0, 0.8, 0.0, 0.1, 0.1, 0.0)
  *  500 random calls (0.0, 0.8, 0.0, 0.1, 0.1, 0.0)
  * 1000 random calls (0.0, 0.8, 0.0, 0.1, 0.1, 0.0)
  *    5 random calls (0.0, 0.1, 0.0, 0.8, 0.1, 0.0)
  *   50 random calls (0.0, 0.1, 0.0, 0.8, 0.1, 0.0)
  *  500 random calls (0.0, 0.1, 0.0, 0.8, 0.1, 0.0)
  * 1000 random calls (0.0, 0.1, 0.0, 0.8, 0.1, 0.0)
==> passed

Test 5: check random calls to addLast(), removeFirst(), and isEmpty()
  *    5 random calls (0.0, 0.8, 0.1, 0.0, 0.1, 0.0)
  *   50 random calls (0.0, 0.8, 0.1, 0.0, 0.1, 0.0)
  *  500 random calls (0.0, 0.8, 0.1, 0.0, 0.1, 0.0)
  * 1000 random calls (0.0, 0.8, 0.1, 0.0, 0.1, 0.0)
  *    5 random calls (0.0, 0.1, 0.8, 0.0, 0.1, 0.0)
  *   50 random calls (0.0, 0.1, 0.8, 0.0, 0.1, 0.0)
  *  500 random calls (0.0, 0.1, 0.8, 0.0, 0.1, 0.0)
  * 1000 random calls (0.0, 0.1, 0.8, 0.0, 0.1, 0.0)
==> passed

Test 6: check random calls to addFirst(), addLast(), removeFirst(),
        removeLast(), isEmpty(), and size()
  *    5 random calls (0.3, 0.3, 0.1, 0.1, 0.1, 0.1)
  *   50 random calls (0.3, 0.3, 0.1, 0.1, 0.1, 0.1)
  *  500 random calls (0.3, 0.3, 0.1, 0.1, 0.1, 0.1)
  * 1000 random calls (0.3, 0.3, 0.1, 0.1, 0.1, 0.1)
  *    5 random calls (0.1, 0.1, 0.3, 0.3, 0.1, 0.1)
  *   50 random calls (0.1, 0.1, 0.3, 0.3, 0.1, 0.1)
  *  500 random calls (0.1, 0.1, 0.3, 0.3, 0.1, 0.1)
  * 1000 random calls (0.1, 0.1, 0.3, 0.3, 0.1, 0.1)
==> passed

Test 7: check removeFirst() and removeLast() from an empty deque
  * removeFirst()
  * removeLast()
==> passed

Test 8: check whether two Deque objects can be created at the same time
  * n = 10
  * n = 1000
==> passed

Test 9: check iterator() after n calls to addFirst()
  * n = 10
  * n = 50
==> passed

Test 10: check iterator() after each of m intermixed calls to
         addFirst(), addLast(), removeFirst(), and removeLast()
  * m = 20
  * m = 50
  * m = 100
  * m = 1000
==> passed

Test 11: create two nested iterators to same deque
  * n = 10
  * n = 50
==> passed

Test 12: create two parallel iterators to same deque
==> passed

Test 13: create an iterator and check calls to next() and hasNext()
  * 10 consecutive calls to hasNext() on a deque of size 10
  * 10 consecutive calls to next() on a deque of size 10
  * 50 random intermixed calls to next() and hasNext() on a deque of size 10
  * 1000 random intermixed calls to next() and hasNext() on a deque of size 100
==> passed

Test 14: create Deque objects of different parameterized types
==> passed

Test 15: call addFirst() and addLast() with null argument
==> passed

Test 16: check that remove() and next() throw the specified exceptions in iterator()
==> passed

Test 17: call iterator() when the deque is empty
==> passed


Total: 17/17 tests passed!


================================================================
Testing correctness of RandomizedQueue
*-----------------------------------------------------------
Running 19 total tests.

Tests 1-4 make random calls to enqueue(), dequeue(), sample(),
isEmpty(), and size(). The probabilities of each operation are
(p1, p2, p3, p4, p5), respectively.

Test 1: check random calls to enqueue() and size()
  *    5 random calls (0.8, 0.0, 0.0, 0.0, 0.2)
  *   50 random calls (0.8, 0.0, 0.0, 0.0, 0.2)
  *  500 random calls (0.8, 0.0, 0.0, 0.0, 0.2)
  * 1000 random calls (0.8, 0.0, 0.0, 0.0, 0.2)
==> passed

Test 2: check random calls to enqueue() and dequeue()
  *    5 random calls (0.7, 0.1, 0.0, 0.1, 0.1)
  *   50 random calls (0.7, 0.1, 0.0, 0.1, 0.1)
  *  500 random calls (0.7, 0.1, 0.0, 0.1, 0.1)
  * 1000 random calls (0.7, 0.1, 0.0, 0.1, 0.1)
  *    5 random calls (0.1, 0.7, 0.0, 0.1, 0.1)
  *   50 random calls (0.1, 0.7, 0.0, 0.1, 0.1)
  *  500 random calls (0.1, 0.7, 0.0, 0.1, 0.1)
  * 1000 random calls (0.1, 0.7, 0.0, 0.1, 0.1)
==> passed

Test 3: check random calls to enqueue(), sample(), and size()
  *    5 random calls (0.8, 0.0, 0.1, 0.0, 0.1)
  *   50 random calls (0.8, 0.0, 0.1, 0.0, 0.1)
  *  500 random calls (0.8, 0.0, 0.1, 0.0, 0.1)
  * 1000 random calls (0.8, 0.0, 0.1, 0.0, 0.1)
  *    5 random calls (0.1, 0.0, 0.8, 0.0, 0.1)
  *   50 random calls (0.1, 0.0, 0.8, 0.0, 0.1)
  *  500 random calls (0.1, 0.0, 0.8, 0.0, 0.1)
  * 1000 random calls (0.1, 0.0, 0.8, 0.0, 0.1)
==> passed

Test 4: check random calls to enqueue(), dequeue(), sample(), isEmpty(), and size()
  *    5 random calls (0.6, 0.1, 0.1, 0.1, 0.1)
  *   50 random calls (0.6, 0.1, 0.1, 0.1, 0.1)
  *  500 random calls (0.6, 0.1, 0.1, 0.1, 0.1)
  * 1000 random calls (0.6, 0.1, 0.1, 0.1, 0.1)
  *    5 random calls (0.1, 0.6, 0.1, 0.1, 0.1)
  *   50 random calls (0.1, 0.6, 0.1, 0.1, 0.1)
  *  500 random calls (0.1, 0.6, 0.1, 0.1, 0.1)
  * 1000 random calls (0.1, 0.6, 0.1, 0.1, 0.1)
==> passed

Test 5: call dequeue() and sample() from an empty randomized queue
  * dequeue()
  * sample()
==> passed

Test 6: create multiple randomized queue objects at the same time
  * n = 10
  * n = 100
==> passed

Test 7: check that iterator() returns correct items after a sequence
        of n enqueue() operations
  * n = 10
  * n = 50
==> passed

Test 8: check that iterator() returns correct items after sequence
        of m enqueue() and dequeue() operations
  * m = 10
  * m = 1000
==> passed

Test 9: create two nested iterators over the same randomized queue
  * n = 10
    - two inner iterators return the same sequence of items
    - they should return the same set of items but in a
      different order

  * n = 50
    - two inner iterators return the same sequence of items
    - they should return the same set of items but in a
      different order

==> FAILED

Test 10: create two parallel iterators over the same randomized queue
  * n = 10
    - two iterators return the same sequence of values
    - they should return the same set of values but in a
      different order

  * n = 50
    - two iterators return the same sequence of values
    - they should return the same set of values but in a
      different order

==> FAILED

Test 11: create two iterators over different randomized queues
==> passed

Test 12: create an iterator and check calls to next() and hasNext()
  * 10 consecutive calls to hasNext() on a deque of size 10
  * 10 consecutive calls to next() on a deque of size 10
  * 50 random intermixed calls to next() and hasNext() on a deque of size 10
  * 1000 random intermixed calls to next() and hasNext() on a deque of size 100
==> passed

Test 13: create RandomizedQueue objects of different parameterized types
==> passed

Test 14: check randomness of sample() by enqueueing n items, repeatedly calling
         sample(), and counting the frequency of each item
  * n = 3, trials = 12000
  * n = 5, trials = 12000
  * n = 8, trials = 12000
  * n = 10, trials = 12000
==> passed

Test 15: check randomness of dequeue() by enqueueing n items, dequeueing n items,
         and seeing whether each of the n! permutations is equally likely
  * n = 2, trials = 12000
  * n = 3, trials = 12000
  * n = 4, trials = 12000
  * n = 5, trials = 12000
==> passed

Test 16: check randomness of iterator() by enqueueing n items, iterating over those
         n items, and seeing whether each of the n! permutations is equally likely
  * n = 2, trials = 12000

            value  observed  expected   2*O*ln(O/E)
        -------------------------------------------
               AB     12000    6000.0      16635.53
               BA         0    6000.0          0.00
        -------------------------------------------
                      12000   12000.0      16635.53
    
    G-statistic = 16635.53 (p-value = 0.000000, reject if p-value <= 0.0001)
    Note: a correct solution will fail this test by bad luck 1 time in 10,000.

  * n = 3, trials = 12000

            value  observed  expected   2*O*ln(O/E)
        -------------------------------------------
              ABC     12000    2000.0      43002.23
              ACB         0    2000.0          0.00
              BAC         0    2000.0          0.00
              BCA         0    2000.0          0.00
              CAB         0    2000.0          0.00
              CBA         0    2000.0          0.00
        -------------------------------------------
                      12000   12000.0      43002.23
    
    G-statistic = 43002.23 (p-value = 0.000000, reject if p-value <= 0.0001)
    Note: a correct solution will fail this test by bad luck 1 time in 10,000.

  * n = 4, trials = 12000

            value  observed  expected   2*O*ln(O/E)
        -------------------------------------------
             ABCD     12000     500.0      76273.29
             ABDC         0     500.0          0.00
             ACBD         0     500.0          0.00
             ACDB         0     500.0          0.00
             ADBC         0     500.0          0.00
             ADCB         0     500.0          0.00
             BACD         0     500.0          0.00
             BADC         0     500.0          0.00
             BCAD         0     500.0          0.00
             BCDA         0     500.0          0.00
             BDAC         0     500.0          0.00
             BDCA         0     500.0          0.00
             CABD         0     500.0          0.00
             CADB         0     500.0          0.00
             CBAD         0     500.0          0.00
             CBDA         0     500.0          0.00
             CDAB         0     500.0          0.00
             CDBA         0     500.0          0.00
             DABC         0     500.0          0.00
             DACB         0     500.0          0.00
             DBAC         0     500.0          0.00
             DBCA         0     500.0          0.00
             DCAB         0     500.0          0.00
             DCBA         0     500.0          0.00
        -------------------------------------------
                      12000   12000.0      76273.29
    
    G-statistic = 76273.29 (p-value = 0.000000, reject if p-value <= 0.0001)
    Note: a correct solution will fail this test by bad luck 1 time in 10,000.

  * n = 5, trials = 12000

==> FAILED

Test 17: call enqueue() with a null argument
==> passed

Test 18: check that remove() and next() throw the specified exceptions in iterator()
==> passed

Test 19: call iterator() when randomized queue is empty
==> passed


Total: 16/19 tests passed!


================================================================
********************************************************************************
*  TESTING CORRECTNESS (substituting reference RandomizedQueue and Deque)
********************************************************************************

Testing correctness of Permutation
*-----------------------------------------------------------
Tests 1-5 call the main() function directly, resetting standard input
before each call.

Running 9 total tests.

Test 1a: check formatting for sample inputs from assignment specification
  % java Permutation 3 < distinct.txt


    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    TestPermutation.checkFormatting(TestPermutation.java:40)
    TestPermutation.test1a(TestPermutation.java:206)
    TestPermutation.main(TestPermutation.java:316)

  - student solution threw an exception
  - reference solution did not throw an exception

  % java Permutation 3 < distinct.txt


    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    TestPermutation.checkFormatting(TestPermutation.java:40)
    TestPermutation.test1a(TestPermutation.java:207)
    TestPermutation.main(TestPermutation.java:316)

  - student solution threw an exception
  - reference solution did not throw an exception

  % java Permutation 8 < duplicates.txt


    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    TestPermutation.checkFormatting(TestPermutation.java:40)
    TestPermutation.test1a(TestPermutation.java:208)
    TestPermutation.main(TestPermutation.java:316)

  - student solution threw an exception
  - reference solution did not throw an exception

==> FAILED

Test 1b: check formatting for other inputs
  % java Permutation 8 < mediumTale.txt


    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    TestPermutation.checkFormatting(TestPermutation.java:40)
    TestPermutation.test1b(TestPermutation.java:214)
    TestPermutation.main(TestPermutation.java:319)

  - student solution threw an exception
  - reference solution did not throw an exception

  % java Permutation 0 < distinct.txt
  [no output]

==> FAILED

Test 2: check that main() reads all data from standard input
  * filename = distinct.txt, k = 3

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    UtilCOS.consumesStdIn(UtilCOS.java:189)
    TestPermutation.checkConsumesStdIn(TestPermutation.java:52)
    TestPermutation.test2(TestPermutation.java:221)
    TestPermutation.main(TestPermutation.java:322)

  * filename = distinct.txt, k = 3

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    UtilCOS.consumesStdIn(UtilCOS.java:189)
    TestPermutation.checkConsumesStdIn(TestPermutation.java:52)
    TestPermutation.test2(TestPermutation.java:222)
    TestPermutation.main(TestPermutation.java:322)

  * filename = duplicates.txt, k = 8

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    UtilCOS.consumesStdIn(UtilCOS.java:189)
    TestPermutation.checkConsumesStdIn(TestPermutation.java:52)
    TestPermutation.test2(TestPermutation.java:223)
    TestPermutation.main(TestPermutation.java:322)

  * filename = mediumTale.txt, k = 8

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    UtilCOS.consumesStdIn(UtilCOS.java:189)
    TestPermutation.checkConsumesStdIn(TestPermutation.java:52)
    TestPermutation.test2(TestPermutation.java:224)
    TestPermutation.main(TestPermutation.java:322)

==> FAILED

Test 3a: check that main() prints each item from the sequence at most once
         (for inputs with no duplicate strings)
  * filename = distinct.txt, k = 3

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    TestPermutation.checkStringFrequencies(TestPermutation.java:74)
    TestPermutation.test3a(TestPermutation.java:232)
    TestPermutation.main(TestPermutation.java:325)

  * filename = distinct.txt, k = 1

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    TestPermutation.checkStringFrequencies(TestPermutation.java:74)
    TestPermutation.test3a(TestPermutation.java:233)
    TestPermutation.main(TestPermutation.java:325)

  * filename = distinct.txt, k = 9

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    TestPermutation.checkStringFrequencies(TestPermutation.java:74)
    TestPermutation.test3a(TestPermutation.java:234)
    TestPermutation.main(TestPermutation.java:325)

  * filename = permutation6.txt, k = 6

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    TestPermutation.checkStringFrequencies(TestPermutation.java:74)
    TestPermutation.test3a(TestPermutation.java:235)
    TestPermutation.main(TestPermutation.java:325)

  * filename = permutation10.txt, k = 10

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    TestPermutation.checkStringFrequencies(TestPermutation.java:74)
    TestPermutation.test3a(TestPermutation.java:236)
    TestPermutation.main(TestPermutation.java:325)

==> FAILED

Test 3b: check that main() prints each item from the sequence at most once
         (for inputs with duplicate strings)
  * filename = duplicates.txt, k = 8

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    TestPermutation.checkStringFrequencies(TestPermutation.java:74)
    TestPermutation.test3b(TestPermutation.java:244)
    TestPermutation.main(TestPermutation.java:328)

  * filename = duplicates.txt, k = 3

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    TestPermutation.checkStringFrequencies(TestPermutation.java:74)
    TestPermutation.test3b(TestPermutation.java:245)
    TestPermutation.main(TestPermutation.java:328)

  * filename = permutation8.txt, k = 6

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    TestPermutation.checkStringFrequencies(TestPermutation.java:74)
    TestPermutation.test3b(TestPermutation.java:246)
    TestPermutation.main(TestPermutation.java:328)

  * filename = permutation8.txt, k = 2

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    TestPermutation.checkStringFrequencies(TestPermutation.java:74)
    TestPermutation.test3b(TestPermutation.java:247)
    TestPermutation.main(TestPermutation.java:328)

  * filename = tinyTale.txt, k = 10

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    TestPermutation.checkStringFrequencies(TestPermutation.java:74)
    TestPermutation.test3b(TestPermutation.java:248)
    TestPermutation.main(TestPermutation.java:328)

==> FAILED

Test 3c: check that main() prints each item from the sequence at most once
         (for inputs with newlines)
  * filename = mediumTale.txt, k = 10

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    TestPermutation.checkStringFrequencies(TestPermutation.java:74)
    TestPermutation.test3c(TestPermutation.java:256)
    TestPermutation.main(TestPermutation.java:331)

  * filename = mediumTale.txt, k = 20

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    TestPermutation.checkStringFrequencies(TestPermutation.java:74)
    TestPermutation.test3c(TestPermutation.java:257)
    TestPermutation.main(TestPermutation.java:331)

  * filename = tale.txt, k = 10

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    TestPermutation.checkStringFrequencies(TestPermutation.java:74)
    TestPermutation.test3c(TestPermutation.java:259)
    TestPermutation.main(TestPermutation.java:331)

  * filename = tale.txt, k = 50

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    TestPermutation.checkStringFrequencies(TestPermutation.java:74)
    TestPermutation.test3c(TestPermutation.java:260)
    TestPermutation.main(TestPermutation.java:331)

==> FAILED

Test 4: check main() when k = 0
  * filename = distinct.txt, k = 0
  * filename = distinct.txt, k = 0
==> passed

Test 5a: check that permutations are uniformly random
         (for inputs with no duplicate strings)
  * filename = permutation4.txt, k = 1

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    TestPermutation.checkRandomnessOfPermutation(TestPermutation.java:161)
    TestPermutation.test5a(TestPermutation.java:278)
    TestPermutation.main(TestPermutation.java:337)

  * filename = permutation4.txt, k = 2

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    TestPermutation.checkRandomnessOfPermutation(TestPermutation.java:161)
    TestPermutation.test5a(TestPermutation.java:279)
    TestPermutation.main(TestPermutation.java:337)

  * filename = permutation4.txt, k = 3

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    TestPermutation.checkRandomnessOfPermutation(TestPermutation.java:161)
    TestPermutation.test5a(TestPermutation.java:280)
    TestPermutation.main(TestPermutation.java:337)

  * filename = permutation4.txt, k = 4

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    TestPermutation.checkRandomnessOfPermutation(TestPermutation.java:161)
    TestPermutation.test5a(TestPermutation.java:281)
    TestPermutation.main(TestPermutation.java:337)

  * filename = permutation6.txt, k = 2

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    TestPermutation.checkRandomnessOfPermutation(TestPermutation.java:161)
    TestPermutation.test5a(TestPermutation.java:282)
    TestPermutation.main(TestPermutation.java:337)

==> FAILED

Test 5b: check that permutations are uniformly random
         (for inputs with duplicate strings)
  * filename = permutation5.txt, k = 1

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    TestPermutation.checkRandomnessOfPermutation(TestPermutation.java:161)
    TestPermutation.test5b(TestPermutation.java:290)
    TestPermutation.main(TestPermutation.java:340)

  * filename = permutation5.txt, k = 2

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    TestPermutation.checkRandomnessOfPermutation(TestPermutation.java:161)
    TestPermutation.test5b(TestPermutation.java:291)
    TestPermutation.main(TestPermutation.java:340)

  * filename = permutation5.txt, k = 3

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    TestPermutation.checkRandomnessOfPermutation(TestPermutation.java:161)
    TestPermutation.test5b(TestPermutation.java:292)
    TestPermutation.main(TestPermutation.java:340)

  * filename = duplicates.txt, k = 3

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    TestPermutation.checkRandomnessOfPermutation(TestPermutation.java:161)
    TestPermutation.test5b(TestPermutation.java:293)
    TestPermutation.main(TestPermutation.java:340)

  * filename = permutation8.txt, k = 2

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    TestPermutation.checkRandomnessOfPermutation(TestPermutation.java:161)
    TestPermutation.test5b(TestPermutation.java:294)
    TestPermutation.main(TestPermutation.java:340)

==> FAILED

Total: 1/9 tests passed!


================================================================
********************************************************************************
*  TIMING (substituting reference RandomizedQueue and Deque)
********************************************************************************

Timing Permutation
*-----------------------------------------------------------
Running 23 total tests.

Test 1: count calls to methods in StdIn
  * java Permutation 5 < distinct.txt

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    TimePermutation.countCallsToStdIn(TimePermutation.java:61)
    TimePermutation.test1(TimePermutation.java:303)
    TimePermutation.main(TimePermutation.java:358)

  * java Permutation 10 < permutation10.txt

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    TimePermutation.countCallsToStdIn(TimePermutation.java:61)
    TimePermutation.test1(TimePermutation.java:304)
    TimePermutation.main(TimePermutation.java:358)

  * java Permutation 1 < mediumTale.txt

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    TimePermutation.countCallsToStdIn(TimePermutation.java:61)
    TimePermutation.test1(TimePermutation.java:305)
    TimePermutation.main(TimePermutation.java:358)

  * java Permutation 20 < tale.txt

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    TimePermutation.countCallsToStdIn(TimePermutation.java:61)
    TimePermutation.test1(TimePermutation.java:306)
    TimePermutation.main(TimePermutation.java:358)

  * java Permutation 100 < tale.txt

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    TimePermutation.countCallsToStdIn(TimePermutation.java:61)
    TimePermutation.test1(TimePermutation.java:307)
    TimePermutation.main(TimePermutation.java:358)

  * java Permutation 16412 < tale.txt

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    TimePermutation.countCallsToStdIn(TimePermutation.java:61)
    TimePermutation.test1(TimePermutation.java:308)
    TimePermutation.main(TimePermutation.java:358)

==> FAILED

Test 2: count calls to methods in Deque and RandomizedQueue
  * java Permutation 5 < distinct.txt

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    TimePermutation.countCallsToDequeAndRandomizedQueue(TimePermutation.java:140)
    TimePermutation.test2(TimePermutation.java:314)
    TimePermutation.main(TimePermutation.java:361)

  * java Permutation 10 < permutation10.txt

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    TimePermutation.countCallsToDequeAndRandomizedQueue(TimePermutation.java:140)
    TimePermutation.test2(TimePermutation.java:315)
    TimePermutation.main(TimePermutation.java:361)

  * java Permutation 1 < mediumTale.txt

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    TimePermutation.countCallsToDequeAndRandomizedQueue(TimePermutation.java:140)
    TimePermutation.test2(TimePermutation.java:316)
    TimePermutation.main(TimePermutation.java:361)

  * java Permutation 20 < tale.txt

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    TimePermutation.countCallsToDequeAndRandomizedQueue(TimePermutation.java:140)
    TimePermutation.test2(TimePermutation.java:317)
    TimePermutation.main(TimePermutation.java:361)

  * java Permutation 100 < tale.txt

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    TimePermutation.countCallsToDequeAndRandomizedQueue(TimePermutation.java:140)
    TimePermutation.test2(TimePermutation.java:318)
    TimePermutation.main(TimePermutation.java:361)

  * java Permutation 16412 < tale.txt

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    TimePermutation.countCallsToDequeAndRandomizedQueue(TimePermutation.java:140)
    TimePermutation.test2(TimePermutation.java:319)
    TimePermutation.main(TimePermutation.java:361)

==> FAILED

Test 3: count calls to methods in StdRandom
  * java Permutation 5 < distinct.txt

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    TimePermutation.countCallsToStdRandom(TimePermutation.java:225)
    TimePermutation.test3(TimePermutation.java:325)
    TimePermutation.main(TimePermutation.java:364)

  * java Permutation 10 < permutation10.txt

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    TimePermutation.countCallsToStdRandom(TimePermutation.java:225)
    TimePermutation.test3(TimePermutation.java:326)
    TimePermutation.main(TimePermutation.java:364)

  * java Permutation 1 < mediumTale.txt

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    TimePermutation.countCallsToStdRandom(TimePermutation.java:225)
    TimePermutation.test3(TimePermutation.java:327)
    TimePermutation.main(TimePermutation.java:364)

  * java Permutation 20 < tale.txt

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    TimePermutation.countCallsToStdRandom(TimePermutation.java:225)
    TimePermutation.test3(TimePermutation.java:328)
    TimePermutation.main(TimePermutation.java:364)

  * java Permutation 100 < tale.txt

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    TimePermutation.countCallsToStdRandom(TimePermutation.java:225)
    TimePermutation.test3(TimePermutation.java:329)
    TimePermutation.main(TimePermutation.java:364)

  * java Permutation 16412 < tale.txt

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    TimePermutation.countCallsToStdRandom(TimePermutation.java:225)
    TimePermutation.test3(TimePermutation.java:330)
    TimePermutation.main(TimePermutation.java:364)

==> FAILED

Test 4: Time main() with k = 5, for inputs containing n random strings

                    n  seconds
------------------------------

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    TimePermutation.timeMain(TimePermutation.java:265)
    TimePermutation.checkRunningTimeOfMain(TimePermutation.java:284)
    TimePermutation.test4(TimePermutation.java:336)
    TimePermutation.main(TimePermutation.java:367)

=> FAILED        1000 Infinity
   [ Most likely main() takes more than linear time. ]
==> 0/10 tests passed


Test 5: Time main() with k = 1000, for inputs containing n random strings

                    n  seconds
------------------------------

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    UtilCOS.execute(UtilCOS.java:159)
    UtilCOS.execute(UtilCOS.java:146)
    TimePermutation.timeMain(TimePermutation.java:265)
    TimePermutation.checkRunningTimeOfMain(TimePermutation.java:284)
    TimePermutation.test5(TimePermutation.java:341)
    TimePermutation.main(TimePermutation.java:370)

=> FAILED        1000 Infinity
   [ Most likely main() takes more than linear time. ]
==> 0/10 tests passed


Total: 0/23 tests passed!


================================================================



********************************************************************************
*  MEMORY
********************************************************************************

Analyzing memory of Permutation
*-----------------------------------------------------------
Running 2 total tests.

Test 1: check that only one Deque or RandomizedQueue object is created
  * filename = distinct.txt, n = 9, k = 1

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    MemoryOfPermutation.checkNumberOfObjects(MemoryOfPermutation.java:27)
    MemoryOfPermutation.test1(MemoryOfPermutation.java:157)
    MemoryOfPermutation.main(MemoryOfPermutation.java:198)

  * filename = distinct.txt, n = 9, k = 2

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    MemoryOfPermutation.checkNumberOfObjects(MemoryOfPermutation.java:27)
    MemoryOfPermutation.test1(MemoryOfPermutation.java:158)
    MemoryOfPermutation.main(MemoryOfPermutation.java:198)

  * filename = distinct.txt, n = 9, k = 4

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    MemoryOfPermutation.checkNumberOfObjects(MemoryOfPermutation.java:27)
    MemoryOfPermutation.test1(MemoryOfPermutation.java:159)
    MemoryOfPermutation.main(MemoryOfPermutation.java:198)

  * filename = tinyTale.txt, n = 12, k = 10

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    MemoryOfPermutation.checkNumberOfObjects(MemoryOfPermutation.java:27)
    MemoryOfPermutation.test1(MemoryOfPermutation.java:160)
    MemoryOfPermutation.main(MemoryOfPermutation.java:198)

  * filename = tale.txt, n = 138653, k = 50

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    MemoryOfPermutation.checkNumberOfObjects(MemoryOfPermutation.java:27)
    MemoryOfPermutation.test1(MemoryOfPermutation.java:161)
    MemoryOfPermutation.main(MemoryOfPermutation.java:198)

==> FAILED

Test 2: check that the maximum size of any Deque or RandomizedQueue object
        created is between k and n
  * filename = distinct.txt, n = 9, k = 1

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    MemoryOfPermutation.checkMaxSize(MemoryOfPermutation.java:63)
    MemoryOfPermutation.test2(MemoryOfPermutation.java:168)
    MemoryOfPermutation.main(MemoryOfPermutation.java:199)

  * filename = distinct.txt, n = 9, k = 2

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    MemoryOfPermutation.checkMaxSize(MemoryOfPermutation.java:63)
    MemoryOfPermutation.test2(MemoryOfPermutation.java:169)
    MemoryOfPermutation.main(MemoryOfPermutation.java:199)

  * filename = distinct.txt, n = 9, k = 4

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    MemoryOfPermutation.checkMaxSize(MemoryOfPermutation.java:63)
    MemoryOfPermutation.test2(MemoryOfPermutation.java:170)
    MemoryOfPermutation.main(MemoryOfPermutation.java:199)

  * filename = tinyTale.txt, n = 12, k = 10

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    MemoryOfPermutation.checkMaxSize(MemoryOfPermutation.java:63)
    MemoryOfPermutation.test2(MemoryOfPermutation.java:171)
    MemoryOfPermutation.main(MemoryOfPermutation.java:199)

  * filename = tale.txt, n = 138653, k = 5

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    MemoryOfPermutation.checkMaxSize(MemoryOfPermutation.java:63)
    MemoryOfPermutation.test2(MemoryOfPermutation.java:172)
    MemoryOfPermutation.main(MemoryOfPermutation.java:199)

  * filename = tale.txt, n = 138653, k = 50

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    MemoryOfPermutation.checkMaxSize(MemoryOfPermutation.java:63)
    MemoryOfPermutation.test2(MemoryOfPermutation.java:173)
    MemoryOfPermutation.main(MemoryOfPermutation.java:199)

  * filename = tale.txt, n = 138653, k = 500

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    MemoryOfPermutation.checkMaxSize(MemoryOfPermutation.java:63)
    MemoryOfPermutation.test2(MemoryOfPermutation.java:174)
    MemoryOfPermutation.main(MemoryOfPermutation.java:199)

  * filename = tale.txt, n = 138653, k = 5000

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    MemoryOfPermutation.checkMaxSize(MemoryOfPermutation.java:63)
    MemoryOfPermutation.test2(MemoryOfPermutation.java:175)
    MemoryOfPermutation.main(MemoryOfPermutation.java:199)

  * filename = tale.txt, n = 138653, k = 50000

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    MemoryOfPermutation.checkMaxSize(MemoryOfPermutation.java:63)
    MemoryOfPermutation.test2(MemoryOfPermutation.java:176)
    MemoryOfPermutation.main(MemoryOfPermutation.java:199)

==> FAILED

Test 3 (bonus): check that maximum size of any or Deque or RandomizedQueue object
                created is equal to k
  * filename = tale.txt, n = 138653, k = 5

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    MemoryOfPermutation.checkMaxSizeBonus(MemoryOfPermutation.java:116)
    MemoryOfPermutation.test3(MemoryOfPermutation.java:184)
    MemoryOfPermutation.main(MemoryOfPermutation.java:200)

  * filename = tale.txt, n = 138653, k = 50

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    MemoryOfPermutation.checkMaxSizeBonus(MemoryOfPermutation.java:116)
    MemoryOfPermutation.test3(MemoryOfPermutation.java:185)
    MemoryOfPermutation.main(MemoryOfPermutation.java:200)

  * filename = tale.txt, n = 138653, k = 500

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    MemoryOfPermutation.checkMaxSizeBonus(MemoryOfPermutation.java:116)
    MemoryOfPermutation.test3(MemoryOfPermutation.java:186)
    MemoryOfPermutation.main(MemoryOfPermutation.java:200)

  * filename = tale.txt, n = 138653, k = 5000

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    MemoryOfPermutation.checkMaxSizeBonus(MemoryOfPermutation.java:116)
    MemoryOfPermutation.test3(MemoryOfPermutation.java:187)
    MemoryOfPermutation.main(MemoryOfPermutation.java:200)

  * filename = tale.txt, n = 138653, k = 50000

    java.util.NoSuchElementException: randomized queue underflow

    RandomizedQueue.dequeue(RandomizedQueue.java:142)
    Permutation.main(Permutation.java:15)
    MemoryOfPermutation.checkMaxSizeBonus(MemoryOfPermutation.java:116)
    MemoryOfPermutation.test3(MemoryOfPermutation.java:188)
    MemoryOfPermutation.main(MemoryOfPermutation.java:200)

==> FAILED

Total: 0/2 tests passed!


================================================================



********************************************************************************
*  MEMORY
********************************************************************************

Analyzing memory of Deque
*-----------------------------------------------------------
For tests 1-4, the maximum amount of memory allowed for a Deque
containing n items is 48n + 192.

Running 48 total tests.

Test 1a-1i: total memory usage after inserting n items,
            where n is a power of 2

                 n        bytes
----------------------------------------------------------
=> passed       32         1576         
=> passed       64         3112         
=> passed      128         6184         
=> passed      256        12328         
=> passed      512        24616         
=> passed     1024        49192         
=> passed     2048        98344         
=> passed     4096       196648         
=> passed     8192       393256         
==> 9/9 tests passed

Memory: 48.00 n + 40.00   (R^2 = 1.000)


Test 2a-2i: Total memory usage after inserting n items,
            when n is one more than a power of 2.

                 n        bytes
----------------------------------------------------------
=> passed       33         1624         
=> passed       65         3160         
=> passed      129         6232         
=> passed      257        12376         
=> passed      513        24664         
=> passed     1025        49240         
=> passed     2049        98392         
=> passed     4097       196696         
=> passed     8193       393304         
==> 9/9 tests passed

Memory: 48.00 n + 40.00   (R^2 = 1.000)


Test 3a-3i: Total memory usage after inserting 2n-1 items, and then
            deleting n-1 items, when n is one more than a power of 2.

                 n        bytes
----------------------------------------------------------
=> passed       33         1624         
=> passed       65         3160         
=> passed      129         6232         
=> passed      257        12376         
=> passed      513        24664         
=> passed     1025        49240         
=> passed     2049        98392         
=> passed     4097       196696         
=> passed     8193       393304         
==> 9/9 tests passed

Memory: 48.00 n + 40.00   (R^2 = 1.000)


Test 4a-4e: Total memory usage after inserting n items,
            and then deleting all but one item
            (should not grow with n or be too large of a constant).

                 n        bytes
----------------------------------------------------------
=> passed       32           88         
=> passed       64           88         
=> passed      128           88         
=> passed      256           88         
=> passed      512           88         
=> passed     1024           88         
=> passed     2048           88         
=> passed     4096           88         
=> passed     8192           88         
==> 9/9 tests passed

Memory: 88.00   (R^2 = 1.000)


Test 5a-5e: Total memory usage of iterator after inserting n items
            (should not grow with n or be too large of a constant).

                 n        bytes
----------------------------------------------------------
=> passed       32           32         
=> passed       64           32         
=> passed      128           32         
=> passed      256           32         
=> passed      512           32         
=> passed     1024           32         
=> passed     2048           32         
=> passed     4096           32         
=> passed     8192           32         
==> 9/9 tests passed

Memory: 32.00   (R^2 = 1.000)


Test 6a: Insert n strings; delete them one at a time, checking for
         loitering after each deletion. The probabilities of addFirst()
         and addLast() are (p1, p2), respectively. The probabilities of
         removeFirst() and removeLast() are (q1, q2), respectively.
  * 100 random insertions (1.0, 0.0) and 100 random deletions (1.0, 0.0)
  * 100 random insertions (1.0, 0.0) and 100 random deletions (0.0, 1.0)
  * 100 random insertions (0.0, 1.0) and 100 random deletions (1.0, 0.0)
  * 100 random insertions (0.0, 1.0) and 100 random deletions (0.0, 1.0)
  * 100 random insertions (0.5, 0.5) and 100 random deletions (0.5, 0.5)
==> passed

Test 6b: Perform random operations, checking for loitering after
         each operation. The probabilities of addFirst(), addLast(),
         removeFirst(), and removeLast() are (p1, p2, p3, p4),
         respectively.
  * 100 random operations (0.8, 0.0, 0.2, 0.0)
  * 100 random operations (0.8, 0.0, 0.0, 0.2)
  * 100 random operations (0.0, 0.8, 0.2, 0.0)
  * 100 random operations (0.0, 0.8, 0.0, 0.2)
  * 100 random operations (0.4, 0.4, 0.1, 0.1)
  * 100 random operations (0.2, 0.2, 0.3, 0.3)
==> passed

Test 7: worst-case constant memory allocated or de-allocated
        per deque operation?
  * 128 random operations
  * 256 random operations
  * 512 random operations
==> passed


Min observed memory for Deque: 48.00 n + 40.00   (R^2 = 1.000)
Max observed memory for Deque: 48.00 n + 40.00   (R^2 = 1.000)

Total: 48/48 tests passed!


================================================================



Analyzing memory of RandomizedQueue
*-----------------------------------------------------------
For Tests 1-5, the maximum amount of memory allowed for
a RandomizedQueue containing n items is 48n + 192.

For Test 6, the maximum amount of memory allowed for
a RandomizedQueue iterator over n items is 8n + 72.

Test 1a-1i: Total memory usage after inserting n items
            when n is a power of 2.

                 n        bytes
----------------------------------------------------------
=> passed       32         1576         
=> passed       64         3112         
=> passed      128         6184         
=> passed      256        12328         
=> passed      512        24616         
=> passed     1024        49192         
=> passed     2048        98344         
=> passed     4096       196648         
=> passed     8192       393256         
==> 9/9 tests passed

Memory: 48.00 n + 40.00   (R^2 = 1.000)


Test 2a-2i: Total memory usage after inserting n items,
            when n is one more than a power of 2.

                 n        bytes
----------------------------------------------------------
=> passed       33         1624         
=> passed       65         3160         
=> passed      129         6232         
=> passed      257        12376         
=> passed      513        24664         
=> passed     1025        49240         
=> passed     2049        98392         
=> passed     4097       196696         
=> passed     8193       393304         
==> 9/9 tests passed

Memory: 48.00 n + 40.00   (R^2 = 1.000)


Test 3a-3i: Total memory usage after inserting 2n-1 items, and then
            deleting n-1 items, when n is one more than a power of 2.

                 n        bytes
----------------------------------------------------------
=> passed       33         1624         
=> passed      

...

WARNING: the grading output was truncated due to excessive length.
Typically, this is because you have a method that has an unanticipated side effect
(such as printing to standard output or throwing an exception). A large amount of output
can also arise from failing many tests.