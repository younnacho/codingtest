import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt(); // 원소 m개

		int[][] a = new int[n][m];
		int[][] b = new int[n][m];

		for (int i = 0; i < n; i++) { // 행 반복문
			for (int j = 0; j < m; j++) { // 열 반복문
				a[i][j] = sc.nextInt(); // 행렬 입력 받기
			}
		}

		for (int i = 0; i < n; i++) { // 행 반복문
			for (int j = 0; j < m; j++) { // 열 반복문
				b[i][j] = sc.nextInt(); // 행렬 입력 받기
			}
		}

		for (int i = 0; i < n; i++) { // 행 반복문
			for (int j = 0; j < m; j++) { // 열 반복문
				System.out.print(a[i][j] + b[i][j] + " ");
				if (j == m - 1) {
					System.out.println();
				}

			}
		}

	}
}