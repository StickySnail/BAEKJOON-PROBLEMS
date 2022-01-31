import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int C = Integer.parseInt(br.readLine());
		Integer[] arr = new Integer[1];
		double[] avg = new double[C];
		double[] aboveAvg = new double[C];
		int aboveCount = 0;

		for (int i = 0; i < C; i++) {
			st = new StringTokenizer(br.readLine());
			arr[0] = Integer.parseInt(st.nextToken());

			double p = arr[0];
			arr = new Integer[arr[0] + 1];
			arr[0] = (int) p;

			for (int j = 1; j < arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}

			for (int q = 0; q < p; q++) {
				avg[i] += arr[q + 1];
			}
			avg[i] /= arr[0];

			for (int w = 1; w < arr.length; w++) {
				if (avg[i] < arr[w])
					aboveCount++;
			}
			aboveAvg[i] = aboveCount / p * 100;
			aboveCount = 0;
		}
		for(int i=0;i<C;i++)
		System.out.printf("%.3f%%%n", aboveAvg[i]);
	}
}
