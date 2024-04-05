import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    static int cnt = 0;
    static int[] arr = new int[9];
    static void plus() {
        for (int i = 0; i < 9; i++) {
            arr[i]++;
            if (i==6) arr[i]++;
        }
        cnt++;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        input = input.replace("9", "6");
        plus();

        for (int i = 0; i < input.length(); i++) {
            int idx = (int) input.charAt(i) - '0';
            if (arr[idx] > 0) {
                arr[idx]--;
            } else {
                plus();
                arr[idx]--;
            }
        }
        System.out.println(cnt);
    }
}