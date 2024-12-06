# Problem: Split Array in Three Equal Sum Subarrays  
**Platform:** GeeksforGeeks  
**Difficulty:** Medium  

## Problem Statement
Given an array `arr[]`, determine if it can be split into three consecutive parts such that the sum of each part is equal. If possible, return any index pair `(i, j)` in an array such that:  
- `sum(arr[0..i]) = sum(arr[i+1..j]) = sum(arr[j+1..n-1])`

Otherwise, return `{-1, -1}`.  
The driver code will verify and return `true` or `false` based on the correctness of your solution.  

---

## Approach
### Key Observations:
1. Calculate the **total sum** of the array.
2. If the total sum is not divisible by 3, return `{-1, -1}` immediately.
3. Divide the total sum by 3 to get the target sum for each partition (`tarSum`).

### Steps:
1. Traverse through the array while maintaining a running sum.
2. Each time the running sum equals `tarSum`:
   - Record the index where the partition ends.
   - Reset the running sum to 0.
3. Repeat the above step until two partitions are found.  
   - If we reach the third partition and the remaining sum equals `tarSum`, return the indices of the first two partitions.
4. If the conditions are not satisfied, return `{-1, -1}`.

---
