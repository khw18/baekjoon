import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            q.offer(i);
        }
        int size = q.size() - 1;
        for (int i = 0; i < size; i++) {
            q.poll();
            q.offer(q.poll());
        }
        System.out.println(q.poll());
    }
}