import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stz;
        int n = Integer.parseInt(br.readLine());

        stz = new StringTokenizer(br.readLine());

        int[] price = new int[n];
        int max = 0;
        int maxIndex = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            price[i] = Integer.parseInt(stz.nextToken());

            if (price[i] > max) {
                max = price[i];
                maxIndex = i;
            }
        }

        for (int i = 0; i < n; i++) {
            if (i == maxIndex) {
                continue;
            }

            sum += price[i];

        }

        System.out.println(sum);
    }
}
