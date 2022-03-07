import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stz = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(stz.nextToken());
        int w = Integer.parseInt(stz.nextToken());
        int m = Integer.parseInt(stz.nextToken());
        int count = 0;
        while(k < w){
            k += m;
            count++;
        }
        System.out.print(count);
    }
}
