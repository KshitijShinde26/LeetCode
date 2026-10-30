class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        int[] freq = new int[1001];

        // Step 1: Count frequency
        for (int num : arr1) {
            freq[num]++;
        }

        int index = 0;

        // Step 2: Arrange according to arr2
        for (int num : arr2) {

            while (freq[num] > 0) {

                arr1[index] = num;
                index++;

                freq[num]--;
            }
        }

        // Step 3: Add remaining elements in ascending order
        for (int i = 0; i < 1001; i++) {

            while (freq[i] > 0) {

                arr1[index] = i;
                index++;

                freq[i]--;
            }
        }

        return arr1;
    }
}