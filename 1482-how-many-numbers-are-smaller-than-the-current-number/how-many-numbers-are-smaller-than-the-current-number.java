class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        int n = nums.length;
        for(int i =0;i<n;i++){
            int a = nums[i];
            int count = 0;
            for(int j = 0;j<n;j++){
                if(a>nums[j]){
                    count++;
                }
            }
            res[i] = count;
        }
        return res;
    }
}