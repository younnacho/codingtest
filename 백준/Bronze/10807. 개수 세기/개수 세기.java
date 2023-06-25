import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 정수의 개수 N
		int count = 0;

		int[] array = new int[n]; // (정수가 공백으로 구분 - 배열)

		// 배열 입력 받기
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt(); // 정수 배열 입력 받기
		}

		int v = sc.nextInt(); // 셋째 줄에는 찾으려고 하는 정수 v

		// 배열의 길이만큼 반복문 돌리기
		for (int i = 0; i < array.length; i++) {

			if (array[i] == v) {
				count++; // 1씩 증가

			}
		}

		System.out.println(count);
	}
}
