import java.io.*;
import java.util.*;

class Main {
    static int[][] dp;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            dp = new int[M + 1][N + 1];
            System.out.println(bc(M,N));
        }
    }
    static int bc(int M, int N){
        if(dp[M][N] > 0)
            return dp[M][N];
        if(N == 0 || N == M)
            return 1;
        return dp[M][N] = bc(M-1,N-1) + bc(M-1, N);
    }
}
