package com.shubham.leetcode.N1318;

/**
 * <a href="https://leetcode.com/problems/design-a-stack-with-increment-operation/">1381. Design a Stack With Increment Operation</a>
 */
class CustomStack {
    int[] stack;
    int[] inc;
    int size;
    int capacity;
    public CustomStack(int maxSize) {
        stack = new int[maxSize];
        inc = new int[maxSize];
        capacity = maxSize;
        size = -1;
    }

    public void push(int x) {
        if (size == capacity - 1) {
            return;
        }
        stack[++size] = x;
    }

    public int pop() {
        if (size == -1) {
            return -1;
        }
        int ret = stack[size] + inc[size];

        if (size > 0) {
            inc[size - 1] += inc[size];
        }
        inc[size] = 0;
        size--;
        return ret;
    }

    public void increment(int k, int val) {
        if (size < 0) {
            return;
        }
        int incIndex = Math.min(size, k - 1);
        inc[incIndex] += val;
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */