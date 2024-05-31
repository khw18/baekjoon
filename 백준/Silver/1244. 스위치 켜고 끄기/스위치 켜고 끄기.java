import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[t + 1];
        arr[0] = -1; // 인덱스 0을 사용하지 않음

        for (int i = 1; i <= t; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int gen = Integer.parseInt(st.nextToken());
            int idx = Integer.parseInt(st.nextToken());

            if (gen == 1) { // 남학생의 경우
                for (int j = idx; j <= t; j += idx) {
                    arr[j] = rev(arr[j]);
                }
            } else { // 여학생의 경우
                int left = idx;
                int right = idx;

                // 좌우 대칭 확인
                while (left > 1 && right < t && arr[left - 1] == arr[right + 1]) {
                    left--;
                    right++;
                }

                // 대칭 구간 반전
                for (int j = left; j <= right; j++) {
                    arr[j] = rev(arr[j]);
                }
            }
        }

        for (int i = 1; i <= t; i++) {
            System.out.print(arr[i] + " ");
            if (i % 20 == 0) {
                System.out.println();
            }
        }
    }

    static int rev(int n) {
        return n == 1 ? 0 : 1;
    }
}
