import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int count = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String S = br.readLine();
		br.close();

		String alphabet = "a b c d e f g h i j k l m n o p q r s t u v w x y z";

		for (int i = 0; i < S.length(); i++) {
			for (int j = 0; j < alphabet.length(); j++) {
				alphabet = alphabet.replace(String.valueOf(S.charAt(i)), String.valueOf(i));

			}
		}

		for (int i = 0; i < alphabet.length(); i++)
			if (alphabet.charAt(i) > 95)
				alphabet = alphabet.replace(String.valueOf(alphabet.charAt(i)), String.valueOf(-1));
		System.out.print(alphabet);

	}
}


// 이런 접근도 가능
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;
 
// public class Main {
 
// 	public static void main(String[] args) throws IOException {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
// 		int[] arr = new int[26];
		
// 		for(int i = 0; i < arr.length; i++) {
// 			arr[i] = -1;
// 		}
 
// 		String S = br.readLine();
 
// 		for(int i = 0; i < S.length(); i++) {
// 			char ch = S.charAt(i);
    
// 			if(arr[ch - 'a'] == -1) {	// arr 원소 값이 -1 인 경우에만 초기화
// 				arr[ch - 'a'] = i;
// 			}
// 		}
 
// 		for(int val : arr) {	// 배열 출력
// 			System.out.print(val + " ");
// 		}
// 	}
// }
