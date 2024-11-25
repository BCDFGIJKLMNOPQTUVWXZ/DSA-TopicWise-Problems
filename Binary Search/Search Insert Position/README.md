# Problem: Search Insert Position
**Platform:** Coding Ninja  
**Difficulty:** Easy

## Problem Statement
You are given a sorted array 'arr' of distinct values and a target value 'm'. You need to search for the index of the target value in the array.

### Note:
1. If the value is present in the array, return its index.
2. If the value is absent, determine the index where it would be inserted in the array while maintaining the sorted order.
3. The given array has distinct integers.
4. The given array may be empty.

## Approach
We can solve this problem using Binary Search:

1. **Initialize pointers:** Set `low = 0` and `high = arr.length - 1`.
2. **Binary Search Loop:** 
   - Calculate `mid = low + (high - low) / 2`.
   - If `arr[mid] >= m`, update `high = mid - 1` and set `index = mid`.
   - If `arr[mid] < m`, set `low = mid + 1`.
3. **Termination:** When the loop ends, `index` will hold the position where `m` is found, or the index where it should be inserted.

This approach runs in O(log n) time, ensuring efficiency even for large arrays.

