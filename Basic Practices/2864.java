import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stz = new StringTokenizer(br.readLine());
        String[] numbers = {stz.nextToken(), stz.nextToken()};


        // 모두 5인 상황 최솟값
        numbers[0] = numbers[0].replace('6','5');
        numbers[1] = numbers[1].replace('6','5');
        int min = Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
        // 모두 6인 상황 최댓값
        numbers[0] = numbers[0].replace('5','6');
        numbers[1] = numbers[1].replace('5','6');
        int max = Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);

        System.out.printf("%d %d", min, max);

    }
}
