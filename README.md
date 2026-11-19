## Question 01

In the intergalactic archive of Planet Xyphor, two ancient data crystals a[] and b[] store 
encrypted energy signatures. Due to cosmic duplication anomalies, many signatures may repeat
within and across the crystals.
The Galactic Council must compute the total number of distinct energy signatures present when
both crystals are merged into a unified repository.If a signature appears multiple times,
it must be counted only once.

Your task is to determine the number of unique energy signatures after combining both arrays.

---

Case 1
Input:
a[] = [1, 2, 3, 4, 5]
b[] = [1, 2, 3]

Output:
5

---

Case 2
Input:
a[] = [85, 25, 1, 32, 54, 6]
b[] = [85, 2]

---
Case 3

Input:
a[] = [1, 2, 1, 1, 2]
b[] = [2, 2, 1, 2, 1]

Output:
2**
Output:
7
**Solution:** [Solution01.java](./Solution01.java)

Q2.
(Expected O(1))

In the Kingdom of Arithmoria, a ritual staircase has n glowing steps. The first step emits energy 1, the second 2, the third 3, and so on.

To activate the royal beacon, the total cumulative energy of all n steps must be calculated.

However, due to time constraints, the calculation must be performed in constant time.

Compute the total energy emitted by the staircase.

---

Sample Test Cases

Case 1

Input:
n = 1

Output:
1

---

Case 2

Input:
n = 5

Output:
15

---

Case 3 (Large Constraint)

Input:
n = 1000000000

Output:
50000000005000000000
