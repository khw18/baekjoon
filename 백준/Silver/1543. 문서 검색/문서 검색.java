import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String doc = br.readLine();
        String word = br.readLine();
        int cnt = 0;

        for (int i = 0; i <= doc.length() - word.length(); i++) {
            boolean check = true;
            for (int j = 0; j < word.length(); j++) {
                if (doc.charAt(i + j) != word.charAt(j)) {
                    check = false;
                    break;
                }
            }
            if (check) {
                i += word.length() - 1;
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}