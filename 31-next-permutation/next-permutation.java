class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        int n = nums.length;
        int pivot = 0;
        int idx1 = 0;
        int idx2 = 0;
        int j = nums.length - 1;
        boolean found = false;                         // ADD

        while (i >= 0) {
            if (nums[i] < nums[i + 1]) {
                found = true;                          // ADD
                pivot = nums[i];
                idx1 = i;

                j = nums.length - 1;                   // ADD

                while (j >= 0) {
                    if (pivot < nums[j]) {
                        idx2 = j;
                        break;
                    }
                    j--;
                }

                swap(nums, i, idx2);
                reverse(nums, idx1 + 1, n - 1);        // ADD
                break;                                 // ADD
            }

            i--;
        }

        if (!found) {                                  // ADD
            reverse(nums, 0, n - 1);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}