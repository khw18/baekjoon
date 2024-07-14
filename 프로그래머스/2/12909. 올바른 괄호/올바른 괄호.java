import java.util.*; 

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> sk = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c=='(')
            	sk.add(c);
            else{
                if(sk.isEmpty())
                    return false;
                else{
                    sk.pop();
                }
            }
        }
        if(!sk.isEmpty())
        	answer = false;


        return answer;
    }
}