import java.io.*;
import java.util.*;

class Main {
    static long[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        dp = new long[N + 1][N + 1];
        System.out.println(bc(N,K));
    }
    static long bc(int n, int k){
        if (n == k || k == 0)
            return 1;
        if(dp[n][k] > 0)
            return dp[n][k];
        return dp[n][k] = (bc(n-1,k-1) + bc(n-1,k)) % 10007;
    }
}
