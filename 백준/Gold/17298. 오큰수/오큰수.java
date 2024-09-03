import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] ans = new int[N];



        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        if (N == 1) {
            System.out.println(-1);
            return;
        }

        Stack<Integer> s = new Stack<>();
        s.add(A[N-1]);
        int n = N-1;
        ans[n--] = -1;

        for(int i = N-2; i >= 0; i--) {
            while(!s.isEmpty() && A[i] >= s.peek())
                s.pop();
            if (s.isEmpty()) {
                ans[n--] = -1;
            } else {
                ans[n--] = s.peek();
            }
            s.add(A[i]);
        }

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(ans[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
