import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int[] input = new int[str.countTokens()];

        while (str.hasMoreTokens()) {
            input[input.length - str.countTokens()] = Integer.parseInt(str.nextToken());
        }

        Arrays.sort(input);

       
            System.out.print(input[0]*input[2]);
        

    }

}
