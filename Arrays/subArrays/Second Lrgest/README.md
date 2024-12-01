# Problem: Second Largest  
**Platform:** GeeksforGeeks  
**Difficulty:** Easy  

## Problem Statement
Given an array of positive integers `arr[]`, return the **second largest element** from the array.  

If the second largest element doesn't exist, return `-1`.  

### Note:
- The second largest element should not be equal to the largest element.

---

## Approach
To find the second largest element in the array:
1. **Identify the Largest Element**:
   - Use a built-in method or loop through the array to find the largest element (`max`).

2. **Find the Second Largest Element**:
   - Iterate through the array again to find the element that is smaller than `max` but larger than all other elements (`max2`).

3. **Handle Edge Cases**:
   - If no such element exists, return `-1`.
