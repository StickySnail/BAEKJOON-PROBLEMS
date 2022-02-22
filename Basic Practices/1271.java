import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger money = new BigInteger(st.nextToken());
        BigInteger creatures = new BigInteger(st.nextToken());

        System.out.printf("%d%n%d", money.divide(creatures), money.divideAndRemainder(creatures)[1]);

    }

}
