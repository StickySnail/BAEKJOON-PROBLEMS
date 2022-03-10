import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] w = new int[10];
        int[] k = new int[10];

        for (int i = 0; i < 20; i++) {
            if (i < 10) {
                w[i] = Integer.parseInt(br.readLine());
            } else {
                k[i - 10] = Integer.parseInt(br.readLine());
            }
        }

        Arrays.sort(w);
        Arrays.sort(k);

        int wMax = 0;
        int kMax = 0;

        for (int a = 7; a < 10; a++) {
            wMax += w[a];
            kMax += k[a];
        }

        System.out.printf("%d %d", wMax, kMax);
    }
}
