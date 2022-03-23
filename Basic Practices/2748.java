
import java.io.*;

public class Main {

    static Long[] dp = new Long[91];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        dp[0] = 0L;
        dp[1] = 1L;

        int T = Integer.parseInt(br.readLine());

        fib(T);
        System.out.println(dp[T]);

    }

    static Long fib(int n) {

        if (dp[n] == null) {
            dp[n] = fib(n - 1) + fib(n - 2);
        }

        return dp[n];

    }

}
