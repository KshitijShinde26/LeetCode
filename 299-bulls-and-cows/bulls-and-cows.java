class Solution {
    public String getHint(String secret, String guess) {
        int b=0, c =0;
        boolean[] visited = new boolean[guess.length()];
        for(int i =0;i<secret.length();i++){
            if(secret.charAt(i)==guess.charAt(i)){
                b++;
                visited[i]=true;
            }
        }
        for(int i =0;i<secret.length();i++){
            if(secret.charAt(i)==guess.charAt(i)){
                continue;
            }
            for(int j = 0; j<guess.length();j++){
                if(!visited[j] && secret.charAt(i)==guess.charAt(j) && i!=j){
                    c++;
                    visited[j] = true;
                    break;
                }
            }
        }
        return b+"A"+c+"B";
    }
}