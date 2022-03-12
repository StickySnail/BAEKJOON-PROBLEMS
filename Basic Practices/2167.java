//기분 좋다~
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stz;

        stz = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stz.nextToken());
        int M = Integer.parseInt(stz.nextToken());

        int[][] arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            stz = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(stz.nextToken());
            }
        }

        int K = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int b = 0; b < K; b++) {
            stz = new StringTokenizer(br.readLine());
            int i, j, x, y;
            i = Integer.parseInt(stz.nextToken()) - 1;
            j = Integer.parseInt(stz.nextToken()) - 1;
            x = Integer.parseInt(stz.nextToken()) - 1;
            y = Integer.parseInt(stz.nextToken()) - 1;

            int diffIX = x - i + 1;
            int diffJY = y - j + 1;
            int howManyTimesRepeat = diffIX * diffJY;
            int tmpI = i;
            int tmpJ = j;
            while (howManyTimesRepeat-- > 0) {

                sum += arr[tmpI][tmpJ];
                tmpJ++;

                if (tmpJ > y) {
                    tmpI++;
                    tmpJ = j;
                    continue;
                }

            }

            bw.write("" + sum + "\n");
            sum = 0;
        }
        bw.flush();
        bw.close();

    }

}
