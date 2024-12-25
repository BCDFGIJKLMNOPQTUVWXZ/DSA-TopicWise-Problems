# Problem: Koko Eating Bananas

**Platform:** GeeksforGeeks

**Difficulty:** Medium

## Problem Statement

Given an array `arr[]` of integers where each element represents a pile of bananas, and Koko has `k` hours to finish all the piles, find the minimum number of bananas (`s`) Koko must eat per hour to finish all the bananas within `k` hours. Each hour, Koko chooses a pile and eats `s` bananas from it. If the pile has fewer than `s` bananas, she consumes the entire pile for that hour.

### Example Input

Input: arr[] = [3, 6, 7, 11]  k = 8

### Example Output

Output:4 

### Explanation

Koko eats at least 4 bananas per hour to finish all piles within 8 hours, as she can consume each pile in `1 + 2 + 2 + 3 = 8 hours`.

---

## Approach

To solve the problem, we use a **Binary Search** approach to determine the minimum number of bananas Koko must eat per hour (`s`) to finish all the piles within `k` hours. 

### Steps:

1. **Find the Range for Binary Search:**
   - The minimum bananas Koko can eat per hour is `1` (smallest possible rate).
   - The maximum bananas Koko can eat per hour is the largest pile size (`max(arr)`).

2. **Binary Search to Find the Optimal Eating Speed:**
   - Use binary search to find the smallest value of `s` for which Koko can finish all the bananas within `k` hours.
   - For each potential `s` (midpoint of the current binary search range):
     - Check if it's possible for Koko to finish all the piles within `k` hours using a helper function.

3. **Helper Function to Simulate Eating Bananas:**
   - For each pile, calculate how many hours it would take Koko to eat all bananas at the given speed `s`:
     - If the pile size is less than or equal to `s`, it takes 1 hour.
     - Otherwise, divide the pile size by `s` and round up to account for partial piles.
   - Sum up the hours for all piles and compare it to `k`.

4. **Adjust Search Range Based on Feasibility:**
   - If Koko can finish within `k` hours, update the result to `mid` and search for smaller values (`high = mid - 1`).
   - Otherwise, search for larger values (`low = mid + 1`).

5. **Return the Result:**
   - The result is the smallest `s` that allows Koko to finish all piles within `k` hours.

---

## Complexity Analysis

- **Time Complexity:** O(n * log(max(arr)))  
  Explanation:
  - Sorting is not required.
  - Binary search runs in O(log(max(arr))).
  - For each iteration, the helper function iterates through the array, which takes O(n).
- **Space Complexity:** O(1)

---

