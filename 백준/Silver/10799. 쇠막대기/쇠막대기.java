import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Stack<Character> stack = new Stack<>();
        int ans = 0;

        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == '('){
                stack.add('(');
            }
            if(input.charAt(i) == ')'){
                if (stack.peek() == '(') {
                    if (input.charAt(i - 1) == '(') { //열린 괄호가 직전이면 레이저
                        stack.pop();
                        ans += stack.size(); // 스택 개수(현재 쌓인 스틱) 더함
                    } else { //열린 괄호가 직전은 아니면 스틱 끝
                        stack.pop();
                        ans++; // 닫힐 때 + 1
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
