import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] top = new int[N];
        Stack<Integer> idx = new Stack<>();

        for(int i = 0; i < N; i++){
            top[i] = Integer.parseInt(st.nextToken());
        }

        idx.add(0);
        System.out.print(0 + " ");
        for(int i = 1; i < N; i++) {
            while(!idx.isEmpty() && top[idx.peek()] <= top[i]) // 내보다 큰 놈 나올때까지 꺼냄
                idx.pop();
            if(idx.isEmpty()) // 다 꺼내도 안 나옴
                System.out.print(0 + " ");
            else // 내보다 큰 놈 나옴 -> 수신 받는 놈 Idx 출력
                System.out.print(idx.peek() + 1 + " ");

            idx.add(i);
        }
    }
}
