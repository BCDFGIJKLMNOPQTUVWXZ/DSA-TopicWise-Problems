# Problem: Largest Subarray with 0 Sum  
**Platform:** GeeksforGeeks  
**Difficulty:** Medium  

## Problem Statement
Given an array `arr[]` containing both positive and negative integers, the task is to compute the **length of the largest subarray** that has a sum of `0`.

---

## Approach
### Key Observations:
1. **Cumulative Sum**: The sum of elements from the beginning of the array up to the current index.
2. **HashMap for Tracking**:  
   - Use a hashmap to store the cumulative sum and the first index where it occurs.  
   - If the cumulative sum is repeated at a later index, it indicates that the subarray between these indices has a sum of `0`.

---

### Steps:
1. **Initialize Variables**:
   - `sum` to store the cumulative sum.
   - `maxLen` to store the maximum length of a subarray with a sum of `0`.
   - A hashmap `map` to store the cumulative sum and its first occurrence index.
2. **Iterate Through the Array**:
   - Add the current element to `sum`.
   - If `sum` equals `0`, update `maxLen` to the current index + 1.
   - If `sum` exists in the hashmap, calculate the length of the subarray between the previous occurrence and the current index and update `maxLen`.
   - If `sum` does not exist in the hashmap, store it along with the current index.
3. **Return the Maximum Length**.

---
