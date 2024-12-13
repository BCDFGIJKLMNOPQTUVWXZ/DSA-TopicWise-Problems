# Problem: Calculate Day of the Year  
**Platform:** Custom Problem  
**Difficulty:** Medium  

---

## Problem Statement
Tenzing, while preparing for his historic climb of Mount Everest, maintained a diary to record important milestones. Each day was marked with a specific date in the format `DDMMM`, and he wishes to calculate the exact day count from the start of the year to organize his journey effectively.

Given a date in the format `DDMMM`, your task is to calculate the day of the year the given date falls on. Assume the year is a **non-leap year**.

---

## Input Format
1. The first line contains an integer `T`, the number of test cases.
2. The next `T` lines each contain a date in the format `DDMMM` (e.g., `15Jan`).

---

## Output Format
For each test case, output the day count (an integer) of the given date from the start of the year.

---

## Constraints
- \( 1 \leq T \leq 500 \)
- Valid months: `Jan`, `Feb`, `Mar`, `Apr`, `May`, `Jun`, `Jul`, `Aug`, `Sep`, `Oct`, `Nov`, `Dec`

---

## Approach
### Key Observations:
1. **Non-leap Year Days in Months**:
   - `Jan`: 31 days
   - `Feb`: 28 days
   - `Mar`: 31 days
   - `Apr`: 30 days
   - `May`: 31 days
   - `Jun`: 30 days
   - `Jul`: 31 days
   - `Aug`: 31 days
   - `Sep`: 30 days
   - `Oct`: 31 days
   - `Nov`: 30 days
   - `Dec`: 31 days

2. **Cumulative Days**:
   - Precompute cumulative days for each month to quickly calculate the day count.

3. **Steps**:
   - Parse the input date to extract `DD` (day) and `MMM` (month abbreviation).
   - Use the cumulative day counts to determine the day of the year.

---

## Algorithm
1. Precompute cumulative days for each month in a non-leap year.
2. For each test case:
- Extract the day and month from the input (e.g., `15Jan` -> day = 15, month = Jan).
- Compute the day of the year as:
  ```
  dayOfYear = cumulativeDays[month] + day
  ```
3. Output the result for each test case.

---
