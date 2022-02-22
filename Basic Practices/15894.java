import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger bottomSquareCount = new BigInteger(br.readLine());

        System.out.printf("%d", bottomSquareCount.multiply(BigInteger.valueOf(4)));

    }

}
