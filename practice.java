import java.util.Arrays;

class practice {
    // global variables
    // strictlyIncrInMatrix
    private int count = 0;
    private int[] arr;

    // N Queen Problems
    private int countN = 0;

    public practice() {

    }

    public void change(int[] arr) {
        this.arr = arr;
        System.out.println(Arrays.toString(this.arr));
    }

    // count the number of strictly increasing path from any element to any element
    public void strictlyIncrInMatrix(int n, int m, int[][] arr) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                strictlyIncrInMatrixRecur(i, j, n, m, arr);
            }
        }
        System.out.println("Maximum Number of Strictly increasing path in the matrix is " + count);
    }

    private void strictlyIncrInMatrixRecur(int i, int j, int n, int m, int[][] arr) {
        count++;
        int curr = arr[i][j];
        if (ch(i - 1, j, n, m) == 1 && curr < arr[i - 1][j]) {
            strictlyIncrInMatrixRecur(i - 1, j, n, m, arr);
        }
        if (ch(i, j + 1, n, m) == 1 && curr < arr[i][j + 1]) {
            strictlyIncrInMatrixRecur(i, j + 1, n, m, arr);
        }
        if (ch(i + 1, j, n, m) == 1 && curr < arr[i + 1][j]) {
            strictlyIncrInMatrixRecur(i + 1, j, n, m, arr);
        }
        if (ch(i, j - 1, n, m) == 1 && curr < arr[i][j - 1]) {
            strictlyIncrInMatrixRecur(i, j - 1, n, m, arr);
        }
    }

    private int ch(int i, int j, int n, int m) {
        if (i >= 0 && i < n && j >= 0 && j < m)
            return 1;
        return 0;
    }



}