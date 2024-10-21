package leetcode;
//TODO: time limit exceeded for the input with large size and the elements are in decreasing order
class prob55 {
    private boolean output = false;

    public boolean canJump(int[] nums) {
        int len = nums.length;
        recursive(0, nums, len);
        return output;
    }

    private void recursive(int i, int[] arr, int n) {
        if (i >= n - 1) {
            this.output = true;
        } else if (this.output == false) {
            for (int k = arr[i]; k >= 1; k--) {
                if (this.output == false) {
                    recursive(i + k, arr, n);
                } else {
                    break;
                }
            }
        }
        return;
    }
}