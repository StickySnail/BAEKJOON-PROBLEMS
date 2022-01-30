import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		StringTokenizer st1 = new StringTokenizer(bf.readLine());
		
		int N = Integer.parseInt(st1.nextToken());
		int X = Integer.parseInt(st1.nextToken());
		
		StringTokenizer st2 = new StringTokenizer(bf.readLine());
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st2.nextToken());
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<X) bw.write(arr[i] + " ");
		}

		bw.flush(); // 남아있는 데이터를 모두 출력시킴
		bw.close(); // 스트림을 닫음

	}

}
