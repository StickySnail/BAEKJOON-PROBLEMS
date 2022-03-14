
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String strN = br.readLine();
        int intN = Integer.parseInt(strN);
        int answer = 0;

        int d = 10;

        Math.pow(d, strN.length() - 1);

        loop1: for (int i = intN; i > 0; i--) {
            String tmp = "" + i;
            int count = 0;
            for (int a = 0; a < tmp.length(); a++) {

                if (tmp.charAt(a) == '4' || tmp.charAt(a) == '7') {
                    count++;
                    continue;
                } else {
                    break;
                }

            }

            if (tmp.length() == count) {
                answer = i;
                break loop1;
            }
        }
        System.out.println(answer);
    }
}


