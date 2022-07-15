import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stz;

        int T = Integer.parseInt(br.readLine());

        int H, W, N; //
        for (int i = 0; i < T; i++) {
            stz = new StringTokenizer(br.readLine());
            H = Integer.parseInt(stz.nextToken());
            W = Integer.parseInt(stz.nextToken());
            N = Integer.parseInt(stz.nextToken());

            if (H == 1) {
                System.out.println(100 + N);
            } else if (N % H == 0) {
                System.out.println(H * 100 + (N / H));
            } else {
                System.out.println((N % H) * 100 + (N / H + 1));
            }

        }

        br.close();
    }

}
