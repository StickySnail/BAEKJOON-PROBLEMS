import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stz;
        int N = Integer.parseInt(br.readLine());

        stz = new StringTokenizer(br.readLine());

        int milk;
        int drinkableMilk = 0;
        int drikningCount = 0;
        ;

        while (stz.hasMoreTokens()) {
            milk = Integer.parseInt(stz.nextToken());

            if (drinkableMilk > 2) {
                drinkableMilk = 0;
            }

            if (milk == drinkableMilk) {
                drikningCount++;
                drinkableMilk++;
            }

        }

        System.out.print(drikningCount);
    }
}
