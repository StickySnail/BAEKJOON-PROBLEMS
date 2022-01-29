import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		s.close();

		int year = Integer.parseInt(input);

		if (checkY(year))System.out.println(year-543);
		else System.out.println("out of range error");
	}

	public static boolean checkY(int y) {

		if (3000 >= y && y >= 1000)
			return true;
		else
			return false;

	}

}
