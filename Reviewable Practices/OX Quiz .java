import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine().trim());
		int[] scores = new int[N];

		for (int i = 0; i < N; i++) {
			String ox = br.readLine().trim();

			int score = 0;
			int count = 1;
			for (int k = 0; k < ox.length(); k++) {
				if (ox.charAt(k) == 'O') {
					score += (count++);
				} else {
					count = 1;
				}

				scores[i] = score;
			}
		}
		for(int i : scores) System.out.println(i);

	}

} 
 
 
