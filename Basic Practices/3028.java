import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String mixing = br.readLine();
        int[] cups = { 1, 0, 0 };
        int i = 0;

        while (i < mixing.length()) {
            int tmp = 0;
            switch (mixing.charAt(i)) {
                case 'A':
                    tmp = cups[0];
                    cups[0] = cups[1];
                    cups[1] = tmp;
                    break;
                case 'B':
                    tmp = cups[1];
                    cups[1] = cups[2];
                    cups[2] = tmp;
                    break;
                case 'C':
                    tmp = cups[0];
                    cups[0] = cups[2];
                    cups[2] = tmp;
                    break;
            }

            i++;
        }

        for (int a = 0; a < cups.length; a++) {
            if (cups[a] == 1) {
                System.out.println(a + 1);
            }

        }

    }
}
