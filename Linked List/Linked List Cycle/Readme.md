# Linked List Cycle Detection

## 📝 Problem Statement
Given `head`, the head of a linked list, determine if the linked list has a **cycle** in it.

A cycle exists if some node in the list can be reached again by continuously following the `next` pointer.  
Return `true` if there is a cycle in the linked list. Otherwise, return `false`.

**Note:** Internally, `pos` is used to denote the index of the node that the tail's next pointer is connected to. `pos` is not passed as a parameter.

---

## 🔍 Examples

### Example 1
Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: tail connects to node index 1 (node with value 2).

### Example 2
Input: head = [1], pos = -1
Output: false
Explanation: no cycle exists.

---

## 💡 Approach

### 1. Hashing Approach (O(n) space)
- Traverse the list while storing visited nodes in a `HashSet`.
- If a node is visited again → cycle exists.
- Time: `O(n)`  
- Space: `O(n)`

### 2. Floyd’s Cycle Detection Algorithm (Tortoise and Hare) (O(1) space) ✅
- Use two pointers:  
  - `slow` moves one step at a time.  
  - `fast` moves two steps at a time.  
- If there is no cycle, `fast` (or `fast.next`) will become `null`.  
- If there is a cycle, at some point `slow == fast`.

---
