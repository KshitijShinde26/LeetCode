class Solution {
    public int maxProduct(int[] nums) {

        int n = nums.length;
        int pro = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            int p = 1;

            for (int j = i; j < n; j++) {

                p = p * nums[j];

                pro = Math.max(pro, p);
            }
        }

        return pro;
    }
}