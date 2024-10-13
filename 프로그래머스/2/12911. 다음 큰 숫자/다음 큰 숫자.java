import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = dfs(one(n), n+1);
        return answer;
    }
    static int dfs(int tgt, int n){
        if(tgt == one(n))
            return n;
        return dfs(tgt, n+1);
    }
    static int one(int n){
        String str = Integer.toBinaryString(n); 
        int cnt = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '1')
                cnt++;
        }
        return cnt;
    }
}