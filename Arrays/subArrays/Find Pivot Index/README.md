# Problem: Find Pivot Index
**Platform:** LeetCode  
**Difficulty:** Easy  

## Problem Statement
Given an array of integers `nums`, calculate the **pivot index** of this array.  

The **pivot index** is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the right of the index.  

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

Return the **leftmost pivot index**. If no such index exists, return `-1`.

---

## Approach
1. **Total Sum Calculation**:
   - First, calculate the total sum of the array elements (`totSum`).

2. **Iterate Through the Array**:
   - Use two variables: `sumLeft` to track the sum of elements to the left of the current index and `sumRight` to track the sum to the right of the current index.

3. **Pivot Check**:
   - For a given index, check if `sumLeft == sumRight`. If true, return the current index as the pivot.
   - If not, update `sumLeft` by adding the current element and reduce `sumRight` by subtracting the next element.

4. **Edge Case**:
   - If no such pivot index exists, return `-1`.
