# 📈 53. Maximum Subarray

- **Platform:** LeetCode
- **Difficulty:** Medium 🟠

---

## Problem Description 📄

Given an integer array `nums`, find the **subarray with the largest sum**, and return its **sum**.

---

## Example 🧩

### Example 1
**Input:**  
`nums = [-2,1,-3,4,-1,2,1,-5,4]`

**Output:**  
`6`

**Explanation:**  
The subarray `[4,-1,2,1]` has the largest sum `6`.

---

## Approach 🚀

### Kadane's Algorithm (Dynamic Programming)

- Initialize two variables:
  - `currentSum = 0`
  - `maxSum = Integer.MIN_VALUE`
- Traverse through the array:
  - Add the current element to `currentSum`.
  - Update `maxSum` with the maximum of `currentSum` and `maxSum`.
  - If `currentSum` becomes negative, reset it to `0` (because a negative sum would decrease the total).
- At the end, `maxSum` will contain the largest sum of any subarray.

**Why this works:**  
- A negative `currentSum` would hurt any future subarray sum, so we drop it (reset to 0).
- We keep track of the best sum we have seen so far.

---
