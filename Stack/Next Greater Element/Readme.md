# Next Greater Element

This repository contains a solution to the "Next Greater Element" problem, a popular question that showcases the use of stacks for finding monotonic sequences.

---

- **Platform:** GeeksforGeeks
- **Difficulty:** Medium
- **Topic:** Stack, Array, Data Structures

---

## Problem Description

Given an array `arr[]` of integers, the task is to find the next greater element for each element in the order of their appearance in the array.

The **next greater element** of an element in the array is the nearest element on its right side which is greater than the current element. If no such element exists, the next greater element is considered to be `-1`. For the last element of the array, the next greater element is always `-1`.

### Example
Input: arr[] = [1, 3, 2, 4]
Output: [3, 4, 4, -1]


**Explanation:**
- For `1`, the next greater element is `3`.
- For `3`, the next greater element is `4`.
- For `2`, the next greater element is `4`.
- For `4`, no greater element exists to its right, so it is `-1`.

---

## Approach: Using a Stack

A brute-force approach would require a nested loop, leading to an O(N^2) time complexity. A much more efficient solution can be achieved using a **Stack**. The key idea is to process the array from right to left, using the stack to maintain a monotonic sequence of elements that are potential candidates for being the "next greater element".

### Algorithm (Right to Left)

1.  Initialize an empty `Stack` to store indices and a result `ArrayList` or array of the same size as the input, filled with `-1`.
2.  Iterate through the input array from right to left (from index `n-1` to `0`).
3.  For each element `arr[i]`:
    -   While the stack is not empty and the element at the index on top of the stack (`arr[stack.peek()]`) is less than or equal to the current element `arr[i]`, pop the top element from the stack. These elements can't be the next greater element for `arr[i]`.
    -   After the `while` loop, check the stack:
        -   If the stack is **not empty**, the element at the top of the stack is the first element to the right of `arr[i]` that is greater. Set `nge[i]` to `arr[stack.peek()]`.
        -   If the stack **is empty**, it means there is no element to the right of `arr[i]` that is greater. The value for `nge[i]` remains `-1`.
    -   Push the current index `i` onto the stack. This index is now a candidate for being the next greater element for elements to its left.
4.  After the loop finishes, the result array will contain the next greater element for each element.

---

### Complexity Analysis

-   **Time Complexity:** O(N), where N is the length of the array. Each element is pushed and popped from the stack at most once.
-   **Space Complexity:** O(N) in the worst case. This happens when the array is sorted in decreasing order (e.g., `[5, 4, 3, 2, 1]`), and all elements are pushed onto the stack.

---
