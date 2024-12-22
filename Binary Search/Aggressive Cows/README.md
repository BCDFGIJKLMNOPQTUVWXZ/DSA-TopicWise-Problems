# Aggressive Cows

**Difficulty**: Medium  
**Platform**: Geeks for Geeks 

---

## Problem Statement

You are given an array `stalls[]` with unique elements, where each element denotes the position of a stall. You are also given an integer `k` representing the number of aggressive cows.

Your task is to assign the stalls to `k` cows such that the **minimum distance** between any two cows is maximized.

---

## Input Format

- An integer `n`, the size of the array.
- An array `stalls[]` of size `n`, containing unique integers denoting the positions of the stalls.
- An integer `k`, representing the number of cows.

---

## Output Format

Return the maximum possible minimum distance between any two cows.

---

## Approach

### Key Steps:
1. **Sorting**: Sort the `stalls` array in ascending order to enable binary search on distances.
2. **Binary Search**: Perform binary search on the possible range of minimum distances, which is from `1` to `stalls[n-1] - stalls[0]`.
3. **Greedy Placement**: For a given minimum distance, check if it is possible to place all `k` cows such that the distance between any two is at least the given value.

### Helper Function:
- Use a helper function `canWePlace()`:
  - Start placing cows in the stalls from the leftmost stall.
  - Ensure that the distance between the current stall and the last placed cow is at least `d`.
  - Count the number of cows placed and verify if it matches `k`.

### Optimization:
- The binary search ensures the solution is efficient, reducing the time complexity compared to brute-force approaches.

---

## Example

### Input
```text
stalls = [1, 2, 4, 8, 9]
k = 3
