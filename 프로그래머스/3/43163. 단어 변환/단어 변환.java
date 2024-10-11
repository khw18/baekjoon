import java.util.*;

class Solution {
   	static String tgt;
    static String[] wd;
    static int min = Integer.MAX_VALUE;
    static boolean[] visit;
    
    public int solution(String begin, String target, String[] words) {
        visit = new boolean[words.length];
        tgt = target;
        wd = words;
        dfs(0, begin);
        int answer = min;
        return answer == Integer.MAX_VALUE ? 0 : answer;
    }
    static void dfs(int cnt, String str){
        boolean find = false;
        if(str.equals(tgt)){
            min = Math.min(min, cnt);
            return;
        }
        for(int i = 0; i < wd.length; i++){
            if(!vs(str,wd[i]) || visit[i])
                continue;
            visit[i] = true;
            find = true;
            dfs(cnt+1, wd[i]);
            visit[i] = false;
        }
        if(!find)
            return;
    }
    static boolean vs(String a, String b){
        int c = 0;
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == b.charAt(i))
                c++;
        }
        return c == a.length()-1 ? true : false;
    }
}