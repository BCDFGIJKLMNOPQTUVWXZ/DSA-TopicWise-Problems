# Problem: Ceil and Floor in a Sorted Array
**Platform:** Coding Ninjas  
**Difficulty:** Moderate  

## Problem Statement
You are given a sorted array `a` of `n` integers and an integer `x`. Your task is to find:  
1. The **floor** of `x`: The largest element in the array that is **less than or equal** to `x`.  
2. The **ceil** of `x`: The smallest element in the array that is **greater than or equal** to `x`.  

## Approach
To solve this problem efficiently, we can use **Binary Search** to find both the floor and the ceil.

### 1. Finding Floor:
   - Use binary search to identify the largest value ≤ `x`.
   - Move the low pointer when the middle value is less than or equal to `x`.
   - Update the floor value whenever a valid element is found.

### 2. Finding Ceil:
   - Use binary search to identify the smallest value ≥ `x`.
   - Move the high pointer when the middle value is greater than or equal to `x`.
   - Update the ceil value whenever a valid element is found.
