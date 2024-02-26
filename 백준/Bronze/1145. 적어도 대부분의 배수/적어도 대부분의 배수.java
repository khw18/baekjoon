import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr[] = new int[5];
        int mul = Integer.MAX_VALUE;
        int cnt = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            mul = Math.min(mul, arr[i]);
        }

        while (true) {
            for (int i = 0; i < 5; i++) {
                if (mul % arr[i] == 0)
                    cnt++;
            }
            if (cnt >= 3) {
                break;
            }
            mul++;
            cnt = 0;
        }
        System.out.println(mul);
    }
}