# Palindrome Linked List

## Problem Statement
Given the head of a singly linked list, return `true` if it is a palindrome, or `false` otherwise.

### Example 1:
Input: head = [1,2,2,1]
Output: true

### Example 2:
Input: head = [1,2]
Output: false

---

## Approach

We cannot traverse backward in a singly linked list, so we need a different strategy than arrays/strings.

**Steps:**
1. Use **two pointers (slow & fast)** to find the middle of the linked list.  
   - Slow → moves 1 step at a time  
   - Fast → moves 2 steps at a time  
   - When fast reaches the end, slow will be at the middle.

2. **Reverse the second half** of the list.

3. Compare the **first half** and the **reversed second half** node by node.  
   - If all nodes match → palindrome.  
   - Otherwise → not a palindrome.

4. (Optional) Reverse the second half again to restore the list.

---

## Complexity
- **Time:** `O(n)` (one pass to find middle, one to reverse, one to compare).  
- **Space:** `O(1)` (only pointers used).

---
