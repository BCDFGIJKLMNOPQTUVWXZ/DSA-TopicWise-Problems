# Euclidean Distance After Climbing

**Difficulty**: Medium  
**Platform**: Custom  

## Problem Statement

Reena and Meena climb a mountain wall following a series of instructions. Each instruction in the form of `U`, `D`, `R`, `L` specifies the direction (Up, Down, Right, Left), and the digits following the symbol indicate the distance. Starting at an initial point `(x, y)`, calculate their **Euclidean distance** from the ground `(0, 0)` after executing all instructions.

---

## Input Format

1. The first line contains `T`, the number of test cases.
2. For each test case:
   - The first line contains two integers `x` and `y` (`-100,000 \leq x, y \leq 100,000`), representing the initial position on the wall.
   - The second line contains a string `s` (`1 \leq |s| \leq 1000`), representing the climbing instructions.
     - The string consists of uppercase letters `U`, `D`, `R`, `L` and digits.

---

## Output Format

For each test case, print the Euclidean distance from the origin `(0, 0)` to the final position on the wall, rounded to **2 decimal places**.

---

## Example

### Input
```
2
0 0
U2R3
3 4
D5L2
```

### Output
```
3.61
6.71
```

---

## Explanation

### Test Case 1:
- Starting point: `(0, 0)`
- Instructions: `U2R3`
  - Move `2` units up: `(0, 0) -> (0, 2)`
  - Move `3` units right: `(0, 2) -> (3, 2)`
- Final position: `(3, 2)`
- Euclidean distance: `sqrt((3-0)^2 + (2-0)^2) = sqrt(9 + 4) = 3.61`

### Test Case 2:
- Starting point: `(3, 4)`
- Instructions: `D5L2`
  - Move `5` units down: `(3, 4) -> (3, -1)`
  - Move `2` units left: `(3, -1) -> (1, -1)`
- Final position: `(1, -1)`
- Euclidean distance: `sqrt((1-0)^2 + (-1-0)^2) = sqrt(1 + 1) = 6.71`

---

## Approach

1. **Initialization**: Start from the given initial position `(x, y)`.
2. **Processing Instructions**:
   - Parse the string `s` to identify directions and corresponding distances.
   - Update the coordinates `(x, y)` based on the direction and distance.
     - `U` increases `y`
     - `D` decreases `y`
     - `R` increases `x`
     - `L` decreases `x`
3. **Calculate Euclidean Distance**:
   - Use the formula `sqrt(x^2 + y^2)` to find the distance from `(0, 0)`.
4. **Output**: Round the result to 2 decimal places.

---

## Complexity

- **Time Complexity**: `O(T \times |s|)` where `T` is the number of test cases and `|s|` is the average length of the instruction string.
- **Space Complexity**: `O(1)` (no extra space required).
