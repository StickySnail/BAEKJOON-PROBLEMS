import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int[] inputs = new int[8];
        String result = "mixed";

        while (str.hasMoreTokens()) {
            inputs[8 - str.countTokens()] = Integer.parseInt(str.nextToken());
        }

        for (int i = 0; i < inputs.length-1; i++) {

            if (inputs[i] == inputs[i + 1]-1) {
                result = "ascending";

            } else if (inputs[i] == inputs[i + 1]+1) {
                result = "descending";

            } else {
                result = "mixed";
                break;
            }
        }

        System.out.println(result);

    }

}
