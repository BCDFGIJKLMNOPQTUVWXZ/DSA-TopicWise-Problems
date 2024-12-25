# Problem: Minimum Days to Make M Bouquets

**Platform:** GeeksforGeeks

**Difficulty:** Medium  

## Problem Statement

You have a row of flowers, where each flower blooms after a specific day. The array `arr` represents the blooming schedule: `arr[i]` is the day the flower at position `i` will bloom. 

To create a bouquet, you need to collect `k` adjacent bloomed flowers. Each flower can only be used in one bouquet. Your goal is to find the minimum number of days required to make exactly `m` bouquets. If it is not possible to make `m` bouquets with the given arrangement, return `-1`.

### Example Input

Input: m = 3 k = 2 arr[] = [3, 4, 2, 7, 13, 8, 5]

### Example Output

Output: 8

### Explanation

We need 3 bouquets and each bouquet should have 2 flowers.  
After day 8: `[x, x, x, x, _, x, x]`, we can make:
- First bouquet from the first 2 flowers.
- Second bouquet from the next 2 flowers.
- Third bouquet from the last 2 flowers.

---

## Approach

This problem can be solved using **Binary Search** to minimize the number of days required to make exactly `m` bouquets.

### Steps:

1. **Find the Search Range:**
   - The minimum number of days required (`low`) is the smallest value in the array (`min(arr)`).
   - The maximum number of days required (`high`) is the largest value in the array (`max(arr)`).

2. **Binary Search to Find the Minimum Days:**
   - For each mid-point of the search range:
     - Use a helper function to check if it is possible to make `m` bouquets with `k` adjacent flowers blooming in `mid` days.

3. **Helper Function:**
   - Traverse the array and count adjacent bloomed flowers for the current number of days (`mid`).
   - Reset the count when a flower is not bloomed and increment the bouquet count when the required number of adjacent flowers (`k`) is met.

4. **Adjust Search Range:**
   - If it is possible to make `m` bouquets within `mid` days, search for fewer days (`high = mid - 1`).
   - Otherwise, search for more days (`low = mid + 1`).

5. **Result:**
   - If `low` exceeds `max(arr)`, return `-1` (not possible to make `m` bouquets).
   - Otherwise, return `low`.

---

## Complexity Analysis

- **Time Complexity:** O(n * log(max(arr)))  
  Explanation:
  - Binary search runs in O(log(max(arr))).
  - For each iteration, the helper function iterates through the array, which takes O(n).
- **Space Complexity:** O(1)

---
