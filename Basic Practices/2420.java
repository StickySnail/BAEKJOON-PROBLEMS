import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        long answer = Math.abs(Long.parseLong(str.nextToken()) - Long.parseLong(str.nextToken()));
     System.out.println(answer);
    }
}



