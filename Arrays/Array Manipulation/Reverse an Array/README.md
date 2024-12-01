# Problem: Reverse an Array  
**Platform:** GeeksforGeeks  
**Difficulty:** Easy  

## Problem Statement
You are given an array of integers `arr[]`. Your task is to reverse the given array **in-place**, meaning without using extra space.

---

## Approach
This problem can be solved using the **Two Pointers** technique:

1. **Initialize Pointers**:
   - Use two pointers:
     - `low` starting at the beginning of the array.
     - `high` starting at the end of the array.

2. **Swap Elements**:
   - Swap the elements at positions `low` and `high`.
   - Move `low` one step forward and `high` one step backward.

3. **Terminate**:
   - Continue the process until `low` is greater than or equal to `high`.
