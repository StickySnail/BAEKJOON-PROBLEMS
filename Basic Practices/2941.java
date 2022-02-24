import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = new String(br.readLine());
        String[] alphabets = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
        int count = 0;

        for (String s : alphabets) {
          //check if there is anything to replace *********
            while (!input.replaceFirst(s, " ").equals(input)) {
                if (input.contains(s)) {
                    input = input.replaceFirst(s, " ");
                    count++;
                }
            }
        }
        input = input.replace(" ", "");

        System.out.println(count + input.length());
    }

}
