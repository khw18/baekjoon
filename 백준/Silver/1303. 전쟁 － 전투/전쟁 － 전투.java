import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static char[][] map;
    static boolean[][] visit;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int N, M, white = 0, blue = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 가로 크기
        M = Integer.parseInt(st.nextToken()); // 세로 크기

        map = new char[M][N]; // 주의: 세로 크기 M, 가로 크기 N
        visit = new boolean[M][N];

        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            map[i] = str.toCharArray();
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (!visit[i][j]) {
                    int power = dfs(i, j, map[i][j]);
                    if (map[i][j] == 'W') {
                        white += power * power;
                    } else blue += power * power;
                }
            }
        }
        System.out.println(white + " " + blue);

    }

    private static int dfs(int x, int y, char color) {
        // 배열 범위를 벗어나면 0을 반환
        if (x < 0 || x >= M || y < 0 || y >= N || visit[x][y] || map[x][y] != color) {
            return 0;
        }
        visit[x][y] = true;
        int power = 1;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            power += dfs(nx, ny, color);
        }
        return power;
    }
}
