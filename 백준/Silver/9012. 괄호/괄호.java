import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '(') {
                    stack.push(str.charAt(j));
                } else if (str.charAt(j) == ')') {
                    if (stack.empty()) {
                        stack.push(str.charAt(j));
                    }
                    else{
                        if (stack.peek() == '(') {
                            stack.pop();
                        }
                    }
                }
            }
            if (stack.empty())
                System.out.println("YES");
            else System.out.println("NO");

            stack.clear();
        }
    }
}