class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int cnt = 0;
        int temp = 0;

        for(int i = 0; i < k; i++){
            char c = s.charAt(i);

            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                temp++;
            }
        }

        cnt = temp;

        for(int i = k; i < n; i++){
            char c1 = s.charAt(i-k);
            char c2 = s.charAt(i);

            if(c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u'){
                temp--;
            }

            if(c2=='a'||c2=='e'||c2=='i'||c2=='o'||c2=='u'){
                temp++;
            }

            if(temp > cnt){
                cnt = temp;
            }
        }

        return cnt;
    }
}