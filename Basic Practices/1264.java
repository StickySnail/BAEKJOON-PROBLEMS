import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count;
        String str;

        while (!(str = br.readLine().toLowerCase()).equals("#")) {
            count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a'
                        || str.charAt(i) == 'e'
                        || str.charAt(i) == 'i'
                        || str.charAt(i) == 'o'
                        || str.charAt(i) == 'u') {
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}
