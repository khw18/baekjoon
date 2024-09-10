import java.util.*;
import java.io.*;

class Main{
    static int N, K, cnt = 0;
    static int[] A;
    static boolean[] R;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        A = new int[N * 2];
        R = new boolean[N * 2];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A.length; i++)
            A[i] = Integer.parseInt(st.nextToken());

        int ans = 0;
        while (cnt < K) {
            moveB();
            moveR();
            upR();
            ans++;
        }
        System.out.println(ans);
    }

    static void moveB() { // 벨트와 로봇 한칸 이동
        int[] TA = new int[N * 2];
        boolean[] TR = new boolean[N * 2];
        for (int i = 1; i < N * 2; i++) {
            TA[i] = A[i - 1];
            TR[i] = R[i - 1];
        }
        TA[0] = A[A.length - 1];
        TR[0] = R[R.length - 1];
        A = TA;
        R = TR;
    }

    static void moveR() { // 가능한 로봇 다 이동 + 내구도 감소
        // 내리는 위치에 있는 로봇을 먼저 내려줌
        if (R[N - 1]) R[N - 1] = false;

        // 역순으로 로봇 이동 처리
        for (int i = N - 2; i >= 0; i--) {
            if (R[i] && !R[i + 1] && A[i + 1] > 0) {
                R[i] = false;
                R[i + 1] = true;
                A[i + 1]--;
                if (A[i + 1] == 0) cnt++;
            }
        }

        // 마지막 위치에서 로봇 내리기
        if (R[N - 1]) R[N - 1] = false;
    }


    static void upR() { // 로봇 올리기
        if (!R[0] && A[0] > 0) {
            R[0] = true;
            A[0]--;
            if(A[0] == 0)
                cnt++;
        }
    }
}