import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int count = 0;

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            boolean result = false;

            if (Integer.parseInt(input[0]) >= Integer.parseInt(input[1]))
                result = true;

            System.out.println(result == true ? "MMM BRAINS" : "NO BRAINS");

        }

        br.close();
    }

}
