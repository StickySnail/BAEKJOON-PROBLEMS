import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int appleScore = 0;
        int bananaScore = 0;

        for (int i = 3; i > 0; i--) {
            appleScore += i * Integer.parseInt(br.readLine());
        }
        for (int i = 3; i > 0; i--) {
            bananaScore += i * Integer.parseInt(br.readLine());
        }

        System.out.println(appleScore > bananaScore ? "A" : (appleScore == bananaScore ? "T" : "B"));

    }

}
