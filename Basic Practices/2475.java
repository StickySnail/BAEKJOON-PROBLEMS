import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int sum = 0;

        while(str.hasMoreTokens()){
            sum += Math.pow(Integer.parseInt(str.nextToken()),2);
            
        }
        System.out.printf("%d", sum%10);

    }

}
