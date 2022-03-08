import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stz;

        stz = new StringTokenizer(br.readLine());
        double A = Integer.parseInt(stz.nextToken());
        double B = Integer.parseInt(stz.nextToken());

        stz = new StringTokenizer(br.readLine());
        double D = Integer.parseInt(stz.nextToken());
        double C = Integer.parseInt(stz.nextToken());

        double[] results = new double[4];

        double tmp;
        int maxIndex = 0;
        double maxValue = 0;
        for (int i = 0; i < 4; i++) {
            results[i] = A / D + B / C;
            if (maxValue < results[i]) {
                maxValue = results[i];
                maxIndex = i;
            }
            // switching
            tmp = D;
            D = C;
            C = B;
            B = A;
            A = tmp;

        }

        for (int i = 0; i < 4; i++) {
            if (results[i] == maxValue && maxIndex != i) {
                maxIndex = i;
                break;
            }

        }

        System.out.println(maxIndex);

    }
}
