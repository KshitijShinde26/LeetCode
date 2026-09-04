class Solution {
    public void setZeroes(int[][] num) {

        int m = num.length;
        int n = num[0].length;

        boolean[] rows = new boolean[m];
        boolean[] cols = new boolean[n];

        // Find all original zeros
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (num[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        // Make rows zero
        for (int i = 0; i < m; i++) {
            if (rows[i]) {
                for (int j = 0; j < n; j++) {
                    num[i][j] = 0;
                }
            }
        }

        // Make columns zero
        for (int j = 0; j < n; j++) {
            if (cols[j]) {
                for (int i = 0; i < m; i++) {
                    num[i][j] = 0;
                }
            }
        }
    }
}