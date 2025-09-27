# Odd Even Linked List

## Problem Statement
Given the head of a singly linked list, group all nodes with odd indices together followed by the nodes with even indices.  
- Indexing is **1-based** (first node = odd, second = even).  
- Maintain the relative order inside both odd and even groups.  

Return the reordered list.

### Example 1:
Input: head = [1,2,3,4,5]
Output: [1,3,5,2,4]

### Example 2:
Input: head = [2,1,3,5,6,4,7]
Output: [2,3,6,7,1,5,4]

## Approach

We separate the list into **two linked lists**:
- `odd` → contains nodes at odd indices  
- `even` → contains nodes at even indices  

**Steps:**
1. Keep two pointers: `odd` (head), `even` (head.next).  
   Also store `evenHead` for later.  
   
2. Rearrange:
   - `odd.next = even.next; odd = odd.next;`
   - `even.next = odd.next; even = even.next;`

3. Repeat until either `even == null` or `even.next == null`.

4. Attach `odd.next = evenHead`.

---

## Complexity
- **Time:** `O(n)` (single traversal).  
- **Space:** `O(1)` (only pointers, no extra structures).

---
