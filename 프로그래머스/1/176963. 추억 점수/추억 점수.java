import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> map = new HashMap<>();
        int[] answer = new int[photo.length];
        for(int i = 0; i < name.length; i++){
            map.put(name[i], yearning[i]);
        }
        int idx = 0;
        for(int i = 0; i < photo.length; i++){
            int sum = 0;
            for(int j = 0; j < photo[i].length; j++){
                sum += map.getOrDefault(photo[i][j],0);
            }
            answer[idx++] = sum;
        }
        return answer;
    }
}