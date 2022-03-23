//https://st-lab.tistory.com/134
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        long[][] dp = new long[N + 1][10];

        // 1자리 자릿값은 1밖에 없음
        for (int i = 1; i < 10; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= N; i++) {

            for (int k = 0; k < 10; k++) {

                if (k == 0) {
                    dp[i][k] = dp[i - 1][1] % 1000000000L;
                } else if (k == 9) {
                    dp[i][k] = dp[i - 1][8] % 1000000000L;
                }

                else {
                    dp[i][k] = (dp[i - 1][k - 1] + dp[i - 1][k + 1]) % 1000000000L;
                }
            }
        }

        long asw = 0;

        for (long i : dp[N]) {
            asw += i;
        }

        System.out.println(asw % 1000000000L);

    }

}
