class Solution {
    public boolean uniformArray(int[] nums1) {

        int min = Integer.MAX_VALUE;

        // Find minimum element
        for (int num : nums1) {
            min = Math.min(min, num);
        }

        // If minimum is odd, we can make everything odd
        if (min % 2 == 1) {
            return true;
        }

        // Minimum is even.
        // If any odd exists, impossible.
        for (int num : nums1) {
            if (num % 2 == 1) {
                return false;
            }
        }

        // All elements are even
        return true;
    }
}