class Solution {

    public int[][] generateMatrix(int n) {

        int[][] arr = new int[n][n];

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        int count = 1;

        while (top <= bottom && left <= right) {

            // 1. Left -> Right
            for (int i = left; i <= right; i++) {
                arr[top][i] = count;
                count++;
            }
            top++;

            // 2. Top -> Bottom
            for (int j = top; j <= bottom; j++) {
                arr[j][right] = count;
                count++;
            }
            right--;

            // 3. Right -> Left
            if (top <= bottom) {
                for (int k = right; k >= left; k--) {
                    arr[bottom][k] = count;
                    count++;
                }
                bottom--;
            }

            // 4. Bottom -> Top
            if (left <= right) {
                for (int l = bottom; l >= top; l--) {
                    arr[l][left] = count;
                    count++;
                }
                left++;
            }
        }

        return arr;
    }
}