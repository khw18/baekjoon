import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[81];
        Integer[] idx = new Integer[81];

        for (int i = 0; i < 81;) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                arr[i+j] = Integer.parseInt(st.nextToken());
                idx[i + j] = i + j;
            }
            i += 9;
        }

        Arrays.sort(idx, (o1, o2) -> Integer.compare(arr[o2], arr[o1]));

        int row = idx[0] / 9 + 1;
        int col = idx[0] % 9 + 1;
        System.out.println(arr[idx[0]] + "\n" + row + " " + col);

    }
}