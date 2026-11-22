class Solution {
    public String interpret(String command) {
        String a = "";
        int n = command.length();
        String com = command;
        for(int i = 0;i<n;i++){
            if(com.charAt(i)=='G'){
                a = a + com.charAt(i);
            }
            else if(com.charAt(i)=='('){
                if(com.charAt(i+1)==')'){
                    a = a + 'o';
                    i++;
                }
                else{
                    a = a + "al";
                    i = i + 3; 
                }
            }
        }
        return a;
    }
}