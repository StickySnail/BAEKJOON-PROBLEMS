import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stz = new StringTokenizer(br.readLine());
        StringBuilder sb;
        String A = stz.nextToken();
        String B = stz.nextToken();
        long answer = 0;
    
        // 가능한 모든 수 생성 및 계산
        for (int w = 0; w < A.length(); w++) {
            for (int m = 0; m < B.length(); m++) {
                sb = new StringBuilder();
                sb.append(A.charAt(w));
                sb.append(B.charAt(m));
                answer += (sb.charAt(0) - '0') * (sb.charAt(1) - '0');
            }
        }
        System.out.println(answer);
    }

}
