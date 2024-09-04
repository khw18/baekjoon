import java.util.*;
import java.io.*;

class Solution {
    public String solution(String s) {        
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' ') {
                first = true;
                sb.append(s.charAt(i));
                continue;
            }
            if(first) {
                if(Character.isLowerCase(s.charAt(i)))
                    sb.append(Character.toUpperCase(s.charAt(i)));
                else 
                    sb.append(s.charAt(i));
                first = false;
                continue;
            }
            else{
                if(Character.isUpperCase(s.charAt(i)))
                    sb.append(Character.toLowerCase(s.charAt(i)));
                else
                    sb.append(s.charAt(i));
                continue;
            }
        }
        return sb.toString();
    }
}