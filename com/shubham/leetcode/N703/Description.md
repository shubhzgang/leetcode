[703\. Kth Largest Element in a Stream](https://leetcode.com/problems/kth-largest-element-in-a-stream/)

Easy

Design a class to find the k<sup>th</sup> largest element in a stream. Note that it is the k<sup>th</sup> largest element in the sorted order, not the k<sup>th</sup> distinct element.

Implement `KthLargest` class:

-   `KthLargest(int k, int[] nums)` Initializes the object with the integer `k` and the stream of integers `nums`.
-   `int add(int val)` Appends the integer `val` to the stream and returns the element representing the k<sup>th</sup> largest element in the stream.

**Example 1:**
><strong>Input</strong><br>
["KthLargest", "add", "add", "add", "add", "add"]<br>
[[3, [4, 5, 8, 2]], [3], [5], [10], [9], [4]]<br>
<strong>Output</strong><br>
[null, 4, 5, 5, 8, 8]<br><br>
<strong>Explanation</strong> <br>
KthLargest kthLargest = new KthLargest(3, [4, 5, 8, 2]);<br>
kthLargest.add(3);   // return 4 <br>
kthLargest.add(5);   // return 5<br>
kthLargest.add(10);  // return 5<br>
kthLargest.add(9);   // return 8<br>
kthLargest.add(4);   // return 8<br>

**Constraints:**

-   `1 <= k <= 10<sup>4</sup>`
-   `0 <= nums.length <= 10<sup>4</sup>`
-   `-10<sup>4</sup> <= nums[i] <= 10<sup>4</sup>`
-   `-10<sup>4</sup> <= val <= 10<sup>4</sup>`
-   At most `10<sup>4</sup>` calls will be made to `add`.
-   It is guaranteed that there will be at least `k` elements in the array when you search for the k<sup>th</sup> element.