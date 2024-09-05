import java.util.*;
import java.io.*;

class Main {
    static int n, m;
    static int[][] A;
    static boolean[][] visit;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        A = new int[n][m];
        visit = new boolean[n][m];
        int[] s = new int[3];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
                if(A[i][j] == 2)
                    s = new int[]{i, j, 0};
            }
        }
        bfs(s);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(!visit[i][j] && A[i][j] == 1) // 미방문인데 아직 1이면 못감
                    A[i][j] = -1;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

    }

    static void bfs(int[] s) {
        Queue<int[]> q = new LinkedList<>();
        q.add(s);
        visit[s[0]][s[1]] = true;
        A[s[0]][s[1]] = s[2];

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0];
            int c = cur[1];
            int cnt = cur[2];

            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];
                if (nr >= 0 && nc >= 0 && nr < n && nc < m && !visit[nr][nc] && A[nr][nc] != 0) {
                    q.add(new int[]{nr, nc, cnt + 1});
                    visit[nr][nc] = true;
                    A[nr][nc] = cnt + 1;
                }
            }
        }
    }
}
