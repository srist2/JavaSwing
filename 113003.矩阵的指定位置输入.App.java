package pkg;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int input_array[][] = new int[10][10];
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入第几行");
		int input_row = scanner.nextInt();
		System.out.println("输入第几列");
		int input_column = scanner.nextInt();
		System.out.println("输入的数字");
		int input_number = scanner.nextInt();
		//存入数组
		input_array[input_row - 1][input_column - 1] = input_number;
		for(int i = 0; i < input_array.length; i++) {
			for (int j = 0; j < input_array[i].length; j++) {
				System.out.print(input_array[i][j] + "\t");
			}
			System.out.println("");
		}
		
	}

}
