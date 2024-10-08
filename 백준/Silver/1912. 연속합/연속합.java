import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] seq = new int[N];
        int[] dp = new int[N];

        for(int i = 0; i < N; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }
        dp[0] = seq[0];
        int max = dp[0];
        for(int i = 1; i < N; i++) {
            dp[i] = Math.max(dp[i-1] + seq[i], seq[i]);
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }


}