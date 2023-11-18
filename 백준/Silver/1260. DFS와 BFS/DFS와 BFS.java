import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static int[][] graph;
    public static boolean[] visit;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int V = sc.nextInt();

        graph = new int[N + 1][N + 1];
        for (int i = 0; i < M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph[x][y] = 1;
            graph[y][x] = 1;
        }

        visit = new boolean[N + 1];
        dfs(V);
        System.out.println();
        visit = new boolean[N + 1];
        bfs(V);
    }


    static void dfs(int v) {
        visit[v] = true;
        System.out.printf(v + " ");
        
        for (int i = 1; i < graph.length; i++) {
            if (graph[v][i] == 1 && !visit[i]) {
                dfs(i);
            }
        }
    }

    static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        visit[v] = true;

        System.out.printf(v + " ");

        while (!queue.isEmpty()) {
            int n = queue.poll();
            for (int i = 1; i < graph.length; i++) {
                if (graph[n][i] == 1 && !visit[i]) {
                    visit[i] = true;
                    System.out.printf(i + " ");
                    queue.offer(i);
                }
            }
        }

    }
}
