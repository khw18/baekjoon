import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = dfs(s, 0, 0);
        return answer;
    }
    static int[] dfs(String str, int cnt, int zero){
        StringBuilder sb = new StringBuilder();
        if(str.equals("1")){
            return new int[]{cnt, zero};
        }
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '0'){
                zero++;
                continue;
            }
            sb.append(str.charAt(i));
        }
        str = Integer.toBinaryString(sb.length());
        return dfs(str, cnt+1, zero);
    }
}