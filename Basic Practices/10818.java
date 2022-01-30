import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		
	
		for(int i=0; i<N; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Integer[] ARR = Arrays.stream(arr).boxed().toArray(Integer[]::new);
		int min = Collections.min(Arrays.asList(ARR));
		int max = Collections.max(Arrays.asList(ARR));
		 
		System.out.printf("%d %d", min, max);
		
	
		
	}
}
