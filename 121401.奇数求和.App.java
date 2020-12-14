package pkg;

public class App {
	public static void main(String[] args) {
		long num = 0;
		for (int i = 0; i < 2147483647; i++) {
			if (i%2 == 1) {
				num = i + num;
			}
		}
		System.out.println("1+3+5+7+...+2147483647奇数和为：" + num);
	}
}
