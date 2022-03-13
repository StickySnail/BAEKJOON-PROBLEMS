//https://yongku.tistory.com/entry/%EB%B0%B1%EC%A4%80-%EC%95%8C%EA%B3%A0%EB%A6%fAC%EC%A6%98-%EB%B0%B1%EC%A4%80-2563%EB%B2%88-%EC%83%89%EC%A2%85%EC%9D%B4-%EC%9E%90%EB%B0%94Java
//겹치는 부분을 전체에서 빼주는 방식이아니라 배열을 통해 1을 기록하고 후에 1만 세어주어 면적을 구하는 방식이 인상적. 
//생각해 보지 못한 접근법이었다.

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stz;

        int N = Integer.parseInt(br.readLine());
        int[][] area = new int[100][100];
        int count = 0;

        for (int i = 0; i < N; i++) {
            stz = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(stz.nextToken());
            int y = Integer.parseInt(stz.nextToken());
            for (int a = x; a < x + 10; a++) {
                for (int b = y; b < y + 10; b++) {
                    area[a][b] = 1;
                }
            }
        }

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (area[i][j] == 1) {
                    count++;
                }
            }
        }

        bw.write(String.format("%d", count));

        // 출력
        bw.flush();
        bw.close();

    }

}
