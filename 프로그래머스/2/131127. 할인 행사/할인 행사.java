import java.util.*;
import java.io.*;

class Solution {
    static Map<String, Integer> map = new HashMap<>();
    public int solution(String[] want, int[] number, String[] discount) {
        for(int i = 0; i < want.length; i++){
            map.put(want[i], number[i]);
        }
        int answer = 0;
        for(int i = 0; i <= discount.length - 10; i++){
            if(check(discount, i))
                answer++;
        }
        
        return answer;
    }
    
    static boolean check(String[] dis, int idx){
        Map<String, Integer> temp = new HashMap<>(map);
        for(int i = idx; i < idx + 10; i++) {
            if(temp.containsKey(dis[i]) && temp.get(dis[i]) > 0)
                temp.put(dis[i], temp.get(dis[i])-1);
        }
        for(int v : temp.values()){
            if(v != 0)
                return false;
        }
        return true;
    }
}