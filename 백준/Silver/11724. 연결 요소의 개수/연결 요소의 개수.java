import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    static int n, m;
    static boolean[][] map;
    static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new boolean[n + 1][n + 1];
        visit = new boolean[n + 1];
        int cnt = 0;

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            map[u][v] = true;
            map[v][u] = true;
        }
        for (int i = 1; i <= n; i++) {
            if (!visit[i]) {
                bfs(i);
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    public static void bfs(int s) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(s);
        visit[s] = true;

        while (!q.isEmpty()) {
            int cur = q.poll();
            for (int i = 1; i <= n; i++) {
                if (map[cur][i] && !visit[i]) {
                    q.offer(i);
                    visit[i] = true;
                }
            }
        }
    }

    public static void dfs(int s) {
        visit[s] = true;

        for (int i = 1; i <= n; i++) {
            if (map[s][i] && !visit[i]) {
                dfs(i);
            }
        }
    }

}