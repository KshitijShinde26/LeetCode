class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int n1 = word1.length;
        int n2 = word2.length;
        String a = "" , b = "";
        for(int i =0;i<n1;i++){
            a = a + word1[i];
        }
        for(int j =0;j<n2;j++){
            b = b + word2[j];
        }
        if(a.equals(b)){
            return true;
        }
        return false;
    }
}