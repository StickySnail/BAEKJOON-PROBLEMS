import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];
		int[] score = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}
//		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < N; i++) {
			int a = 0;
			for (int j = 0; j < arr[i].length(); j++) {
				if ('O' == arr[i].charAt(j)) {
					a++;
					if(j+1 == arr[i].length()) score[i] += ((a + 1) * a / 2);
					continue;
				}
				if('X'==arr[i].charAt(j)) {
					score[i] += ((a + 1) * a / 2);
					a = 0;
					continue;
				}
			}
		}
//		
		// print answer
		for (int i : score)
			System.out.println(i);

	}

}

//better answer

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.StringTokenizer;
//
//public class Main {
//
//	public static void main(String[] args) throws IOException {
//
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//		int N = Integer.parseInt(br.readLine().trim());
//		int[] scores = new int[N];
//
//		for (int i = 0; i < N; i++) {
//			String ox = br.readLine().trim();
//
//			int score = 0;
//			int count = 1;
//			for (int k = 0; k < ox.length(); k++) {
//				if (ox.charAt(k) == 'O') {
//					score += (count++);
//				} else {
//					count = 1;
//				}
//
//				scores[i] = score;
//			}
//		}
//		for(int i : scores) System.out.println(i);
//
//	}
//
//}
