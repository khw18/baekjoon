import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int lct = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][N];

        int[] dr = {1, 0, -1, 0};
        int[] dc = {0, 1, 0, -1};

        int r = 0, c = 0, di = 0;
        for (int i = N*N; i > 0; i--) {
           arr[r][c] = i;
            int nr = r + dr[di];
            int nc = c + dc[di];

            if (nr < 0 || nc < 0 || nr >= N || nc >= N || arr[nr][nc] != 0) {
                di = (di + 1) % 4;
                nr = r + dr[di];
                nc = c + dc[di];
            }

            r = nr;
            c = nc;
        }
        int lctr = 0, lctc = 0;

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                sb.append(arr[i][j]).append(" ");
                if (arr[i][j] == lct) {
                    lctr = i + 1;
                    lctc = j + 1;
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
        System.out.println(lctr + " " + lctc);
    }
}