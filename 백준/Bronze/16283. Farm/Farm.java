import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int cnt = 0;

        for (int x = 1; x < n; x++) {
            int y = n - x;
            if (a * x + b * y == w) {
                sb.append(x + " " + y);
                cnt++;
            }
        }

        if (cnt == 1)
            System.out.println(sb);
        else
            System.out.println(-1);
    }
}