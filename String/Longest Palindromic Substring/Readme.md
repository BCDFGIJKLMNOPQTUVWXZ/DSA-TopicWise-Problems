# Longest Palindromic Substring

This repository contains the solution to the "Longest Palindromic Substring" problem.

---

- **Platform:** LeetCode
- **Difficulty:** Medium
- **Topic:** String, Dynamic Programming, Two Pointers

---

## Problem Description

Given a string `s`, return the longest palindromic substring in `s`.

A **palindromic substring** is a substring that reads the same backward as forward.

### Examples
Markdown

# Longest Palindromic Substring

This repository contains the solution to the "Longest Palindromic Substring" problem.

---

- **Platform:** LeetCode
- **Difficulty:** Medium
- **Topic:** String, Dynamic Programming, Two Pointers

---

## Problem Description

Given a string `s`, return the longest palindromic substring in `s`.

A **palindromic substring** is a substring that reads the same backward as forward.

### Examples

Example 1:
Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.

Example 2:
Input: s = "cbbd"
Output: "bb"

### Constraints

- `1 <= s.length <= 1000`
- `s` consists of only digits and English letters.

---

## Approach: Expand Around Center

The "Expand Around Center" is an intuitive and efficient approach to solve this problem. The core idea is that every palindrome has a center. This center can be a single character (for odd-length palindromes like "aba") or a pair of adjacent characters (for even-length palindromes like "abba").

We iterate through the string and treat each character (or pair of characters) as a potential center. From each center, we expand outwards, checking for palindrome properties, and keep track of the longest palindrome found so far.

### Algorithm

1.  Initialize `start` and `end` pointers to track the beginning and end of the longest palindromic substring found so far.
2.  Iterate through the string from `i = 0` to `s.length() - 1`.
3.  For each index `i`, we consider two cases for a palindrome centered at `i`:
    -   **Odd-length palindromes:** The center is a single character at index `i`. Call a helper function `expandAroundCenter(s, i, i)`.
    -   **Even-length palindromes:** The center is between two characters, at indices `i` and `i+1`. Call a helper function `expandAroundCenter(s, i, i + 1)`.
4.  The `expandAroundCenter` helper function takes the string and a left and right pointer. It expands outwards (`left--`, `right++`) as long as the characters at `left` and `right` are equal and the pointers are within the string boundaries. It returns the length of the palindrome it found.
5.  Compare the lengths returned by the two `expandAroundCenter` calls and take the maximum.
6.  If this new maximum length is greater than the length of our current longest palindrome (`end - start`), update `start` and `end` to store the new longest palindrome's boundaries. The new `start` and `end` can be calculated from the current index `i` and the new `len`.
7.  After the loop finishes, return the substring from `start` to `end`.

---

### Complexity Analysis

-   **Time Complexity:** O(N^2), where N is the length of the string. We iterate through each character (`N` times) and for each character, we expand outwards, which can take up to O(N) time in the worst case.
-   **Space Complexity:** O(1), as we only use a few variables to store the pointers and lengths.

---

