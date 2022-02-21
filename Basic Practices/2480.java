import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());

        int[] numbers = { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken()) };

        int maxValue = numbers[0];
        for (int i = 0; i < 3; i++) {
            if (maxValue < numbers[i])
                maxValue = numbers[i];
        }

        if (numbers[0] == numbers[1]) {
            if (numbers[0] == numbers[2])
                System.out.print(10000 + numbers[0] * 1000);
            else
                System.out.print(1000 + numbers[0] * 100);
        } else if (numbers[0] != numbers[1]) {
            if (numbers[1] == numbers[2])
                System.out.print(1000 + numbers[1] * 100);
            else if (numbers[1] != numbers[2]) {
                if (numbers[0] != numbers[2])
                    System.out.print(maxValue * 100);
                else
                    System.out.print(1000 + numbers[0] * 100);
            }
        }

    }

}
