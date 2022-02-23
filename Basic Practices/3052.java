import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		final int N = 10;

		int[] arr = new int[N];

		// initialize array
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			arr[i] %= 42;

		}

		System.out.println(Count(arr, N));

	}

	public static int Count(int a[], int n) {
		// create a variable for the count to register
		int res = 0;
		// loop for the checking if the variable
		for (int i = 0; i < n; i++) {
			// new variable
			int j;
			// loop for checking the value
			for (j = 0; j < i; j++)
				// condition for check
				if (a[i] == a[j])
					break;
			// condition to increse the count
			if (i == j) {
				// incrementing the count
				res++;
			}
		}
		// returning the count ending the function
		return res;
	}

}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashSet<Integer> storeReminders = new HashSet<Integer>(10);

        for (int i = 0; i < 10; i++)
            storeReminders.add(Integer.parseInt(br.readLine()) % 42);

        System.out.println(storeReminders.size());

    }

}
