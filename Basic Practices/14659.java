import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stz;
        int n = Integer.parseInt(br.readLine());

        int strongPeak = 0;
        int maxKill = 0;
        int kill = 0;
        int peaks = 0;

        stz = new StringTokenizer(br.readLine());

        strongPeak = Integer.parseInt(stz.nextToken());
        

        while(n-->1){
            peaks = Integer.parseInt(stz.nextToken());
            if(strongPeak > peaks){
                kill++;
            }else{
                strongPeak = peaks;
                kill = 0;
            }
            
            if(maxKill < kill){
                maxKill = kill;
            }
        }

        System.out.println(maxKill);

    }
}
