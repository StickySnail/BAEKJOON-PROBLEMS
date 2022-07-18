import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import javax.imageio.ImageTypeSpecifier;

public class Main {

    static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stz;

        int N = Integer.parseInt(br.readLine());
        stz = new StringTokenizer(br.readLine());
        int countPrimeN = 0;

        for (int i = 0; i < N; i++) {
            if (isPrimeNum(Integer.parseInt(stz.nextToken())))
                countPrimeN++;
        }
        System.out.println(countPrimeN);

    }

    static boolean isPrimeNum(int input) {

        if (input == 1)
            return false;

        for (int i = 2; i <= Math.sqrt(input); i++) {

            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }

}
