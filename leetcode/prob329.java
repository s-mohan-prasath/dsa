package leetcode;

class prob329 {
    private int maxi = 1;
    private int[][] arr;

    public int longestIncreasingPath(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        this.arr = arr;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                recurse(i, j, n, m, 1);
            }
        }
        return this.maxi;
    }

    private void recurse(int i, int j, int n, int m, int c) {
        int curr = this.arr[i][j];
        boolean top = ch(i - 1, j, n, m) == 1 && curr < this.arr[i - 1][j];
        boolean right = ch(i, j + 1, n, m) == 1 && curr < this.arr[i][j + 1];
        boolean bottom = ch(i + 1, j, n, m) == 1 && curr < this.arr[i + 1][j];
        boolean left = ch(i, j - 1, n, m) == 1 && curr < this.arr[i][j - 1];
        if (top) {
            recurse(i - 1, j, n, m, c + 1);
        }
        if (right) {
            recurse(i, j + 1, n, m, c + 1);
        }
        if (bottom) {
            recurse(i + 1, j, n, m, c + 1);
        }
        if (left) {
            recurse(i, j - 1, n, m, c + 1);
        } else if (!top && !right && !bottom && !left) {
            this.maxi = max2(this.maxi, c);
        }
    }

    private int max2(int a, int b) {
        return (a > b) ? a : b;
    }

    private int ch(int i, int j, int n, int m) {
        if (i >= 0 && i < n && j >= 0 && j < m)
            return 1;
        return 0;
    }
}