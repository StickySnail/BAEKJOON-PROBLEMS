import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int tmp = cal(Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()));
            System.out.println(tmp);
        }

        br.close();

    }

    static int cal(int k, int n) {

        if (n == 1) {
            return 1;
        }

        if (k == 1) {
            int tmp = n * (n + 1) / 2;
            return tmp;
        }

        return cal(k, n - 1) + cal(k - 1, n);

    }

}
