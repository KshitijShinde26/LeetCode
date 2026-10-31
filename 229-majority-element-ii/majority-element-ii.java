
import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = nums.length;
        int half = n / 3;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) > half) {
                result.add(key);
            }
        }

        return result;
    }
}
