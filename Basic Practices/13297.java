import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String input;
        int[] digits = new int[N];

        for (int i = 0; i < N; i++) {
            input = new String(br.readLine());
            digits[i] = input.length();
        }

        for (int a : digits) {
            System.out.println(a);
        }

    }

}
