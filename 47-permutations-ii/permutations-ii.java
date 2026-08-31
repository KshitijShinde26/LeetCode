import java.util.*;

class Solution {

    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();

    void solve(int[] nums, boolean[] used) {

        // If permutation is complete
        if (temp.size() == nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        // Try every element
        for (int i = 0; i < nums.length; i++) {

            // Already used
            if (used[i])
                continue;

            // Avoid duplicate permutations
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])
                continue;

            // Choose
            used[i] = true;
            temp.add(nums[i]);

            // Recursion
            solve(nums, used);

            // Backtrack
            temp.remove(temp.size() - 1);
            used[i] = false;
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {

        // Sort the array
        Arrays.sort(nums);

        // Initially all elements are unused
        boolean[] used = new boolean[nums.length];

        // Start backtracking
        solve(nums, used);

        return ans;
    }
}