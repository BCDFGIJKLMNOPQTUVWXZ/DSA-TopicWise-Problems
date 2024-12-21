# Spirit Energy Sorter

**Difficulty**: Medium  
**Platform**: Custom  

## Problem Statement
The adventurers are on an epic journey to conquer a series of mystical cliffs, each with its own challenge level. Each cliff has a **difficulty score** that determines how hard it is to scale. Your task is to help the adventurers sort these cliffs based on the **spirit energy** required to overcome them.

The **spirit energy** of a cliff is calculated as the number of `1`s in its binary representation.  
- The cliffs should be sorted in ascending order of their **spirit energy**.  
- If two or more cliffs have the same **spirit energy**, sort them by their **difficulty scores** in ascending order.

---

## Input Format
1. The first line contains `T`, the number of test cases.  
2. For each test case:  
   - The first line contains `N`, the number of cliffs.  
   - The second line contains `N` space-separated integers, where each integer represents the **difficulty score** of a cliff.

---

## Output Format
For each test case, output the sorted list of cliff difficulty scores.

---

## Approach
1. **Calculate Spirit Energy**: For each cliff, compute the number of `1`s in its binary representation using Java's `Integer.bitCount()` method.
2. **Store and Sort**: Create a list of arrays where each array contains the cliff difficulty score and its spirit energy.
   - Sort the list by **spirit energy** first and then by **difficulty score** if spirit energies are equal.
3. **Output Results**: Extract and print the sorted difficulty scores.

---

## Implementation
The solution efficiently handles sorting using Java's built-in sorting mechanisms with a custom comparator to achieve the desired order.
