import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[][] arr = new int[6][2];
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            arr[Integer.parseInt(st.nextToken())-1][S]++;
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 2; j++) {
                cnt += (int) Math.ceil(arr[i][j] / (K * 1.0));
            }
        }

        System.out.println(cnt);
    }
}