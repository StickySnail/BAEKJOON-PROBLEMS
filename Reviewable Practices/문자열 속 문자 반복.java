import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		int[] R = new int[T];
		String[] S = new String[T];
		String[] output = new String[T];

		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			R[i] = Integer.parseInt(st.nextToken());
			S[i] = st.nextToken();
		}

		for (int i = 0; i < T; i++) {
			int jali = 0;
			for (int j = 1; j <= R[i] * S[i].length(); j++) {
				System.out.print(S[i].charAt(jali));
				if (j % R[i] == 0)
					jali++;
			}
			System.out.println("");
		}

		br.close();
	}

}


// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;
 
// public class Main {
 
// 	public static void main(String[] args) throws IOException {
    
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		StringBuilder sb = new StringBuilder();
        
// 		int T = Integer.parseInt(br.readLine());        
 
// 		for (int i = 0; i < T; i++) {
 
// 			String[] str = br.readLine().split(" ");
 
// 			int R = Integer.parseInt(str[0]);
 
// 			for (byte val : str[1].getBytes()) {
// 				for (int j = 0; j < R; j++) {
// 					sb.append((char)val);
// 				}
// 			}
// 			sb.append('\n');
// 		}
// 		System.out.print(sb);
// 	}
 
// }
