import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		
		s.close();
		
		for(int i = 1; i<10; i++) {
		System.out.printf("%d * %d = %d%n", a, i, a*i);
		}
	
	}

}
