
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stz;
        int N = Integer.parseInt(br.readLine());
        int[] seats = new int[101];
        int count = 0;

        stz = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            seats[Integer.parseInt(stz.nextToken())]++;
        }

        for (int i = 0; i < 101; i++) {
            if (seats[i] > 1) {
                count += seats[i]-1;
            }
        }

        bw.write(String.format("%d", count));
        bw.flush();
        bw.close();

    }
}
