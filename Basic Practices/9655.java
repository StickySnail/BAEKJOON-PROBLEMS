import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(N%2 == 0 ? "CY" : "SK");

    }

}

//

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] dp = new String[N + 1];

        if (N < 3) {
            System.out.println(N == 1 ? "SK" : "CY");
        } else {
            dp[1] = "SK";
            dp[2] = "CY";
            dp[3] = "SK";
            for (int i = 4; i <= N; i++) {
                if ("SK".equals(dp[i - 1]) && "SK".equals(dp[i - 3])) {
                    dp[i] = "CY";
                } else if ("CY".equals(dp[i - 1]) && "CY".equals(dp[i - 3])) {
                    dp[i] = "SK";
                } else {
                    System.out.println("이런경우도 있네?");
                }
            }

            System.out.println(dp[N]);
        }

    }

}
