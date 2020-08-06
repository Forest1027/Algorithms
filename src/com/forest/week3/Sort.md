# Merge Sort
- Idea:
    - Divide array into two halves.
    - Recursively sort each half.
    - Merge two halves.
- Analysis:
    - At most <img src="https://render.githubusercontent.com/render/math?math=O(NlogN)">
    - T(n)=T(n/2)+T(n/2)+(n-1) *eg. split+split+merge*; T(1) = 0; -> T(n) = nlogn-n+1

# Bottom-up Merge Sort
- Idea:
    - Pass through array, merging subarrays of size 1.
    - Repeat for subarrays of size 2, 4, 8, 16, ...
- No recursion needed

# Stability
- A stable sort preserves the relative order of items with equal keys
- Insertion sort and mergesort are stable. Selection sort and shellsort are not.
    - Insertion sort never move past each other.
    
# Quick Sort
- Idea:
    - Shuffle the array
    - Partition so that for some j,
        - entry a[j] is in place
        - no larger entry to the left of j
        - no smaller entry to the right of j
    - Sort each piece recursively
- Analysis:
    - Faster than merge sort
    - Best case: <img src="https://render.githubusercontent.com/render/math?math=O(NlogN)">
    - Worst case: <img src="https://render.githubusercontent.com/render/math?math=O(N^{2})">
    
# Duplicate Keys
- Merge Sort with duplicate keys: Between 1/2NlgN and NlgN compares.
- Quick Sort with duplicate keys: goes quadratic unless partitioning stops on equal keys.
    - Improvement: Stop scans on items equal to the partitioning item. NlgN
    - 3-way partitioning
        - less than, equal to, greater than

# System sorts
- Java system sorts
    - Use tuned quicksort for primitive types, tuned mergesort for objects
    - Because sorting objects requires stable sorting algorithm. Mergesort is stable and quicksort is not.
    - And Mergesort guarantees NlogN performance
    - Java uses quicksort for primitive types because quicksort is in-place and typically the fastest general-purpose sorting algorithm in practice.
    
# Summary
|         |inplace?   |stable?|worst |average|best |remarks|
| --------|----------| -----|-----|-----|-----|-----|
|selection|yes| |<img src="https://render.githubusercontent.com/render/math?math=N^{2}/2">|<img src="https://render.githubusercontent.com/render/math?math=N^{2}/2">|<img src="https://render.githubusercontent.com/render/math?math=N^{2}/2">|N exchanges|
|insertion|yes|yes|<img src="https://render.githubusercontent.com/render/math?math=N^{2}/2">|<img src="https://render.githubusercontent.com/render/math?math=N^{2}/4">|<img src="https://render.githubusercontent.com/render/math?math=N">|use for small N or partially ordered|
|shell|yes| |?|?|N|tight code, subquadratic|
|merge| |yes|NlgN|NlgN|NlgN|NlogN guarantee, stable|
|quick|yes| |<img src="https://render.githubusercontent.com/render/math?math=N^{2}/2">|2NlgN|NlgN|N log N probabilistic guarantee fastest in practice|
|3-way quick|yes| |<img src="https://render.githubusercontent.com/render/math?math=N^{2}">|2NlgN|N|improves quicksort in presence of duplicate keys|