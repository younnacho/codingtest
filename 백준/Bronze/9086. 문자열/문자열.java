import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // test 케이스 개수

		for (int i = 0; i < t; i++) {
			String str = sc.next();
			int a = str.length();
			String start = String.valueOf(str.charAt(0));
			String end = String.valueOf(str.charAt(a - 1));
			System.out.println(start + end);
		}
	}
}