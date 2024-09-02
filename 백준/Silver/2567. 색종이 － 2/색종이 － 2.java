import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean[][] visit = new boolean[101][101];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for(int j = x; j < x + 10; j++) {
                for(int k = y; k < y + 10; k++){
                    if(!visit[j][k])
                        visit[j][k] = true;
                }
            }
        }
        int ans = 0;
        for(int j = 0; j <= 100; j++) {
            for(int k = 0; k <= 100; k++) {
                if(visit[j][k]) {
                    if(j == 0 || !visit[j-1][k]) // 위가 빈칸
                        ans++;
                    if(j == 100 || !visit[j+1][k]) // 아래가 빈칸
                        ans++;
                    if(k == 0 || !visit[j][k-1]) // 좌가 빈칸
                        ans++;
                    if(k == 100 || !visit[j][k+1]) // 우가 빈칸
                        ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
