// Must do Pattern Problems before starting DSA

import java.util.Scanner;

class lec2 {
    public lec2() {

    }

    // pattern : https://static.takeuforward.org/wp/uploads/2022/08/P1.png
    public void pattern7() {
        int n = this.getNumber();
        int start, end, i, j;
        start = n - 1;
        end = n;
        i = 0;
        while (i < n) {
            j = 0;
            while (j < end) {
                if (j >= start) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
            start--;
            end++;
        }
    }

    // pattern : https://static.takeuforward.org/wp/uploads/2022/08/P9.png
    public void pattern9() {
        System.out.println("Number of Line in the Upper Triangle");
        int n = this.getNumber();
        int start, end, i, j, k;
        k = 2 * n;
        start = n;
        end = n + 1;
        i = 1;
        while (i <= k) {
            j = 1;
            while (j < end) {
                if (j >= start)
                    System.out.print("0");
                else {
                    System.out.print(" ");
                }
                j++;
            }
            if (i == n - 1) {
                // nothing will happen
            } else if (i >= n) {
                start++;
                end--;
            } else {
                start--;
                end++;
            }
            System.out.println();
            i++;
        }
    }

    // pattern : https://static.takeuforward.org/wp/uploads/2022/08/P11.png
    public void pattern11() {
        int n = getNumber();
        int i, j, start;
        i = 1;
        while (i <= n) {
            j = i;
            start = j % 2;
            while (j > 0) {
                System.out.print(start);
                start = (j + 1) % 2;
                j--;
            }
            System.out.println();
            i++;
        }
    }

    // pattern : https://static.takeuforward.org/wp/uploads/2022/08/P12.png
    public void pattern12() {
        System.out.println("Enter any number from 0 to 9");
        int n = this.getNumber();
        int i, j1, j2, end1, start2;
        i = 0;
        end1 = start2 = i + 1;
        while (i < n) {
            j1 = 1;
            while (j1 <= n) {
                if (j1 < end1 + 1) {
                    System.out.print(j1);
                } else {
                    System.out.print(" ");
                }
                j1++;
            }
            end1++;
            j2 = n;
            while (j2 > 0) {
                if (j2 <= start2) {
                    System.out.print(j2);
                } else {
                    System.out.print(" ");
                }
                j2--;
            }
            System.out.println();
            start2++;
            i++;
        }
    }

    // pattern : TODO: work on the step 2 lec 2 patterns

    private int getNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number of Line : ");
        int n = scan.nextInt();
        scan.close();
        return n;
    }
}