[463\. Island Perimeter](https://leetcode.com/problems/island-perimeter/)

You are given `row x col` `grid` representing a map where `grid[i][j] = 1` represents land and `grid[i][j] = 0` represents water.

Grid cells are connected **horizontally/vertically** (not diagonally). The `grid` is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).

The island doesn't have "lakes", meaning the water inside isn't connected to the water around the island. One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.

**Example 1:**

![](https://assets.leetcode.com/uploads/2018/10/12/island.png)

<blockquote>

<strong>Input:</strong> grid = [[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]

<strong>Output:</strong> 16

<strong>Explanation:</strong> The perimeter is the 16 yellow stripes in the image above.
</blockquote>

**Example 2:**

<blockquote>

<strong>Input:</strong> grid = [[1]]

<strong>Output:</strong> 4
</blockquote>

**Example 3:**

<blockquote>

<strong>Input:</strong> grid = [[1,0]]

<strong>Output:</strong> 4
</blockquote>

**Constraints:**

-   `row == grid.length`
-   `col == grid[i].length`
-   `1 <= row, col <= 100`
-   `grid[i][j]` is `0` or `1`.
-   There is exactly one island in `grid`.