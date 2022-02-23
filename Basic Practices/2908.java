import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int A = convert(Integer.parseInt(str.nextToken()));
        int B = convert(Integer.parseInt(str.nextToken()));

        System.out.println(A > B ? A : B);

    }

    static int convert(int a) {
        return (a % 10) * 100 + (a % 100 / 10) * 10 + (a / 100);
    }

}
