import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
       
        int tmp = N;
        for(int i=0; i<N; i++){
            for(int k=1; k<=N*2-1; k++){
                if(tmp<=k && k<=(tmp+2*i)){
                    System.out.print("*");
                }else if((tmp+2*i)<k){
                    break;
                }else{
                    System.out.print(" ");
                }
            }
                tmp--;
            System.out.println("");
        }
    }
}
