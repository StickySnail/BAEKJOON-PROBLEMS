import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int result = 0;
		int count = 1;

		for (int i = 9; i <= N; i += 3) {
			result += count;
			count += 1;
		}

		System.out.print(result);

	}

}
