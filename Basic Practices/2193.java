import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        long[][] dp = new long[N + 3][2];

        dp[1][1] = 1;
        dp[2][0] = 1;
        dp[3][0] = 1;
        dp[3][1] = 1;

        for (int i = 4; i <= N; i++) {

            dp[i][0] = dp[i-1][1] + dp[i-1][0];
            dp[i][1] = dp[i-1][0]; 
            
        }

        System.out.println(Arrays.stream(dp[N]).sum());
    }

}
