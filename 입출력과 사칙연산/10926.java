
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		s.close();
		
		if (isStringLowerCase(input)) {
			input += "??!";
			char[] stor = input.toCharArray();
			System.out.println(stor);
		}

	}

	public static boolean isStringLowerCase(String s) {

		char[] chArr = s.toCharArray();
		for (int i = 0; i < chArr.length; i++) {
			if (Character.isLowerCase(chArr[i]))
				continue;
			else
				return false;
		}
		return true;
	}

}
