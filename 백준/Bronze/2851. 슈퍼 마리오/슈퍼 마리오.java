import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int temp;
        int nextGap = Integer.MAX_VALUE;
        int currentGap;
        for (int i = 0; i < 10; i++) {
            temp = Integer.parseInt(br.readLine());
            nextGap = Math.abs(100-(sum+temp));
            currentGap = Math.abs(100 - sum);
            if (nextGap > currentGap) {
                break;
            }
            sum+=temp;
        }
        System.out.println(sum);
    }
}