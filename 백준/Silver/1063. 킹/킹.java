import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
    static int kx,ky,sx,sy;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String k = st.nextToken();
        String s = st.nextToken();
        int N = Integer.parseInt(st.nextToken());

        kx = (int) k.charAt(0) - 'A';
        ky = (int) k.charAt(1) - '0' - 1;
        sx = (int) s.charAt(0) - 'A';
        sy = (int) s.charAt(1) - '0' - 1;

        for (int i = 0; i < N; i++) {
            move(br.readLine());
        }

        System.out.println((char) (kx + 'A') + "" + (char) (ky + '0' + 1));
        System.out.println((char) (sx + 'A') + "" + (char) (sy + '0' + 1));


    }

    static void move(String command) {
        switch (command) {
            case "R" -> func(1,0);
            case "L" -> func(-1,0);
            case "B" -> func(0,-1);
            case "T" -> func(0,1);
            case "RT" -> func(1,1);
            case "LT" -> func(-1,1);
            case "RB" -> func(1,-1);
            case "LB" -> func(-1,-1);
        }
    }

    private static void func(int x, int y) {
        if (kx + x == sx && ky + y == sy) {
            // 돌과 킹이 같이 움직일 때, 돌이 체스판 밖으로 나가면 안 됨
            if (!(sx + x >= 8 || sx + x < 0 || sy + y >= 8 || sy + y < 0)) {
                sx += x;
                sy += y;
                kx += x;
                ky += y;
            }
        } else {
            // 킹만 움직임
            if (kx + x < 8 && kx + x >= 0 && ky + y < 8 && ky + y >= 0) {
                kx += x;
                ky += y;
            }
        }

    }
}