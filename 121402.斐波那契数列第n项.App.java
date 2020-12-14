package pkg;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		System.out.println("输入一个整形数字输出斐波那契数列");
		Scanner scanner = new Scanner(System.in);
		int number_input = scanner.nextInt();
		int fbnq = new App().fibonacci(number_input);
		System.out.println("fbnq" + fbnq);
	}
	public int fibonacci(int n) {
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 1;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}
}
