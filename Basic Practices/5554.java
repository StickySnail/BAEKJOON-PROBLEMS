import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] inputSec = new int[4];
        int minutes = 0;
        int seconds = 0;

        for (int i = 0; i < 4; i++) {
            inputSec[i] = Integer.parseInt(br.readLine());
            seconds += inputSec[i];
        }

        while (seconds > 59) {
            seconds -= 60;
            minutes++;
        }

        System.out.printf("%d%n%d", minutes, seconds);

    }

}
