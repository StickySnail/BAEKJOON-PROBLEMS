import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int first = 2;
        int last = 7;
        int gap = 5;
        int result = 1;
        int tmp = 1;

        for (;;) {
            if (T == 1) {
                System.out.println(result);
                break;
            }
            result++;
            if (first <= T && T <= last) {
                System.out.println(result);
                break;
            }
            gap += 6;

            first += 6 * tmp;
            last = first + gap;

            tmp++;

        }

    }

}
