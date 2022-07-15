import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            if (isGroup(br.readLine()))
                count++;
        }
        System.out.println(count);
        br.close();

    }

    static boolean isGroup(String str) {

        char[] charArray = str.toCharArray();

        char first = charArray[0];
        char last;

        for (int i = 1; i < str.length(); i++) {
            last = charArray[i];
            if (first != last) {
                for (int c = i; c < str.length(); c++) {
                    if (first == charArray[c]) {
                        return false;
                    }
                }
                first = charArray[i];
            }

        }

        return true;
    }

}
