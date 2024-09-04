import java.util.*;
import java.io.*;

class Main {
    static int[][] A;
    static int[][] dist;  // 최단 거리를 저장할 배열
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        A = new int[n][m];
        dist = new int[n][m];
        
        int[] start = new int[2];

        for(int i = 0; i < n; i++) {
            String str = br.readLine();
            for(int j = 0; j < m; j++) {
                A[i][j] = str.charAt(j) - '0';
                dist[i][j] = -1;  // 초기 거리는 -1로 설정
                if(A[i][j] == 2) {
                    start = new int[]{i, j};
                    dist[i][j] = 0;  // 시작 위치의 거리는 0
                }
            }
        }

        bfs(start);
    }

    static void bfs(int[] start) {
        Queue<int[]> q = new LinkedList<>();
        q.add(start);

        while(!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];

            // 음식(3, 4, 5)을 찾으면 그 거리 출력
            if (A[x][y] == 3 || A[x][y] == 4 || A[x][y] == 5) {
                System.out.println("TAK");
                System.out.println(dist[x][y]);
                return;
            }

            // 상하좌우로 이동
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 유효한 좌표이고, 방문하지 않았으며, 장애물이 아닐 경우
                if (nx >= 0 && ny >= 0 && nx < n && ny < m && A[nx][ny] != 1 && dist[nx][ny] == -1) {
                    q.add(new int[]{nx, ny});
                    dist[nx][ny] = dist[x][y] + 1;  // 거리 갱신
                }
            }
        }

        // 음식에 도달하지 못한 경우
        System.out.println("NIE");
    }
}
