# Problem: Median of Two Sorted Arrays of Different Sizes

**Platform:** GeeksforGeeks 
**Difficulty:** Hard  

## Problem Statement

Given two sorted arrays `a[]` and `b[]`, find and return the **median** of the combined array after merging them into a single sorted array.

---

## Examples

### Example 1:

**Input:**  
`a[] = [-5, 3, 6, 12, 15]`  
`b[] = [-12, -10, -6, -3, 4, 10]`  

**Output:**  
`3`

**Explanation:**  
The merged array is `[-12, -10, -6, -5, -3, 3, 4, 6, 10, 12, 15]`.  
The median is the middle value, which is `3`.

---

## Approach

To find the median efficiently, we use a **Binary Search** approach instead of merging the arrays explicitly.

### Steps:

1. **Ensure the First Array is Smaller:**  
   If the size of array `a` is greater than `b`, swap the arrays. This ensures that we perform binary search on the smaller array for better efficiency.

2. **Define Partition Points:**  
   Partition the combined array into two halves such that:  
   - The left half contains exactly `(m + n + 1) / 2` elements, where `m` and `n` are the sizes of the arrays `a` and `b`.
   - The elements in the left half are less than or equal to those in the right half.

3. **Binary Search on the Smaller Array:**  
   - Use two pointers (`low` and `high`) to find the correct partition point `mid1` for array `a`.  
   - Calculate the corresponding partition point `mid2` for array `b` such that the left half contains the required number of elements.

4. **Check Partition Validity:**  
   - Compare the elements at the partition boundaries:  
     - `leftA`, `leftB` (maximum elements of the left parts of `a` and `b`).  
     - `rightA`, `rightB` (minimum elements of the right parts of `a` and `b`).  
   - If the partition is valid (`leftA <= rightB` and `leftB <= rightA`), compute the median:  
     - If the combined array size is even, the median is the average of the two middle elements.  
     - If odd, the median is the maximum element of the left half.

5. **Adjust Partition:**  
   - If `leftA > rightB`, move the partition in `a` to the left (`high = mid1 - 1`).  
   - Otherwise, move it to the right (`low = mid1 + 1`).

6. **Return the Result:**  
   - The median is determined when a valid partition is found.

---

## Complexity Analysis

- **Time Complexity:** O(log(min(m, n)))  
  - The binary search is performed on the smaller array, so the complexity depends on its size.
- **Space Complexity:** O(1)  
  - No additional space is used.

---
