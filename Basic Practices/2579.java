// https://st-lab.tistory.com/132

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[301];
        int[] scores = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            scores[i] = Integer.parseInt(br.readLine());
        }

        dp[0] = scores[0];
        dp[1] = scores[1];

        // N==1일 경우에 대한 대비
        if (N >= 2) {
            dp[2] = scores[1] + scores[2];
        }

        for (int i = 3; i <= N ; i++) {

            dp[i] = Math.max(dp[i - 2], dp[i - 3] + scores[i - 1]) + scores[i];

        }
        System.out.println(dp[N]);

    }

}
