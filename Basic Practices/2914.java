import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());

        
        int Songs = Integer.parseInt(st.nextToken());
        int avgFine = Integer.parseInt(st.nextToken());      
           
        System.out.println(((avgFine-1) * Songs)+1);
        



    }

}
