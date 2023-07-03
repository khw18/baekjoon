import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++){
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N+1];

            for (int j = 0; j < N; j++){
                st = new StringTokenizer(br.readLine());
                int rank = Integer.parseInt(st.nextToken());
                arr[rank] = Integer.parseInt(st.nextToken());
            }
            int ans = 1;
            int min = arr[1];
            for (int j = 2; j <= N; j++){
                if (arr[j] < min) {
                    ans++;
                    min = arr[j];
                }
            }
            sb.append(ans);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}