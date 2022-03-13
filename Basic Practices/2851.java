import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] mushrooms = new int[10];
        int score1 = 0;

        int i = 0;
        while (i < 10) {
            mushrooms[i] = Integer.parseInt(br.readLine());
            i++;
        }

        for (int a = 0; a < 10; a++) {
            score1 += mushrooms[a];
            if (Math.abs(score1 - mushrooms[a] - 100) < score1 - 100) {
                score1 = score1 - mushrooms[a];
                break;
            }
        }
        System.out.println(score1);

    }

}
