import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
    static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int X = 0;
        for (int i = 0; i < N; i++) {
            String oper = br.readLine();
            if (oper.contains("push")) {
                StringTokenizer st = new StringTokenizer(oper);
                oper = st.nextToken();
                X = Integer.parseInt(st.nextToken());
            }
            switch (oper) {
                case "push":
                    push(X);
                    break;
                case "pop":
                    System.out.println(pop());
                    break;
                case "size":
                    System.out.println(size());
                    break;
                case "empty":
                    System.out.println(empty());
                    break;
                case "top":
                    System.out.println(top());
                    break;
            }
        }
    }

    static void push(int X) {
        stack.push(X);
    }

    static int pop() {
        return stack.empty() ? -1 : stack.pop();
    }

    static int size() {
        return stack.size();
    }

    static int empty() {
        return stack.empty() ? 1 : 0;
    }

    static int top() {
        return stack.empty() ? -1 : stack.peek();
    }
}