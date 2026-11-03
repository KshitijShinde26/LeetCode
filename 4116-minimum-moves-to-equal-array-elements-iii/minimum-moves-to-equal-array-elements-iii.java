class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        int max = 0;
        for(int num : nums){
            if(num>max){
                max = num;
            }
        }
        for(int i = 0 ;i < n;i++){
            if(nums[i]==max){
                continue;
            }
            else if(nums[i]<max){
                nums[i] = nums[i]+1;
                cnt++;
                while(nums[i]<max){
                    nums[i] = nums[i]+1;
                    cnt++;
                }
            }
        }
        return cnt;
    }
}