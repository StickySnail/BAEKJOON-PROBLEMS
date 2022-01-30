import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		
		for(int i = 0; i<a; i++) {
			int A = s.nextInt();
			int B = s.nextInt();
			System.out.printf("%d%n", A+B);
		}
		
		
		s.close();
	}

}
