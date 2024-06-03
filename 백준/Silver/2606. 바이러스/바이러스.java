import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    static int n;
    static int e;
    static boolean[][] edge;
    static boolean[] visit;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        e = Integer.parseInt(br.readLine());

        edge = new boolean[n + 1][n + 1];
        visit = new boolean[n + 1];

        for (int i = 0; i < e; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            edge[a][b] = true;
            edge[b][a] = true;
        }
        System.out.println(bfs(1));
    }

    static int bfs(int s) {
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        visit[s] = true;
        int cnt = 0;

        while (!q.isEmpty()) {
            int cur = q.poll();

            for (int i = 1; i <= n; i++) {
                if (edge[cur][i] && !visit[i]) {
                    q.add(i);
                    visit[i] = true;
                    cnt++;
                }
            }
        }
        return cnt;
    }
}