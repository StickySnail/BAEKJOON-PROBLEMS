import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 할당된 버퍼에 값 넣어주기

		int T = Integer.parseInt(bf.readLine());
		for (int i = 1; i <=T; i++) {
			for(int p = T; p>0; p--) {
				if(i>=p) bw.write("*");
				else bw.write(" ");
			}
			bw.write("\n");
			
		}

		bw.flush(); // 남아있는 데이터를 모두 출력시킴
		bw.close(); // 스트림을 닫음

	}

}
