import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int firstAlphabet;
        int[] alphabets = new int[26];
        String answer = "";
        while (N-- > 0) {
            firstAlphabet = br.readLine().charAt(0) - 97;
            alphabets[firstAlphabet]++;
        }

        for (int a = 0; a < alphabets.length; a++) {
            if (alphabets[a] >= 5) {
                answer += (char) (a + 97);
            }
        }

        if (!answer.equals("")) {
            char[] charArray = answer.toCharArray();
            Arrays.sort(charArray);

            System.out.println(new String(charArray));
        } else {
            System.out.println("PREDAJA");
        }

    }

}
