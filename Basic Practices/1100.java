import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        for (int i = 0; i < 8; i++) {
            String oneLine = br.readLine();
            for (int w = 0; w < oneLine.length(); w++) {
                // 처음이 하얀칸
                if (i % 2 == 0) {
                    if (w % 2 == 0 && oneLine.charAt(w) == 'F') {
                        count++;
                    }

                    // 처음이 검은 칸
                } else {
                    if (w % 2 == 1 && oneLine.charAt(w) == 'F') {
                        count++;
                    }

                }
            }
        }
        System.out.println(count);

    }

}
