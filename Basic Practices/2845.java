import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int peopleCountPer1m2 = Integer.parseInt(st1.nextToken());
        int areaParthHeld = Integer.parseInt(st1.nextToken());
        int[] pressAsumtion = new int[5];

        while (st2.hasMoreTokens()) {
            pressAsumtion[5 - st2.countTokens()] = Integer.parseInt(st2.nextToken());
        }

        for (int i = 0; i < 5; i++) {
            System.out.printf("%d ", pressAsumtion[i] - peopleCountPer1m2 * areaParthHeld);
        }

    }

}
