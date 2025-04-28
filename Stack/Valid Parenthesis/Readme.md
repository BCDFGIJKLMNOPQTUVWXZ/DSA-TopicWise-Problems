# Valid Parentheses

## Platform : GeeksforGeeks
## Difficulty : Easy

## Problem Description
Given a string `s` consisting of characters `(`, `)`, `{`, `}`, `[` and `]`, 
determine if the input string is **valid**.

An input string is valid if:
1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.

---

## Example

**Input:**  
`s = "{[()]}"`  

**Output:**  
`true`

**Explanation:**  
All brackets are closed correctly and in the correct order.

---

## Approach

We use a **Stack** data structure:

- Push every **opening bracket** (`(`, `{`, `[`) onto the stack.
- For every **closing bracket** (`)`, `}`, `]`):
  - Check if the stack is empty ➔ if yes, return `false`.
  - Check if the top of the stack matches the current closing bracket ➔ if yes, pop the stack; else, return `false`.
- After processing the whole string, if the stack is empty, return `true`; otherwise, return `false`.

**Why Stack?**  
Because the most recently opened bracket must be closed first. This follows the **Last In First Out (LIFO)** principle — exactly how a Stack works.

---

