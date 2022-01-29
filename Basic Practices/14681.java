import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		s.close();

		if(x>0) {
			if(y>0) System.out.println(1);
			if(y<0) System.out.println(4);			
		} else if(x<0) {
			if(y>0) System.out.println(2);
			if(y<0) System.out.println(3);		
		}
	}

}
