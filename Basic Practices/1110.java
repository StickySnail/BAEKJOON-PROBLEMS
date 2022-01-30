import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine());
		int result = input;
		int count = 0;
		
		do {
			input = (input%10)*10 + ((input/10) + (input%10))%10;
			count++;
			
		}while(result != input);
		System.out.println(count);
	}
}
