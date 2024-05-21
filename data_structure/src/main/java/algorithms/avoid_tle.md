# Avoid TLE (Time Limit Exceeded)

TLE is thrown on online compiler when programs does not run in specified time complexity.

### Example and explanation

If have given the constraints as
        `1 <= nums.length <= 10^5`
Then check substituting the worst case in time complexity like


- `10^5` in O(N^2) it will become`10^2^5` = `10^10` which is not acceptable as compiler support `10^7` or `10^8`
- `10^5` in O(N log N) it will become ~`10^6` which is acceptable
- `10^5` in O(N) it will become `10^5` which is acceptable 

So for  `10^5` we should use O(n log n) , O(N) , O(log n) or O(1) algorithms



### Below is cheat sheet

| Constraints | Worst Time Complexity | Algorithmic Solution                       | Examples                                    |
|-------------|-----------------------|--------------------------------------------|---------------------------------------------|
| n ≤ 12      | O(n!)                 | Recursion & Backtracking                   | Permutation 1….n                            |
| n ≤ 25      | O(2^n)                | Recursion, Backtracking & Bit Manipulation | All subsets of an array of size n           |
| n ≤ 100     | O(n^4)                | Dynamic Programming                        | 4Sum                                        |
| n ≤ 500     | O(n^3)                | Dynamic Programming                        | All triangles with side length less than n  |
| n ≤ 10^4    | O(n^2)                | Dynamic Programming, Graphs, Trees         | Bubble Sort (Slow comparison-based sorting) |
| n ≤ 10^6    | O(n log n)            | Sorting, Binary Search, Divide and Conquer | Merge Sort (Fast comparison-based sorting)  |
| n ≤ 10^8    | O(n)                  | Mathematical, Greedy                       | Min and max of element                      |
| n > 10^8    | O(log n) or O(1)      | Mathematical, Greedy                       | Binary Search                               |


---

Links referred :

1. https://www.geeksforgeeks.org/knowing-the-complexity-in-competitive-programming/
