import java.util.HashSet;

public class Solution {
    public static int solution(int[] nums) {
        int max = nums.length/2;

        HashSet<Integer> hashSet = new HashSet<>();
        for (int n : nums) {
            hashSet.add(n);
        }
        if (hashSet.size() > max)
            return max;
        else
            return hashSet.size();
    }
}
