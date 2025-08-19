# Previous Greater Element

This repository contains a solution to the "Previous Greater Element" problem, which is a variation of the "Next Greater Element" problem and can be efficiently solved using a stack.

---

- **Platform:** GeeksforGeeks (common problem, not specified)
- **Difficulty:** Medium
- **Topic:** Stack, Array, Data Structures

---

## Problem Description

Given an array `arr[]` of integers, the task is to find the previous greater element for each element in the order of their appearance in the array.

The **previous greater element** of an element in the array is the nearest element on its left side which is greater than the current element. If no such element exists, the previous greater element is considered to be `-1`.

### Example
Input: arr[] = [10, 4, 2, 20, 12, 5]
Output: [-1, 10, 4, -1, 20, 12]

**Explanation:**
- For `10`, no greater element exists to its left, so it is `-1`.
- For `4`, the nearest greater element to its left is `10`.
- For `2`, the nearest greater element to its left is `4`.
- For `20`, no greater element exists to its left, so it is `-1`.
- For `12`, the nearest greater element to its left is `20`.
- For `5`, the nearest greater element to its left is `12`.

---

## Approach: Using a Stack

A brute-force solution would involve a nested loop, resulting in a time complexity of O(N^2). A much more efficient solution can be achieved using a **Stack**. The key idea is to iterate through the array from left to right, using the stack to maintain a monotonic sequence of elements that are potential candidates for being the "previous greater element".

### Algorithm (Left to Right)

1.  Initialize an empty `Stack` to store indices of the array elements and a result `ArrayList` or array to store the previous greater elements.
2.  Iterate through the input array from left to right (from index `i = 0` to `n-1`).
3.  For each element `arr[i]`:
    -   While the stack is not empty and the element at the index on top of the stack (`arr[stack.peek()]`) is less than or equal to the current element `arr[i]`, pop the top element from the stack. These elements can't be the previous greater element for `arr[i]` (or any element after it, which is greater than `arr[i]`).
    -   After the `while` loop, check the stack:
        -   If the stack is **not empty**, the element at the top of the stack is the first element to the left of `arr[i]` that is greater. Add `arr[stack.peek()]` to the result list.
        -   If the stack **is empty**, it means there is no element to the left of `arr[i]` that is greater. Add `-1` to the result list.
    -   Push the current index `i` onto the stack. This index is now a candidate for being the previous greater element for elements to its right.
4.  After the loop finishes, the result array will contain the previous greater element for each element.

---

### Complexity Analysis

-   **Time Complexity:** O(N), where N is the length of the array. Each element is pushed and popped from the stack at most once.
-   **Space Complexity:** O(N) in the worst case. This happens when the array is sorted in increasing order (e.g., `[1, 2, 3, 4, 5]`), and all elements are pushed onto the stack.

---
