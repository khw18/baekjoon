import java.util.Scanner;

public class Main {
    public static boolean arr[][];
    public static int min = 64;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        arr = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String str = sc.next();
            for (int j = 0; j < M; j++) {
                if (str.charAt(j) == 'W') arr[i][j] = true;
                else arr[i][j] = false;
            }
        }

        int end_n = N - 7;
        int end_m = M - 7;

        for (int i = 0; i < end_n; i++) {
            for (int j = 0; j < end_m; j++) {
                find(i, j);
            }
        }

        System.out.println(min);

    }


    public static void find(int n, int m) {
        int cnt = 0;
        boolean tf = arr[n][m];

        for (int i = n; i < n+8; i++) {
            for (int j = m; j < m + 8; j++) {
                if (arr[i][j] != tf) cnt++;
                tf = !tf;
            }
            tf = !tf;
        }
        cnt = Math.min(cnt, 64 - cnt);
        min = Math.min(min, cnt);
    }
}