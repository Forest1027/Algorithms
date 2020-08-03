# sorting Introduction
- Callbacks: 
    - a callback, also known as a "call-after" function, is any executable code that is passed as an argument to other code; that other code is expected to call back (execute) the argument at a given time. 
    - This mechanism allows the sorting of any type of data. 
    - In Java, we use interfaces to implement it.
    
# Selection Sort
- In iteration i, find index min of the smallest remaining entry.
- Swap a[i] and a[min].

# Insertion Sort
- In iteration i, swap a[i] with each larger entry to its left.
- Analysis:
   - Best case: array in ascending order, insertion sort makes N-1 compares and 0 changes.
   - Worst case: array in descending order, insertion sort makes <img src="https://render.githubusercontent.com/render/math?math=~0.5N^{2}"> compares and <img src="https://render.githubusercontent.com/render/math?math=~0.5N^{2}"> exchanges.
- Application:
   - Fast for partially sorted array.
   - An array is partially sorted if the number of inversions is <img src="https://render.githubusercontent.com/render/math?math=<= cN">.
   - An inversion is a pair of keys that are out of order.
   
# Shellsort
- Move entires more than one position at a time by h-sorting the array
- An h-sorted array is h interleaved sorted subsequences
- If a list is h-sorted, it means that the items separated by h positions from each other are in sorted order. However items which are closer together may not be. Shellsort sorts in this fashion using a bubblesort or insert sort or whatever to do a series of h-sorts, beginning with large values for h, and reducing h as the Shellsort proceeds.
- Analysis:
   - Worst case: compares number with 3x+1 increments is <img src="https://render.githubusercontent.com/render/math?math=O(N^{3/2})">.
- Useful in practice
   - Fast unless array size is huge.
   - Tiny, fixed footprint for code.
   - Hardware sort prototype.
   
# Shuffling
- Generate a random real number for each array entry, and sort the array.
- Knuth shuffle
   - In iteration i, pick integer r between 0 and i uniformly at random.
   - Swap a[i] and a[r]
- Best practices for shuffling
   - Use a hardware random-number generator that has passed both the FIPS 140-2 and the NIST statistical test suites.
   - Use an unbiased shuffling algorithm.
   - Continuously monitor statistic properties: hardware random-number generators are fragile and fail silently.

# Convex hull
- The convex hull of a set of N points is the smallest perimeter fence enclosing the points. 
- Steps:
   - Choose point p with smallest y-coordinate.
   - Sort points by polar angle with p.
   - Consider points in order; discard unless it creates a counter clockwise turn.