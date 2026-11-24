class Solution {
    public int maxLength(int[] nums) {
        int maxLen = 0;
        int n = nums.length;
        for(int i =0;i<n;i++){
            long pro = 1;
            int gcd = nums[i];
            int lcm = nums[i];
            for(int j =i;j<n;j++){
                pro = nums[j]*pro;
                gcd = fgcd(gcd,nums[j]);
                lcm = (lcm/fgcd(lcm,nums[j]))*nums[j];
                if(pro==(long)gcd*lcm){
                    maxLen = Math.max(maxLen,j-i+1);
                }
            }
        }
        return maxLen;
    }
    public int fgcd(int a ,int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}