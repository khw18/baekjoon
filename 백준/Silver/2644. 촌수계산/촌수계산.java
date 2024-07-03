import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    static int n, m, a, b;
    static boolean[][] map;
    static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(br.readLine());

        map = new boolean[n + 1][n + 1];
        visit = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            map[x][y] = true;
            map[y][x] = true; 
        }

        System.out.println(bfs());
    }

    public static int bfs() {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{a, 0});
        visit[a] = true;

        while (!q.isEmpty()) {
            int[] current = q.poll();
            int person = current[0];
            int count = current[1];

            if (person == b) {
                return count;
            }

            for (int i = 1; i <= n; i++) {
                if (map[person][i] && !visit[i]) {
                    q.offer(new int[]{i, count + 1});
                    visit[i] = true;
                }
            }
        }
        return -1; // 촌수를 찾을 수 없는 경우
    }
}
