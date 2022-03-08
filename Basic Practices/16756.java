import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stz;
        int N = Integer.parseInt(br.readLine());

        int[] values = new int[N];
        int[] intervals = new int[N - 1];
        int min = Integer.MAX_VALUE;
        Arrays.fill(intervals, -1);

        stz = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            values[i] = Integer.parseInt(stz.nextToken());
            if (i != 0) {
                intervals[i - 1] = Math.abs(values[i] - values[i - 1]);
            }
        }

        for (int i = 0; i < N-1; i++) {
            if (intervals[i] == -1) {
                break;
            } else {
                if (intervals[i] < min) {
                    min = intervals[i];
                }
            }
        }

        System.out.println(min);
    }
}
