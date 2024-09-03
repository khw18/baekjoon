import java.io.*;
import java.util.*;

class Main {
    static int[][] tree = new int[26][2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int root = st.nextToken().charAt(0) - 'A';
            int left = st.nextToken().charAt(0) - 'A';
            int right = st.nextToken().charAt(0) - 'A';
            tree[root][0] = (left == '.' - 'A' ? -1 : left);
            tree[root][1] = (right== '.' - 'A' ? -1 : right);
        }
        pre(0);
        System.out.println();
        in(0);
        System.out.println();
        post(0);
    }
    static void pre(int n) {
       if(n == -1)
           return;
        System.out.print((char) (n + 'A'));
        pre(tree[n][0]);
        pre(tree[n][1]);
    }
    static void in(int n) {
        if(n == -1)
            return;
        in(tree[n][0]);
        System.out.print((char) (n + 'A'));
        in(tree[n][1]);
    }
    static void post(int n) {
        if(n == -1)
            return;
        post(tree[n][0]);
        post(tree[n][1]);
        System.out.print((char) (n + 'A'));
    }

}
