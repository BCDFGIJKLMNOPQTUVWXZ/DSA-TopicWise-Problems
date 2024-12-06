# Problem: Rotate Array  
**Platform**: GeeksforGeeks  
**Difficulty**: Medium  

## Problem Statement  
Given an unsorted array `arr[]`, rotate the array to the left (counter-clockwise direction) by `d` steps, where `d` is a positive integer. Perform the rotation **in place**.  

Note: Consider the array as circular, meaning elements that are shifted beyond the last index wrap around to the start.  

---

## Example  
### Input:  
`arr = [1, 2, 3, 4, 5, 6, 7]`  
`d = 2`  

### Output:  
`arr = [3, 4, 5, 6, 7, 1, 2]`  

---

## Approach  
To rotate the array efficiently, we use the **Reversal Algorithm**, which works as follows:  

1. **Step 1**: Reverse the entire array.  
2. **Step 2**: Reverse the first `d` elements of the reversed array.  
3. **Step 3**: Reverse the remaining `n-d` elements.  

This approach ensures the rotation is performed in `O(n)` time complexity and `O(1)` space complexity.

### Detailed Steps:  
- Compute `d = d % n` to handle cases where `d > n`.  
- Reverse the array in three parts as described.  

---
