import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(hash(Integer.parseInt(br.readLine()), br.readLine()));
    }

    static int hash(int L, String str) {
        int sum = 0;
        for (int i = 0; i < L; i++) {
            sum += (str.charAt(i) - '0' - 48) * (int) Math.pow(31, i);
        }
        return sum;
    }
}