import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] S = new int[N + 1];
        S[0] = 1;

        for(int i = 1; i <= N; i++){
            S[i] = S[i-1] * i;
        }
        System.out.println(S[N] / (S[N - K] * S[K]));


    }
}
