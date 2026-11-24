class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int minl = Integer.MAX_VALUE;
        int sum = 0;
        int n = nums.length;
        int right =0;
        while(right<n ){
            sum += nums[right];
            
            while(sum>= target){
                minl = Math.min(minl,right - left+1);
                sum -= nums[left];
                left++;
                
            }
            
                right++;
            
        }
        return minl == Integer.MAX_VALUE ? 0 : minl;
    }
}