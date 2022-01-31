import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		final int N = Integer.parseInt(br.readLine());

		Double[] arr = new Double[N];
		double avg = 0;

		// initialize array
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
		}

		// get max value
		double max = Max(arr);

		for (int i = 0; i < N; i++) {
			arr[i] = arr[i] / max;
			arr[i] = arr[i] * 100;
		}

		for (Double i : arr) {
			avg += i;
		}

		avg /= N;

		System.out.println(avg);

	}

	public static double Max(Double[] arr) {
		Double[] newArray = arr.clone();
		Arrays.sort(newArray);
		return newArray[newArray.length - 1];
	}

}
