# Problem: Sum of All Odd Length Subarrays
**Platform:** LeetCode  
**Difficulty:** Easy  

## Problem Statement
Given an array of positive integers `arr`, return the sum of all possible odd-length subarrays of `arr`.  

A **subarray** is a contiguous subsequence of the array.

## Approach
This problem can be solved efficiently using mathematical observations instead of explicitly iterating over all subarrays:  

### Key Insight:
1. For each element at index `i` in the array, calculate the total number of subarrays in which it appears:
   - Subarrays starting before or at index `i`: `(i + 1)`
   - Subarrays ending after or at index `i`: `(n - i)`, where `n` is the length of the array.
   - Total subarrays containing `arr[i]` = `(i + 1) * (n - i)`

2. Out of these subarrays, half (approximately) are odd-length. The exact count is:  
   - `(((i + 1) * (n - i)) + 1) / 2`  

3. Multiply this count by the value of the element `arr[i]` to find its contribution to the sum of all odd-length subarrays.

4. Sum up the contributions from all elements in the array.

### Complexity Analysis:
- **Time Complexity**: O(n), since we iterate through the array once.
- **Space Complexity**: O(1), as we use only a few variables for calculations.
