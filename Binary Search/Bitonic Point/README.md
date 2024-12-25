# Bitonic Point

**Difficulty**: Easy  
**Platform**: GeeksforGeeks 

---

## Problem Statement

You are given an array of integers `arr[]` of size \( n \), which is first **strictly increasing** and then **possibly strictly decreasing**. The task is to find the **Bitonic Point**, which is the maximum element in the array.

The **Bitonic Point** is defined as the element before which all elements are strictly increasing and after which all elements are strictly decreasing.

---

## Approach

To find the bitonic point in the given array, we can utilize the **Binary Search** technique as follows:

1. Initialize two pointers: `low = 0` and `high = n-1`, where `n` is the length of the array.
2. Perform a binary search:
    - Calculate `mid = low + (high - low) / 2`.
    - Check if `arr[mid]` is greater than its neighbors (`arr[mid - 1]` and `arr[mid + 1]`). If yes, then `arr[mid]` is the bitonic point.
    - If `arr[mid - 1] > arr[mid]`, move to the left half (`high = mid - 1`).
    - Otherwise, move to the right half (`low = mid + 1`).
3. Handle edge cases:
    - If `mid == 0`, compare `arr[mid]` with `arr[mid + 1]`.
    - If `mid == n-1`, compare `arr[mid]` with `arr[mid - 1]`.
4. Return the maximum element (bitonic point) when found.

 ---

## Input Format

- An integer \( n \), the size of the array.
- An array `arr[]` of size \( n \), representing the bitonic sequence.

---

## Output Format

- The **Bitonic Point**, which is the maximum element in the array.

---

## Example

### Input
```text
7
1 2 4 5 7 8 3
8
