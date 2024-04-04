import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Main {
    static Stack<Character> stack = new Stack<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        loop:
        while (true) {
            //한 줄씩
            String str = br.readLine();
            if (str.equals(".")) {
                break;
            }
            //한 글자씩
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(' || str.charAt(i) == '[') {
                    stack.push(str.charAt(i));
                } else if (str.charAt(i) == ')') {
                    if (stack.empty() || stack.pop() != '(') {
                        System.out.println("no");
                        stack.clear();
                        continue loop;
                    }
                } else if (str.charAt(i) == ']') {
                    if (stack.empty() || stack.pop() != '[') {
                        System.out.println("no");
                        stack.clear();
                        continue loop;
                    }
                }
            }
            if (stack.empty()) {
                System.out.println("yes");
            }
            else System.out.println("no");

            stack.clear();
        }
    }
}
