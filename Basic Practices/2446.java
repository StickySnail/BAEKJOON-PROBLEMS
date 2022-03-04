import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int c = 0;
            for (int k = 0; k < N * 2-1; k++) {
                if (i <= c && c <N * 2-i-1) {
                    System.out.print("*");
                } else if(c >=N*2-i-1){
                    break;
                }else {
                    System.out.print(" ");
                }
                c++;
            }
            System.out.println("");
        }

        
        for (int i = N-1; i >0; i--) {
            int c = 1;
            for (int k = 0; k < N * 2-1; k++) {
                if (i <= c && c <=N * 2-i) {
                    System.out.print("*");
                } else if(c>N*2-i){
                    break;
                }else {
                    System.out.print(" ");
                }
                c++;
            }
            
            System.out.println("");
        }
    }
}
