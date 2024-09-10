import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");
        String[] arr = new String[st.countTokens()];
        int ans = 0;
        int i = 0;
        while (st.hasMoreTokens()) {
            arr[i++] = st.nextToken();
        }
        for (int j = 0; j < arr.length; j++) {
            st = new StringTokenizer(arr[j], "+");

            int sum = 0;
            while(st.hasMoreTokens())
                sum += Integer.parseInt(st.nextToken());

            if(j == 0)
                ans += sum;
            else
                ans += -1 * sum;
        }
        System.out.println(ans);
    }
}