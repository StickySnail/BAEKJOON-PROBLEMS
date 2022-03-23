
import java.io.*;

public class Main { // 1384
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb;

        int N, c, g = 1, index; // c는 N이 나온 횟수
        String[][] group;
        String[] nasty;

        while ((N = Integer.parseInt(br.readLine())) != 0) {
            sb = new StringBuilder();
            group = new String[N][N];
            nasty = new String[N * N * 2];
            c = 0;

            // 내용 저장
            for (int i = 0; i < N; i++) {
                group[i] = br.readLine().split(" ");
            }

            // N 찾아 처리
            for (int a = 0; a < N; a++) {
                for (int i = 1; i < N; i++) {
                    if ("N".equals(group[a][i])) {
                        index = N + a - i;
                        if (index > N - 1) {
                            index -= N;
                        }
                        // 0 포함 짝수는 한사람 홀수는 당한사람
                        nasty[c++] = group[index][0];
                        nasty[c++] = group[a][0];
                    }
                }
            }

            sb.append("Group ").append(g++).append("\n");
            if (c == 0) {
                sb.append("Nobody was nasty" + "\n");
            } else {
                for (int a = 0; a < c; a += 2) {
                    sb.append(nasty[a] + " was nasty about " + nasty[a + 1] + "\n");
                }
            }
            System.out.println(sb.toString());

        }

    }
}
