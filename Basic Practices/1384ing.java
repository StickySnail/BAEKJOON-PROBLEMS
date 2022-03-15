
import java.io.*;

public class Main { //1384
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int N;
        int countGroup = 0; // ?
        String[][] group;
        String[] nasty; // 0 한사람 1 당한사람 2 한사람 3 당한사람

        group = new String[5][5];
        while ((N = Integer.parseInt(br.readLine())) != 0) {
            group = new String[N][N];
            nasty = new String[N * 2];
            countGroup++;
            for (int i = 0; i < N; i++) {
                group[i] = br.readLine().split(" ");
            }
            int k = 0;
            for (int i = 0; i < N; i++) {
                for (int a = 1; a < N; a++) {
                    if ("N".equals(group[i][a])) {
                        int index = i-a; // where nasty person
                        
                        if (index < 0) {
                            index = N - index *(-1);
                        }
                        
                        if (index >= N - 1) {
                            nasty[k++] = group[index][0];
                            nasty[k++] = group[i][0];
                        } else {
                            nasty[k++] = group[index][0];
                            nasty[k++] = group[i][0];
                        }
                    }
                }
            }
            // 출력 루트
            sb.append("Group " + countGroup);
            sb.append(System.getProperty("line.separator"));
            // 반복문 넣어 충분히 출력하기
            if (k > 0) {
                for (int i = 0; i <= k / 2 ; i += 2) {
                    sb.append(nasty[i] + " was nasty about " + nasty[i + 1]);
                    sb.append(System.getProperty("line.separator"));
                }
            } else {
                sb.append("Nobody was nasty");
                sb.append(System.getProperty("line.separator"));
            }
            sb.append(System.getProperty("line.separator"));
            bw.write(sb.toString());
        }

        /*
         * j0 j1 j2 j3 j4
         * Ann P N P P i0
         * Bob P P P P i1
         * Clive P P P P i2
         * Debby P N P P i3
         * Eunice P P P P i4
         */

        /*
         * for(String[] a : group){
         * for(String b : a){
         * System.out.print(b);
         * }
         * System.out.println();
         * }
         */

        bw.flush();
        bw.close();

    }
}
