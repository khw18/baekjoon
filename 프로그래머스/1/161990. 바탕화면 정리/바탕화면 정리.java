import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        String[] str = wallpaper;
        int maxr = Integer.MIN_VALUE;
        int maxc = Integer.MIN_VALUE;
        int minr = Integer.MAX_VALUE;
        int minc = Integer.MAX_VALUE;
        for(int i = 0; i < str.length; i++){
            for(int j = 0; j < str[0].length(); j++){
                if(str[i].charAt(j)=='#'){
                    maxr = Math.max(maxr, i);
                    maxc = Math.max(maxc, j);
                    minr = Math.min(minr, i);
                    minc = Math.min(minc, j);
                    System.out.println(i + " " + j);
                }
            }
        }
        int[] answer = new int[] {minr, minc, maxr+1, maxc+1};
        return answer;
    }
}