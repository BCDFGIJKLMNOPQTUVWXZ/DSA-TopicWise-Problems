# Problem: Subarray Range with Given Sum  
**Platform:** GeeksforGeeks  
**Difficulty:** Medium  

---

## Problem Statement
Given an unsorted array of integers `arr[]`, and a target `tar`, determine the number of subarrays whose elements sum up to the target value.

---

## Approach
### Key Observations:
1. **Cumulative Sum (Prefix Sum)**: 
   - The cumulative sum of elements from the start of the array to the current index can be used to calculate the sum of any subarray.
   - If the difference between the current cumulative sum (`preSum`) and the target (`tar`) is found earlier in the array, it indicates that there exists a subarray with the required sum.

2. **Using HashMap**: 
   - A hashmap is used to store the frequency of cumulative sums encountered during traversal.
   - This allows us to efficiently determine if the difference `(preSum - tar)` has occurred previously and how many times.

---

### Steps:
1. **Initialize Variables**:
   - `preSum` to track the cumulative sum.
   - `cnt` to count the number of subarrays with the given sum.
   - A hashmap `hmap` to store the frequency of cumulative sums, initialized with `{0: 1}` to handle cases where `preSum == tar`.

2. **Iterate Through the Array**:
   - Update `preSum` with the current element.
   - Check if `(preSum - tar)` exists in the hashmap. If it does, add its frequency to `cnt`.
   - Update the frequency of `preSum` in the hashmap.

3. **Return `cnt`**.

---
