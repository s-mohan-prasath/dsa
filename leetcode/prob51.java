package leetcode;

import java.util.*;

//TODO: multiple solution of the n, my algorithm is creating only the 'n' solution to the problem
class prob51 {
    List<List<String>> output = new ArrayList<List<String>>();
    List<String> arrayStr = new ArrayList<>();

    int count = 1;

    public List<List<String>> solveNQueens(int n) {
        int[] ith = new int[n];
        int[] jth = new int[n];
        int[][] arr = new int[n][n];

        print(ith, jth, arr);
        if (n == 1) {
            arrayStr.add("Q");
            output.add(arrayStr);
        } else {
            int i = 0;
            for (int j = 0; j < n; j++) {
                arr[i][j] = 1;
                arrayStr.add(makeStr(j, n));
                recursive(i + 1, arr, n, ith, jth);
                count = 1;
                print(ith, jth, arr);
            }
        }
        return output;
    }

    private boolean queenAttacks(int i, int j, int[][] arr, int n) {
        int ii = i;
        int jj = j;
        while (ii >= 0) {
            if (arr[ii][jj] == 1)
                return true;
            ii--;
        }
        ii = i;
        jj = j;
        while (jj >= 0 && ii >= 0) {
            if (arr[ii][jj] == 1)
                return true;
            jj--;
            ii--;
        }
        ii = i;
        jj = j;
        while (jj < n && ii >= 0) {
            if (arr[ii][jj] == 1)
                return true;
            jj++;
            ii--;
        }
        return false;
    }

    private void recursive(int i, int[][] arr, int n, int[] ith, int[] jth) {
        if (i == n) {
            if (count == n) {
                output.add(arrayStr);
                arrayStr = new ArrayList<>();
            }
            return;
        }
        ;
        boolean already = false;
        String str = "";
        for (int j = 0; j < n; j++) {
            if (!already && !queenAttacks(i, j, arr, n)) {
                str += "Q";
                count++;
                ith[i] = i;
                jth[i] = j;
                already = true;
            } else {
                str += ".";
            }
        }
        if (count == i + 1 || n < 4) {
            arrayStr.add(str);
            recursive(i + 1, arr, n, ith, jth);
        }
    }

    private String makeStr(int j, int n) {
        String s = "";
        for (int k = 0; k < n; k++) {
            if (k == j)
                s += "Q";
            else
                s += ".";
        }
        return s;
    }

    private void print(int[] ith, int[] jth, int[][] arr) {
        System.out.println(Arrays.toString(ith));
        System.out.println(Arrays.toString(jth));
        for (int[] fsd : arr) {
            System.out.println(Arrays.toString(fsd));
        }
    }
}