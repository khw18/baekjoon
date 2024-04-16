import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] result = new String[N];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            StringBuilder sb = new StringBuilder();
            for (int j = str.length()-1; j >=0; j--) {
               boolean prev = false;
                for (int k = 0; k < str.length(); k++) {
                    if (str.charAt(j) == str.charAt(k)) {
                        sb.append(k);
                        prev = true;
                        break;
                    }
                }
                if (!prev) {
                    sb.append(j);
                }
            }
            result[i] = sb.toString();
        }

        int cnt = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (result[i].equals(result[j])) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);

    }
}