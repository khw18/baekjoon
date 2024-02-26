import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[9];
        int sol[] = new int[7];
        int sum = 0;
        int dist;
        int i, j = 0;

        for (int n = 0; n < 9; n++) {
            arr[n] = Integer.parseInt(br.readLine());
            sum += arr[n];
        }

        dist = sum - 100;

        loop:
        for (i = 0; i < 9; i++) {
            for (j = i+1; j < 9; j++) {
                if (arr[i] + arr[j] == dist) {
                    break loop;
                }
            }
        }

        for (int k = 0, l = 0; k < arr.length; k++) {
            if (k != i && k != j) {
                sol[l] = arr[k];
                l++;
            }
        }
        Arrays.sort(sol);

        for (int k = 0; k < 7; k++) {
            System.out.println(sol[k]);
        }
    }
}