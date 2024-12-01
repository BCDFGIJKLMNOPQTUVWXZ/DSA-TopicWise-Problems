# Problem: Move All Zeroes to End  
**Platform:** GeeksforGeeks  
**Difficulty:** Easy  

## Problem Statement
Given an array `arr[]`, push all the zeros in the array to the **right end** while maintaining the order of the non-zero elements.  

### Constraints:
- The change should be done **in-place**, meaning no extra space should be used.

---

## Approach
This problem can be solved efficiently using the **Two Pointers** approach:

1. **Initialize Pointers**:
   - Use one pointer (`i`) to track the position of non-zero elements.
   - Use another pointer (`j`) to traverse the array.

2. **Reorder Non-Zero Elements**:
   - Whenever a non-zero element is encountered at `arr[j]`, swap it with the element at `arr[i]`.
   - Increment `i` after the swap.

3. **Result**:
   - After the traversal, all non-zero elements are shifted to the left in their original order, and zeros are pushed to the right.
