import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	static int count = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		br.close();
		for (int i = 1; i <= N; i++) {
			isHansu(i, N);
		}

		System.out.print(count);

	}

	static void isHansu(int n, int N) {

		if (n < 100)
			count++;
		else if (n == 1000)
			count = count;
		else if (n / 100 - n % 100 / 10 == n % 100 / 10 - (n % 10))
			count++;

	}

}
