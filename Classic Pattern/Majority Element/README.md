# 🧮 169. Majority Element

- **Platform:** LeetCode
- **Difficulty:** Easy 🟢

---

## Problem Description 📄

Given an array `nums` of size `n`, return the **majority element**.

The **majority element** is the element that appears **more than** `⌊n / 2⌋` times.

**You may assume that the majority element always exists in the array.**

---

## Example 🧩

### Example 1
**Input:**  
`nums = [3,2,3]`  

**Output:**  
`3`

### Example 2
**Input:**  
`nums = [2,2,1,1,1,2,2]`  

**Output:**  
`2`

---

## Approach 🚀

### Boyer-Moore Voting Algorithm

- Initialize a `count` variable to 0 and `candidate` to `null`.
- Iterate over the elements in the array:
  - If `count == 0`, set `candidate` to the current element.
  - If the current element is the same as `candidate`, increment `count`.
  - Otherwise, decrement `count`.
- At the end of iteration, `candidate` will be the majority element.

**Why this works:**  
Because the majority element appears more than `n/2` times, so it will "survive" all cancellations.

---
