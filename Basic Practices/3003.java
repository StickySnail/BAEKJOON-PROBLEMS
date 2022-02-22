import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int[] countPieces = new int[6];
        int[] neededPiecses = { 1, 1, 2, 2, 2, 8 };

        while (st1.hasMoreTokens()) {
            countPieces[6 - st1.countTokens()] = Integer.parseInt(st1.nextToken());
        }

        for (int i = 0; i < 6; i++) {
            System.out.printf("%d ", neededPiecses[i] - countPieces[i]);
        }

    }

}
