import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int countFace = 0;
        int countTail = 0;

        while (N-- > 0) {
            if (Integer.parseInt(br.readLine()) == 1) {
                countFace++;
            } else {
                countTail++;
            }
        }

        System.out.println(Math.min(countFace, countTail));

    }
}
