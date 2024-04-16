import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        Set<Integer> set = new HashSet<>();
        int max = 1;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
            set.add(num);
        }
        for (int i : set) {
            int cnt = 1;
            int prev = arr[0];
            for (int j = 1; j < N; j++) {
                if(arr[j]==i) continue;
                if (prev != arr[j]) cnt = 1;
                else {
                    cnt++;
                    max = Math.max(max, cnt);
                }
                prev = arr[j];
            }
        }

        System.out.println(max);
    }
}