import java.util.*;
import java.io.*;

class Main{
    static int N, M, K, X;
    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    static ArrayList<Integer> res = new ArrayList<>();
    static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            list.get(Integer.parseInt(st.nextToken())).add(Integer.parseInt(st.nextToken()));
        }

        visit = new boolean[N + 1];
        bfs(X);

        Collections.sort(res);
        for(int i : res)
            System.out.println(i);

    }

    static void bfs(int s) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{s, 0});
        visit[s] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int city = cur[0];
            int cnt = cur[1];

            if(cnt == K)
                res.add(city);

            ArrayList<Integer> cList = list.get(city);
            for (int nCity : cList) {
                if (!visit[nCity]) {
                    q.add(new int[]{nCity, cnt + 1}); // bfs 는 첫 방문이 최단거리임.
                    visit[nCity] = true;
                }
            }
        }

        if(res.isEmpty())
            res.add(-1);
    }
}