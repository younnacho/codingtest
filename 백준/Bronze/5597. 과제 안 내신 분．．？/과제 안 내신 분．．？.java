import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] array = new int[31]; // 30개 들어감

		// 배열 입력 받기
		for (int i = 0; i < 28; i++) {
			int pass = sc.nextInt(); // 28줄 입력받기
			array[pass] = 1;
		}

		// 배열의 길이만큼 반복문 돌리기
		for (int i = 1; i < array.length; i++) {

			if (array[i] != 1) {
				System.out.println(i);

			}
		}
		sc.close(); // 입력 끝

	}
}