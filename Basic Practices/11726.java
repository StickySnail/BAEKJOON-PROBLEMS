import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        final long DIV = 10007;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        long[] dp = new long[N + 2];

        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= N; i++) {

            dp[i] = (dp[i - 1] + dp[i - 2]) % DIV;

        }

        System.out.println(dp[N]);

    }

}
