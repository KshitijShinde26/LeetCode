class Solution {

    public int minDistance(String word1, String word2) {

        int m = word1.length();
        int n = word2.length();

        int[][] arr = new int[m + 1][n + 1];

        // Convert word1[0...i] to empty string
        // Requires i deletions
        for (int i = 0; i <= m; i++) {
            arr[i][0] = i;
        }

        // Convert empty string to word2[0...j]
        // Requires j insertions
        for (int j = 0; j <= n; j++) {
            arr[0][j] = j;
        }

        // Fill DP table
        for (int a = 1; a <= m; a++) {

            for (int b = 1; b <= n; b++) {

                if (word1.charAt(a - 1) == word2.charAt(b - 1)) {

                    // Characters are same
                    arr[a][b] = arr[a - 1][b - 1];

                } else {

                    // Insert, Delete, Replace
                    arr[a][b] = 1 + Math.min(
                        arr[a][b - 1],       // Insert
                        Math.min(
                            arr[a - 1][b],   // Delete
                            arr[a - 1][b - 1] // Replace
                        )
                    );
                }
            }
        }

        return arr[m][n];
    }
}