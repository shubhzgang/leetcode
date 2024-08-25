[100\. Same Tree](https://leetcode.com/problems/same-tree/)

Given the roots of two binary trees `p` and `q`, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/12/20/ex1.jpg)

<blockquote>
<strong>Input:</strong> p = [1,2,3], q = [1,2,3]

<strong>Output:</strong> true
</blockquote>

**Example 2:**

![](https://assets.leetcode.com/uploads/2020/12/20/ex2.jpg)

<blockquote>
<strong>Input:</strong> p = [1,2], q = [1,null,2]

<strong>Output:</strong> false
</blockquote>

**Example 3:**

![](https://assets.leetcode.com/uploads/2020/12/20/ex3.jpg)

<blockquote>
<strong>Input:</strong> p = [1,2,1], q = [1,1,2]

<strong>Output:</strong> false
</blockquote>

**Constraints:**
-   The number of nodes in both trees is in the range `[0, 100]`.
-   `-10<sup>4</sup> <= Node.val <= 10<sup>4</sup>`