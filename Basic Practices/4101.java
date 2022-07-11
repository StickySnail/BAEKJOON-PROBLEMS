import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int count = 0;

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean result;
        for (;;) {
            String[] str = br.readLine().split(" ");

            if (Integer.parseInt(str[0]) == 0 && Integer.parseInt(str[1]) == 0)
                break;

            if (Integer.parseInt(str[0]) > Integer.parseInt(str[1])) {
                result = true;
            } else {
                result = false;
            }
            System.out.println(result == true ? "Yes" : "No");

        }

        br.close();
    }

}
