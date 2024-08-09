[840\. Magic Squares In Grid](https://leetcode.com/problems/magic-squares-in-grid/)

Medium

Topics

Companies

A `3 x 3` **magic square** is a `3 x 3` grid filled with distinct numbers **from** 1 **to** 9 such that each row, column, and both diagonals all have the same sum.

Given a `row x col` `grid` of integers, how many `3 x 3` contiguous magic square subgrids are there?

Note: while a magic square can only contain numbers from 1 to 9, `grid` may contain numbers up to 15.

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/09/11/magic_main.jpg)

<strong>Input:</strong> grid = [[4,3,8,4],[9,5,1,9],[2,7,6,2]]

<strong>Output:</strong> 1

<strong>Explanation: </strong>

The following subgrid is a 3 x 3 magic square:

<img alt="" src="https://assets.leetcode.com/uploads/2020/09/11/magic_valid.jpg" style="width: 242px; height: 242px;">

while this one is not:

<img alt="" src="https://assets.leetcode.com/uploads/2020/09/11/magic_invalid.jpg" style="width: 242px; height: 242px;">

In total, there is only one magic square inside the given grid.

**Example 2:**

<strong>Input:</strong> grid = [[8]]

<strong>Output:</strong> 0

**Constraints:**

-   `row == grid.length`
-   `col == grid[i].length`
-   `1 <= row, col <= 10`
-   `0 <= grid[i][j] <= 15`