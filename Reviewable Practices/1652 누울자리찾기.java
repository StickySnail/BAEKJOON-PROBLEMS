// 입력값을 가로와 세로 계산 버전 따로따로 만들어 2차원 배열을 구사하지 않더라도 1차원 배열 선에서 해결 할 수 있도록 접근함
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String[] horizontal = new String[N];
        String[] vertical = new String[N];

        int H = 0;
        int V = 0;

        for (int i = 0; i < N; i++) {
            horizontal[i] = br.readLine();
        }

        for (int i = 0; i < N; i++) {
            vertical[i] = new String();
            for (int j = 0; j < N; j++) {
                vertical[i] += "" + horizontal[j].charAt(i);
            }
        }

        for (int i = 0; i < N; i++) {
            int tmpH = 0, tmpV = 0;
            for (int s = 0; s < N; s++) {
                if (horizontal[i].charAt(s) == '.') {
                    tmpH++;
                }
                if (horizontal[i].charAt(s) == 'X' || s == N - 1) {
                    if (tmpH >= 2) {
                        H += 1;
                    }
                    tmpH = 0;
                }

                if (vertical[i].charAt(s) == '.') {
                    tmpV++;
                }
                if (vertical[i].charAt(s) == 'X' || s == N - 1) {
                    if (tmpV >= 2) {
                        V += 1;
                    }
                    tmpV = 0;
                }

            }

        }

        bw.write(String.format("%d %d", H, V));

        // 출력
        bw.flush();
        bw.close();

    }

}

        // 출력
        bw.flush();
        bw.close();

    }

}

//숏코딩 : X를 기준으로 나누어 '.'의 갯수를 구한다음 답을 찾음 (멋진 접근)
import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] room = new String[sc.nextInt()];
		int width=0, height=0;
		for(int i=0; i<room.length; i++) {
			room[i]=sc.next();
			String [] arr = room[i].split("X");
			for(String s : arr) {
				if(s.length()>1) width++;
			}
		}
		for(int i=0; i<room.length; i++) {
			StringBuffer sb = new StringBuffer();
			for(int j=0; j<room.length; j++) {
				sb.append(room[j].charAt(i));
			}
			for(String s : sb.toString().split("X")) {
				if(s.length()>1) height++;
			}
		}
		System.out.println(width+" "+height);
	}
}
