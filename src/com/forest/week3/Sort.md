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