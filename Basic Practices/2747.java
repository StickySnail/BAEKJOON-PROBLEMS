
import java.io.*;

public class Main {

    static Integer[] dp = new Integer[46];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        dp[0] = 0;
        dp[1] = 1;

        int T = Integer.parseInt(br.readLine());

        fib(T);
        System.out.println(dp[T]);

    }

    static Integer fib(int n) {

        if (dp[n] == null) {
            dp[n] = fib(n - 1) + fib(n - 2);
        }

        return dp[n];

    }

}
