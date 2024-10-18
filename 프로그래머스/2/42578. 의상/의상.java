import java.util.*;

class Solution {
    static Map<String, List<String>> map = new HashMap<>();
    static List<String> types;
    static int answer = 1;
    
    public int solution(String[][] clothes) {
        for(String[] row : clothes){
            map.putIfAbsent(row[1], new ArrayList<>());
            map.get(row[1]).add(row[0]);
        }
        
        for(String type : map.keySet()){
            answer *= map.get(type).size() + 1;
        }
        
        return answer-1;
    }
    
}
