# **Problem: Luckiest Auspicious Number**

### **Platform:** Hackerrank

### **Difficulty:** Medium  

---

### **Problem Statement**
Ram is an adventurer who encounters several mountain peaks with unique heights during a journey. Ram also has a set of *auspicious numbers* that represent stamina levels for climbing peaks. The **luckiness score** of an auspicious number is determined by how many peaks have heights divisible by that number.

Your task is to determine the auspicious number with the highest luckiness score. If multiple numbers have the same score, select the smallest one.

1. **Input Format**  
   - \( T \): Number of test cases.  
     For each test case:
     - Two integers \( N \) (number of peaks) and \( M \) (number of auspicious numbers).
     - An array \( H \) of size \( N \), where \( H[i] \) represents the height of the \( i \)-th peak.
     - An array \( A \) of size \( M \), where \( A[i] \) represents the \( i \)-th auspicious number.

2. **Output Format**  
   For each test case, print the auspicious number with the maximum luckiness score. If there are multiple auspicious numbers with the same score, print the smallest one.

---

### **Constraints**
- 1≤T≤500
-1≤M,N≤1000
-1≤H[i],A[i]≤100,000

---

### **Approach**
To solve this problem efficiently, we use **number theory** and **precomputation**:
1. **Precompute Divisors:**
   - Create an array `divCount` where `divCount[x]` stores the number of peaks divisible by \( x \).
   - Iterate through the heights \( H \) and calculate divisors for each height.
2. **Efficient Divisor Calculation:**
   - Use the property of divisors: If \( d \) is a divisor of \( h \), then \( h/d \) is also a divisor.
   - Iterate only up to \( \sqrt{h} \) to find divisors efficiently.
3. **Find the Result:**
   - For each auspicious number \( A[i] \), use the precomputed divisor count to get its luckiness score.
   - Track the auspicious number with the maximum score. If scores are equal, choose the smallest number.

---

