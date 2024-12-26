# Problem: The Enchanted Treasure Riddle  
**Platform**: Custom Problem  
**Difficulty**: Medium  

---

## Problem Statement

Aladdin has discovered a magical grid in the Cave of Wonders. To unlock the treasure, the grid must be transformed into a **uni-value grid**, where all numbers in the grid are the same.  

Aladdin can only use a magical number `x` to either add or subtract from the numbers in the grid. The challenge is to determine the **minimum number of operations** required to transform the grid. If it’s **impossible** to make the grid uni-value, return `-1`.

---

## Input Format

1. The first line contains an integer `T`, the number of test cases.  
2. For each test case:  
   - The first line contains three integers `m` (rows), `n` (columns), and `x` (magical number).  
   - The next `m` lines contain `n` integers representing the grid.

---

## Output Format

For each test case, print the minimum number of operations required to transform the grid into a uni-value grid. If it’s impossible, output `-1`.

---

## Example

### Input
1

2 2 2

2 4

6 8

### Output
4

### Explanation  
The grid is:  
[2 4] 
[6 8]

The magical number `x = 2`.  
- Subtract 2 from 4 → 2.  
- Subtract 4 from 6 → 2.  
- Subtract 6 from 8 → 2.  

This requires **4 operations** in total.

---

## Approach

1. **Flatten the Grid**:  
   Convert the grid into a 1D list for easier processing.  

2. **Check Feasibility**:  
   - Compute the remainder of the first element modulo `x`.  
   - Ensure all elements have the same remainder modulo `x`.  
   - If not, the transformation is impossible.  

3. **Sort the Flattened Grid**:  
   Use the **median** of the grid values to minimize the total number of operations.

4. **Calculate Operations**:  
   - Compute the difference between each number and the median.  
   - Divide each difference by `x` to get the required operations.  

---

## Complexity Analysis

- **Time Complexity**:  
  - Sorting the flattened grid: \( O((m \times n) \log (m \times n)) \) per test case.  
  - Checking feasibility: \( O(m \times n) \) per test case.  
  Overall: \( O(T \times m \times n \log (m \times n)) \).  

- **Space Complexity**:  
  - Storing the flattened grid: \( O(m \times n) \) per test case.  

---
