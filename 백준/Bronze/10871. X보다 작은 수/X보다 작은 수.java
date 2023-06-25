import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 10
		int x = sc.nextInt(); // 5

		int[] array = new int[n];

		
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
			if (array[i] < x) {
				System.out.print(array[i] + " ");
			}

		}
	}
}
