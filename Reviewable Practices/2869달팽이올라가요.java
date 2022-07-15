import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // A = input[0] , B = input[1] , V = input[2]
        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int V = Integer.parseInt(input[2]);
        int countDay = (V - B) / (A - B);

        if ((V - B) % (A - B) != 0) {
            countDay++;
        }

        System.out.println(countDay);

        br.close();
    }

}
