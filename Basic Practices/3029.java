import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S1 = br.readLine();
        String S2 = br.readLine();
        String[] timeNow = S1.split(":");
        String[] timeBomb = S2.split(":");
        int[] time = new int[3];

        for (int i = 0; i < 3; i++) {
            time[i] = Integer.parseInt(timeBomb[i]) - Integer.parseInt(timeNow[i]);
        }

        if (S1.equals(S2)) {
            System.out.println("24:00:00");
        } else {
            if (time[2] < 0) {
                time[2] += 60;
                time[1]--;
            }
            if (time[1] < 0) {
                time[1] += 60;
                time[0]--;
            }
            if (time[0] < 0) {
                time[0] += 24;
            }
            System.out.printf("%02d:%02d:%02d", time[0], time[1], time[2]);
        }
       
    }
}
