import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static ArrayList<Integer>[] adj;
    static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        adj = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            adj[n1].add(n2);
            adj[n2].add(n1);
        }
        for (int i = 1; i <= N; i++) {
            Collections.sort(adj[i]);
        }
        visit = new boolean[N + 1];
        DFS(V);
        System.out.println();
        visit = new boolean[N + 1];
        BFS(V);
        System.out.println();
    }

    private static void DFS(int v) {
        System.out.print(v + " ");
        visit[v] = true;
        for (int i : adj[v]) {
            if (!visit[i]) {
                DFS(i);
            }
        }
    }

    private static void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        visit[v] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");
            for (int i : adj[node]) {
                if (!visit[i]) {
                    visit[i] = true;
                    queue.offer(i);
                }
            }
        }

    }
}