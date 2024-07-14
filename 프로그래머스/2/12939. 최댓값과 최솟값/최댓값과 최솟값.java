import java.util.*;
import java.io.*;

class Solution {
    public String solution(String s) {
        StringTokenizer st = new StringTokenizer(s);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while(st.hasMoreTokens()){
            int n = Integer.parseInt(st.nextToken());
            min = Integer.min(min, n);
            max = Integer.max(max, n);
        }
        
        String answer = min + " " + max;
        return answer;
    }
}