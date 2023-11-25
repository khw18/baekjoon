import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int sum = 666;
        String str;
        int cnt = 1;

        while (true) {
            if (cnt == N) {
                break;
            }
            sum++;
            str = sum + "";
            for (int i = 0; i < str.length() - 2; i++) {
                if (str.charAt(i) - '0' == 6 && str.charAt(i+1) - '0' == 6 && str.charAt(i + 2) - '0' == 6) {
                    cnt++;
                    break;
                }
            }
        }

        bw.write(sum + "");
        bw.flush();
        bw.close();

    }
}