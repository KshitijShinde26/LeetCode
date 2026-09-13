class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {

        int n = img1.length;
        int maxOverlap = 0;

        // Try every possible row shift
        for (int dr = -(n - 1); dr <= n - 1; dr++) {

            // Try every possible column shift
            for (int dc = -(n - 1); dc <= n - 1; dc++) {

                int overlap = 0;

                // Check every cell of img1
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {

                        // Only move the 1s
                        if (img1[i][j] == 1) {

                            int newRow = i + dr;
                            int newCol = j + dc;

                            // Check whether translated position
                            // is inside img2
                            if (newRow >= 0 && newRow < n &&
                                newCol >= 0 && newCol < n &&
                                img2[newRow][newCol] == 1) {

                                overlap++;
                            }
                        }
                    }
                }

                maxOverlap = Math.max(maxOverlap, overlap);
            }
        }

        return maxOverlap;
    }
}