class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();
        int left =0;
        int right = 0;
        int cost  =0;
        int maxlen=0;
        while(right<n){
            int diff = Math.abs(s.charAt(right)-t.charAt(right));
            cost+=diff;
            while(cost>maxCost){
                cost -= Math.abs(s.charAt(left)-t.charAt(left));
                left++;
            }
            maxlen = Math.max(maxlen,right-left+1);
            right++;
        }
        return maxlen;
    }
}