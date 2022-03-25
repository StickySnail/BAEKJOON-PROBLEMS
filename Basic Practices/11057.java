// 반례가 뭘까? 
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        final long DIV = 10007;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        long[][] dp = new long[N + 1][10];

        // 0~9까지 모두 각각 1개씩 경우의 수를 가짐
        // dp[2]에 대해선 10 9 8 ... 1개의 경우의 수를 가짐
        for (int i = 0; i < 10; i++) {
            dp[1][i] = 1;
        }
        
        for (int i = 2; i <= N; i++) {
            dp[i][0] = Arrays.stream(dp[i - 1]).sum()%DIV;
            dp[i][9] = 1;
            for (int j = 1; j < 9; j++) {
                dp[i][j] = dp[i][j - 1] - dp[i - 1][j - 1];
            }
        }

        System.out.println((Arrays.stream(dp[N]).sum()) % DIV);
    }

}

// 정답은 이거

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        final long DIV = 10007;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        long[][] dp = new long[N + 1][10];

        // 0~9까지 모두 각각 1개씩 경우의 수를 가짐
        // dp[2]에 대해선 10 9 8 ... 1개의 경우의 수를 가짐
        for (int i = 0; i < 10; i++) {
            dp[1][i] = 1;
        }
        
        for (int i = 2; i <= N; i++) {
            dp[i][0] = 1;
            for(int j=1; j<10; j++ ){
                dp[i][j] = (dp[i][j-1] + dp[i-1][j])%DIV;
            }
            
           
        }

        System.out.println((Arrays.stream(dp[N]).sum()) % DIV);
    }

}
