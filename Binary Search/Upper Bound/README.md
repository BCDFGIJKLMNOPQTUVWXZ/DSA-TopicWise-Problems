# Problem: Upper Bound
**Platform:** Coding Ninja  
**Difficulty:** Easy

## Problem Statement
You are given a sorted array ‘arr’ containing ‘n’ integers and an integer ‘x’. Implement the ‘upper bound’ function to find the index of the upper bound of 'x' in the array.

### Note:
1. The upper bound in a sorted array is the index of the first value that is greater than a given value. 
2. If the greater value does not exist, the answer is 'n', where 'n' is the size of the array.
3. Try to write a solution that runs in O(log n) time complexity.

## Approach
To find the upper bound efficiently, we can use Binary Search:

1. Initialize `low = 0`, `high = n - 1`, and `index = n`.
2. In the while loop, calculate `mid = low + (high - low) / 2`:
   - If `arr[mid] > x`, update `high = mid - 1` and set `index = mid`.
   - If `arr[mid] <= x`, set `low = mid + 1`.
3. When the loop ends, `index` will contain the upper bound of `x`, or `n` if no such element exists.

This approach runs in O(log n) time.

