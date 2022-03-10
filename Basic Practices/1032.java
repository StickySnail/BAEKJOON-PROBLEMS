import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder str = new StringBuilder(br.readLine());

        while (N-- > 1) {
            StringBuilder tmp = new StringBuilder(br.readLine());
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == tmp.charAt(i)) {
                    continue;
                } else {
                    str.setCharAt(i, '?');

                }
            }
        }

        System.out.println(str);

    }
}
