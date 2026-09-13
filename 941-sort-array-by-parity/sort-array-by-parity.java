class Solution {
    public int[] sortArrayByParity(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        int even = 0;
        int odd = 0;

        // First place all even numbers
        for (int num : nums) {
            if (num % 2 == 0) {
                result[even] = num;
                even++;
            }
        }

        // Odd numbers start after the last even number
        odd = even;

        for (int num : nums) {
            if (num % 2 != 0) {
                result[odd] = num;
                odd++;
            }
        }

        return result;
    }
}