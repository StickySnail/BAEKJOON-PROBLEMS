import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int totalPoint = 0;

        for (int i = 0; i < 5; i++) {
            totalPoint += Integer.parseInt(br.readLine());
        }

        System.out.printf("%d", totalPoint);

    }

}
