import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String hexInput = br.readLine();
        int decimal = Integer.parseInt(hexInput, 16);

        System.out.print(decimal);

    }

}
