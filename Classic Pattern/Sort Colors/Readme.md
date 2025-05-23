# 🚩 Problem: Sort Colors  
**Platform:** LeetCode  
**Difficulty:** Medium  

---

### 📝 Problem Statement

You are given an array `nums` with `n` objects colored red, white, or blue, represented as `0`, `1`, and `2` respectively.  
You must sort them **in-place** so that objects of the same color are adjacent, with the colors in the order: red (`0`), white (`1`), and blue (`2`).

You **must not** use the library's sort function.

---

### 📥 Input Format
- An integer array `nums` of size `n`, where `nums[i]` ∈ {0, 1, 2}

---

### 📤 Output Format
- The input array `nums` should be sorted in-place, so no return is needed. After function execution, `nums` will be rearranged as per the required order.

---

### 🧠 Approach

We solve this problem using the **Dutch National Flag Algorithm**, which is a powerful in-place sorting method for three-way partitioning:

#### Idea:
- Use three pointers: `low`, `mid`, and `high`.
- Traverse through the array:
  - If the current element is `0`, swap with `low` and move both `low` and `mid`.
  - If it is `1`, just move `mid`.
  - If it is `2`, swap with `high` and move `high` backward.

This ensures all `0s` are pushed to the front, `2s` to the back, and `1s` naturally settle in the middle.

#### Time Complexity: `O(n)`  
#### Space Complexity: `O(1)` *(In-place sorting)*

---

### 🔢 Example

**Input:**  
`nums = [2, 0, 2, 1, 1, 0]`

**Output:**  
`nums = [0, 0, 1, 1, 2, 2]`
