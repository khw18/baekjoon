import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int cnt = 0;

        for (int a = 1; a <= 500; a++) {
            for (int b = 1; b <= a; b++) {
                if (b * b + N == a * a)
                    cnt++;
            }
        }

        System.out.println(cnt);
    }
}