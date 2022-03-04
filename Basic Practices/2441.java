import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String blank = "";
        
        for(int i=N; i>0; i--){
            for(int k=i; k>0; k--){
                System.out.print("*");
            }
            System.out.println("");
            blank += " ";
            System.out.print(blank);
        }


    }

}
