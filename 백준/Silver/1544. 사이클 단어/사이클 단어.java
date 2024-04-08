import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();
        Set<String> cycle = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        for (String s : set) {
            boolean uniq = true;
            for (int i = 0; i < s.length(); i++) {
                String str = s.substring(i) + s.substring(0, i);
                if (cycle.contains(str)) {
                    uniq = false;
                    break;
                }
            }
            if (uniq) {
                cycle.add(s);
            }
        }
        System.out.println(cycle.size());
    }
}