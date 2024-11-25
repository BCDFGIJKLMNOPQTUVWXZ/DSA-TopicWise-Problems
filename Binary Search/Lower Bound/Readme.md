## Problem: Lower Bound in a Sorted Array 
**Platform:** Coding Ninja  
**Difficulty:** Easy 

## Problem Statement 
You are given an array `arr` sorted in non-decreasing order and a number `x`. You must return the index of the lower bound of `x`. 

### Note: 
1. For a sorted array `arr`, the `lower_bound` of a number `x` is defined as the smallest index `idx` such that the value `arr[idx]` is not less than `x`.
2. If all numbers are smaller than `x`, then `n` should be the `lower_bound` of `x`, where `n` is the size of the array.
3. Try to do this in O(log(n)).

### Approach  
To solve this problem efficiently, we can use Binary Search. This approach works by maintaining two pointers (low and high) and performing the following steps:

1. Initialize low = 0 and high = n (size of the array).
2. Perform binary search:
     If arr[mid] < x, move the low pointer to mid + 1.
     If arr[mid] >= x, move the high pointer to mid.
     The value of low after the loop will give us the index of the lower bound.
3. This ensures that we achieve O(log n) time complexity.
