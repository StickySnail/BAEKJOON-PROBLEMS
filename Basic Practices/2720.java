import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int[] C = new int[T];
        int[] output = new int[4];
        for(int i=0; i<T; i++){
            C[i] = Integer.parseInt(br.readLine());
        }

        
        int[] coins = {25, 10 , 5, 1};
        for(int tmp=0; tmp<T; tmp++){
            for(int i=0; i<4; i++){
                output[i] = C[tmp]/coins[i];
                C[tmp] %= coins[i];
    
                System.out.printf("%d ", output[i]);
                
            }
            System.out.println("");
        }
       

        // 25 10 5 1
     
     
       
    }
}
