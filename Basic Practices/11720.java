import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	static int count = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		String number = br.readLine();
		br.close();
		
		int sum = 0;
		
		
		for(int i=0; i<N; i++) {
			sum += (number.charAt(i) - 48);
		}
		
		
		
		System.out.print(sum);

	}

}
