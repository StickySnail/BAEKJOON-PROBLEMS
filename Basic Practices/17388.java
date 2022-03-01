import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(str.nextToken());
        int K = Integer.parseInt(str.nextToken());
        int H = Integer.parseInt(str.nextToken());

        if (S + K + H >= 100) {
            System.out.println("OK");
        } else {
            System.out.println(compare(S, K, H));
        }
    }

    static String compare(int S, int K, int H) {
        int min = S;
        if (S < K && S < H) {
            return "Soongsil";
        } else if (K < S && K < H) {
            return "Korea";
        } else if (H < S && H < K) {
            return "Hanyang";
        }

        return "S";
    }

}
