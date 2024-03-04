import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*남규 >= 영훈+2  택희%2==0  남규+영훈+택희=n*/
        //C >= B+2  A%2==0 C+B+A = N
        int cnt = 0;
        int n = Integer.parseInt(br.readLine());

        for (int a = 1; a < n; a++) {
            for (int b = 1; b < n; b++) {
                for (int c = 1; c < n; c++) {
                    if (c >= b + 2 && a % 2 == 0 && a + b + c == n) {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}