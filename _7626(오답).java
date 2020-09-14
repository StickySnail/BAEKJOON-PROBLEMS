import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N][4];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 4; j++)
				arr[i][j] = sc.nextInt();
		}
		sc.close();

		// sorting
		// (https://stackoverflow.com/questions/15452429/java-arrays-sort-2d-array)
		java.util.Arrays.sort(arr, new java.util.Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return Integer.compare(a[0], b[0]);
			}
		});

		// area sum
		int area = 0;
		for (int i = 0; i < N; i++) {
			int x = arr[i][1] - arr[i][0];
			int y = arr[i][3] - arr[i][2];
			area += x * y;
		}

		// subtract areas in common
		// Point : how to determine the common areas?
		int sub = 0;
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				int x = 0;
				int y = 0;

				if (arr[i][0] <= arr[j][0] && arr[i][1] < arr[j][1]) {
					x = Math.abs(arr[i][1] - arr[j][0]);
				} else if (arr[i][0] <= arr[j][0] && arr[i][1] >= arr[j][1]) {
					x = Math.abs(arr[j][1] - arr[j][0]);
				}

				if (arr[i][2] <= arr[j][2] && arr[i][3] < arr[j][3]) {
					y = Math.abs(arr[i][3] - arr[j][2]);
				} else if (arr[j][2] <= arr[i][2] && arr[j][3] < arr[i][3]) {
					y = Math.abs(arr[j][3] - arr[i][2]);
				} else if (arr[i][2] <= arr[j][2] && arr[i][3] >= arr[j][3]) {
					y = Math.abs(arr[j][3] - arr[j][2]);
				} else if (arr[j][2] <= arr[i][2] && arr[j][3] >= arr[i][3]) {
					y = Math.abs(arr[i][3] - arr[i][2]);
				}

				if (x != 0 && y != 0)
					sub += x * y;
			}
		}

		// output
		System.out.println(area - sub);

	}
}
