# Problem: Two Sum  
**Platform:** LeetCode  
**Difficulty:** Easy  

## Problem Statement
Given an array of integers `nums[]` and an integer `target`, return the indices of the two numbers such that they add up to `target`.

### Constraints:
- Each input would have exactly one solution.
- You may not use the same element twice.

---

## Approach
To solve the problem, a brute force approach is to check all pairs of numbers in the array, but we can optimize the solution using a **HashMap** to reduce the time complexity.

However, the current solution uses a **nested loop** approach:

1. **Iterate through the array**: 
   - For each element `nums[i]`, iterate through the rest of the elements starting from `i+1` to check if any pair adds up to the target.
   
2. **Check Pair Sum**: 
   - For each pair `nums[i]` and `nums[j]`, if `nums[i] + nums[j] == target`, return their indices as the solution.
---
