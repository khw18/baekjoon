import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < my_string.length(); i++){
            if(Character.isLowerCase(my_string.charAt(i)))
                sb.append(Character.toUpperCase(my_string.charAt(i)));
            if(Character.isUpperCase(my_string.charAt(i)))
                sb.append(Character.toLowerCase(my_string.charAt(i)));
        }
        String answer = sb.toString();
        return answer;
    }
}