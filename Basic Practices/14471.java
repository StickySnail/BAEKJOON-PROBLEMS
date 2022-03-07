import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stz;

        stz = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stz.nextToken());
        int M = Integer.parseInt(stz.nextToken());

        int output = 0;
        int[] inputs = new int[M];

        Arrays.fill(inputs, -1);

        int countRewards = 0;
        int index = 0;

        // 0포함 짝수 번쨰에는 A 홀수에는 B
        for (int i = 0; i < M; i++) {
            stz = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(stz.nextToken());
            int B = Integer.parseInt(stz.nextToken());

            if (A >= N) {
                countRewards++;
            } else {
                inputs[index++] = A;
            }
        }

        Arrays.sort(inputs);

        

        for (int i = M - 1; i >= 0; i--) {
            if(countRewards >= M - 1){
                break;
            }
            if (inputs[i] != -1) {
                output += N - inputs[i];
                countRewards++;
            }
        }

        System.out.println(output);

    }
}
