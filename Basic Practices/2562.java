import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Integer[] arr = new Integer[9];

		// initialize array
		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		// deep copy array
		Integer[] newArray = arr.clone();
		// sort array
		Arrays.sort(newArray);

		System.out.printf("%d\n%d", newArray[newArray.length - 1],
				Arrays.asList(arr).indexOf(newArray[newArray.length - 1])+1);

	
	}
}
