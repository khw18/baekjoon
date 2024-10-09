import java.io.*;
import java.util.*;

class Solution {
    static int[] nums;
    static int tgt, cnt = 0;
    public int solution(int[] numbers, int target) {
        nums = numbers;
        tgt = target;
        dfs(0,0);
        int answer = cnt;
        return answer;
    }
    static void dfs(int len, int sum){
        if(len == nums.length){
            if(sum == tgt){
                cnt++;
            }
            return;
        }
        dfs(len+1, sum+nums[len]);
        dfs(len+1, sum-nums[len]);
    }
}