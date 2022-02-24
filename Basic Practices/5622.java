import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = new String(br.readLine());
        int seconds = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) < 68)
                seconds += 3;
            else if (input.charAt(i) < 71)
                seconds += 4;
            else if (input.charAt(i) < 74)
                seconds += 5;
            else if (input.charAt(i) < 77)
                seconds += 6;
            else if (input.charAt(i) < 80)
                seconds += 7;
            else if (input.charAt(i) < 84)
                seconds += 8;
            else if (input.charAt(i) < 87)
                seconds += 9;
            else
                seconds += 10;
        }

        System.out.println(seconds);
    }
}
