# Stock Span Problem

This repository contains a solution to the "Stock Span Problem", a classic problem often used to demonstrate the power of stacks.

---

- **Platform:** GeeksforGeeks
- **Difficulty:** Medium
- **Topic:** Stack, Array, Data Structures

---

## Problem Description

The stock span problem involves a series of daily price quotes for a stock. The goal is to calculate the "span" of the stock price for each day.

The **span `S[i]`** of a stock's price on a given day `i` is defined as the maximum number of consecutive days just before the given day (including the current day), for which the price of the stock on those days is less than or equal to its price on the current day.

### Example
nput: arr[] = [100, 80, 60, 70, 60, 75, 85]
Output: [1, 1, 1, 2, 1, 4, 6]

**Explanation:**
- For `100`, no preceding days, span is `1`.
- For `80`, `80` <= `80`, but `100` > `80`, so span is `1`.
- For `60`, `60` <= `60`, but `80` > `60`, so span is `1`.
- For `70`, `70` <= `70` and `60` <= `70`, but `80` > `70`, so span is `2`.
- For `60`, `60` <= `60`, but `70` > `60`, so span is `1`.
- For `75`, `75` <= `75`, `60` <= `75`, `70` <= `75`, but `80` > `75`, so span is `4`.
- For `85`, `85` <= `85`, `75` <= `85`, `60` <= `85`, `70` <= `85`, `60` <= `85`, `80` <= `85`, but `100` > `85`, so span is `6`.

---

## Approach: Using a Stack

A naive solution would involve a nested loop, resulting in a time complexity of O(N^2). We can optimize this using a **Stack** data structure, which reduces the time complexity to linear.

The key insight is that for each element, we need to find the **first greater element to its left**. The span will be the distance from the current element to this first greater element.

We use a stack to store the **indices** of the elements. We maintain a stack of decreasing prices, so the element at the top of the stack is always the "previous greater element".

### Algorithm

1.  Initialize an empty `Stack` to store indices of prices and an `ArrayList` to store the calculated spans.
2.  The span of the first element `arr[0]` is always `1`. Push its index `0` onto the stack and add `1` to the span list.
3.  Iterate through the array from the second element (`i = 1`) to the end.
4.  For the current price `arr[i]`:
    -   Pop elements from the stack as long as the stack is not empty and the price at the index on top of the stack (`arr[stack.peek()]`) is less than or equal to the current price `arr[i]`.
    -   While popping, accumulate the spans. This is a crucial optimization: the span of the popped elements is added to the current span, as they are all less than or equal to the current price.
    -   Once the `while` loop finishes, the element at the top of the stack (if the stack is not empty) is the index of the first greater element to the left.
    -   Push the current index `i` onto the stack.
    -   Add the calculated span to the span list.
5.  After the loop, the `ArrayList` will contain the spans for all days.

---

### Complexity Analysis

-   **Time Complexity:** O(N), where N is the number of days. Although there is a nested `while` loop, each index is pushed and popped from the stack at most once. This makes the overall time complexity linear.
-   **Space Complexity:** O(N) in the worst case. This occurs when the stock prices are in decreasing order (e.g., `[100, 90, 80]`), and the stack stores all the indices.

---
