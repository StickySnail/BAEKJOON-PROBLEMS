// 오답이라고 뜨긴하는데 왜 오답이 되는지 모르겠어.. 해답 찾아봐서 봤는데 그게 답인거는 알겠는데 왜 넌 오답이니./?
// A: NO를 No라고 쳐서 틀렸던 것이었다~ 진짜 화가났다 그래서 여기 적어논다 화가많이 났었다고..
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int left = 0, right = 0;
        String answer = "NO";

        for (int i = 1; i < input.length(); i++) {
            left = Integer.parseInt(input.substring(0, i));
            right = Integer.parseInt(input.substring(i));

            int L = 1, R = 1;

            // left
            int d = 10;
            for (int k = 0; k < i; k++) {
                L *= (left % d) / (d / 10);
                d *= 10;
            }
            // right
            int b = 10;
            for (int k = 0; k < input.length() - i; k++) {
                R *= (right % b) / (b / 10);
                b *= 10;
            }

            if (L == R) {
                answer = "YES";
                break;
            }
        }
        System.out.println(answer);

    }

}

