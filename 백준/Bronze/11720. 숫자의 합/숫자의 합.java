import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 첫째줄 입력 (숫자의 개수) 
		String str = sc.next();
		char[] c = str.toCharArray();

		int sum = 0;
		for (int i = 0; i < c.length; i++) {
			sum += c[i] - 48;
		}
		System.out.println(sum);
	}
}
