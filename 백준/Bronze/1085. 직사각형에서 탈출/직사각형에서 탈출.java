import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        int x, y, w, h;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        int xw, yh;
        xw = x - w;
        if (xw < 0) {
            xw *= -1;
        }
        yh = y - h;
        if (yh < 0) {
            yh *= -1;
        }
        int min = 1000;

        if (xw < min) {
            min = xw;
        }
        if (yh < min) {
            min = yh;
        }
        if (x < min) {
            min = x;
        }
        if (y < min) {
            min = y;
        }



        bw.write(String.valueOf(min));
        bw.flush();
        bw.close();

    }
}