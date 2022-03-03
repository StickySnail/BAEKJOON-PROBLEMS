import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stz;

        int n = Integer.parseInt(br.readLine());

        stz = new StringTokenizer(br.readLine());
        int[] words = new int[n];

        String answer = "makes sense";
        int count = 0;
        
        while (stz.hasMoreTokens()) {
            try {
                words[count] = Integer.parseInt(stz.nextToken());
                if(words[count] != count+1){
                    answer = "something is fishy";
                    break;
                }
            } catch (Exception e) {
                
            }
            count++;
        }

        System.out.println(answer);

    }

}
