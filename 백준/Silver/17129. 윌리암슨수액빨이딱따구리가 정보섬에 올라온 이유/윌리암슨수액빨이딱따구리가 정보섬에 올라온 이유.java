import java.util.*;
import java.io.*;

class Main {
    static int[][] A;
    static boolean[][] visit;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static int n, m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        A = new int[n][m];
        visit = new boolean[n][m];
        int[] s = new int[3];

        for(int i = 0; i < n; i++) {
            String str = br.readLine();
            for(int j = 0; j < m; j++) {
                A[i][j] = str.charAt(j) - '0';
                if(A[i][j] == 2)
                    s = new int[]{i, j, 0};
            }
        }

        bfs(s);
    }

    static void bfs(int[] s) {
        Queue<int[]> q = new LinkedList<>();
        q.add(s);
        visit[s[0]][s[1]] = true;

        while(!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];
            int cnt = cur[2];

            if (A[x][y] == 3 || A[x][y] == 4 || A[x][y] == 5) {
                System.out.println("TAK");
                System.out.println(cnt);
                return;
            }
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < m && A[nx][ny] != 1 && !visit[nx][ny]) {
                    q.add(new int[]{nx, ny, cnt+1});
                    visit[nx][ny] = true;
                }
            }
        }
        System.out.println("NIE");
    }
}
