import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    static int N, K;
    static boolean[] visit = new boolean[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        System.out.println(bfs());
        
    }

    public static int bfs() {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{N, 0});
        visit[N] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int[] nx = {x - 1, x + 1, x * 2};

            if (x == K)
                return cur[1];

            for (int n : nx) {
                if (n >= 0 && n <= 100000 && !visit[n]) {
                    q.offer(new int[]{n, cur[1] + 1});
                    visit[n] = true;
                }
            }
        }
        return 0;
    }
}