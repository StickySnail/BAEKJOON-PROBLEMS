import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stz;

        stz = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stz.nextToken());
        int M = Integer.parseInt(stz.nextToken());

        stz = new StringTokenizer(br.readLine());
        int box = 0;
        while (N-- > 0) {
            box += Integer.parseInt(stz.nextToken());
        }

        stz = new StringTokenizer(br.readLine());
        int books = 0;
        while (M-- > 0) {
            books += Integer.parseInt(stz.nextToken());
        }

        System.out.println(box - books);

    }
}
