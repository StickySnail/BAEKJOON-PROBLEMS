import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int H = s.nextInt();
		int M = s.nextInt();
		s.close();

		if (M >= 45)
			M -= 45;
		else if (M < 45) {
			if (H == 0)	H = 23;
			else H -= 1;
			M += 15;
		}
	System.out.println(H + " " + M);
	
	}

}
