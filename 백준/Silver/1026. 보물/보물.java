import java.io.*;
import java.util.Arrays;
import java.util.Collections;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] A = new int[N];
        Integer[] B = new Integer[N];
        int S = 0;

        String[] str = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(str[i]);
        }
        str = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(A);
        Arrays.sort(B, Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            S += A[i] * B[i];
        }
        bw.write(Integer.toString(S));
        bw.flush();
        bw.close();
    }
}