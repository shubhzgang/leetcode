package com.shubham.leetcode.N36;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/valid-sudoku/">36. Valid Sudoku</a>
 */
class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] rowSet, colSet;
        rowSet = colSet = new int[10];
        int row, col;
        for (int i = 0; i < 9; i++) {
            Arrays.fill(rowSet, 0);
            for (int j = 0; j < 9; j++) {
                row = board[i][j] - '0';
                if (row < 0) {
                    continue;
                }
                if (rowSet[row] == 1) {
                    return false;
                }
                rowSet[row] = 1;
            }
        }

        for (int i = 0; i < 9; i++) {
            Arrays.fill(colSet, 0);
            for (int j = 0; j < 9; j++) {
                col = board[j][i] - '0';
                if (col < 0) {
                    continue;
                }
                if (colSet[col] == 1) {
                    return false;
                }
                colSet[col] = 1;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Arrays.fill(rowSet, 0);
                for (int k = i * 3; k < (i + 1) * 3; k++) {
                    for (int l = j * 3; l < (j + 1) * 3; l++) {
                        row = board[k][l] - '0';
                        if (row < 0) {
                            continue;
                        }
                        if (rowSet[row] == 1) {
                            return false;
                        }
                        rowSet[row] = 1;
                    }
                }
            }
        }
        return true;
    }

    // shubham  gangwal
}