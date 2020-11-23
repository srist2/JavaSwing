package pkg;

import java.util.Random;
import java.util.Scanner;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[][] = {{10,50}, {20, 35}, {30, 25}, {40, 70}};
		while (true) {
			System.out.println("用户输入");
			Scanner scanner = new Scanner(System.in);
			String  input_str = scanner.nextLine();
			Random random = new Random();
			int randomX = random.nextInt(4);
			if (input_str.equals("a")) {
				System.out.println("坐标" + array[randomX][0] + "Y坐标" + array[randomX][1]);
			}
		}
	}

}
