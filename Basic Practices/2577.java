import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		final int N = 3;
		int result = 1;
		int divider = 10;
		int count = 0;
		int number;
		Integer[] arr = new Integer[N];
		int[] arrForCount = new int[10];

		// initialize array
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		for (int i : arr) {
			result *= i;
		}

		while (true) {
			number = result % divider;
			result = result/divider;
			arrForCount[number]++;
			if(result <1) break;
		}

		for (int i : arrForCount) {
			System.out.printf("%d%n", i);
		}

	}
}
