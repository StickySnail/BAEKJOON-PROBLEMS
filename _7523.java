import java.util.Scanner;

public class Main {
	
	public static long calculate(long n, long m) {
		return (m+n)*(m-n+1)/2;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] ans = new long[N];
		
		for (int i = 0; i<N; i++) {
			ans[i] = calculate(sc.nextLong(), sc.nextLong());
		}
		
		for (int i =0; i<N; i++) System.out.printf("Scenario #%d:\n" + ans[i] + "\n\n", i+1);
		
		sc.close();
	
	}
}
