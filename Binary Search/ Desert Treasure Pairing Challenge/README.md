# Desert Treasure Pairing Challenge

**Difficulty**: Medium  
**Platform**: Custom  

---

## Problem Statement

In the heart of a vast desert, merchants are preparing their camel caravans to transport valuable goods across the dunes. Each camel is assigned a load value representing its carrying capacity. To ensure a smooth journey, the camels need to be paired into \( n/2 \) groups, and the goal is to minimize the **maximum group load**.

### Definitions:
- The group load of a pair \((a, b)\) is \( a + b \).
- For example, if we have pairs \((1,5)\), \((2,3)\), and \((4,4)\), the **maximum group load** is:
  \[
  \max(1+5, 2+3, 4+4) = \max(6, 5, 8) = 8.
  \]

### Objective:
Given an array `loadCapacity` of even length \( n \), where each element represents the load value of a camel, pair the camels such that:
1. Each camel is in exactly one pair.
2. The **maximum group load** is minimized.

---

## Input Format

- **First Line**: An integer \( T \), the number of test cases.
- **For Each Test Case**:
  - An integer \( n \), the size of the array (even).
  - An array `loadCapacity` of size \( n \), where each element represents the load value of a camel.

---

## Output Format

For each test case, output the minimized **maximum group load** after optimally pairing up the camels.

---

## Example

### Input
```text
1
4
3 5 2 3
