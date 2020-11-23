package pkg;

import java.util.Random;
import java.util.Scanner;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("用户输入");
			Scanner scanner = new Scanner(System.in);
			String  input_str = scanner.nextLine();
			if (input_str.equals("a")) {
				System.out.println("X坐标" + (int)(Math.random()*100) + "Y坐标" + (int)(Math.random()*100));
			}
		}
	}

}
