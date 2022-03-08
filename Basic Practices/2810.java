import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String seats = new String(br.readLine());
        int cupHolder = 1;

        for (int i = 0; i < N; i++) {
            if (seats.charAt(i) == 'S') {
                cupHolder++;
            } else if (seats.charAt(i) == 'L') {
                i++;
                cupHolder++;
            }
        }

        System.out.println(seats.length() > cupHolder ? cupHolder : seats.length());

    }
}
