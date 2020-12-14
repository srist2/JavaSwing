package pkg;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		System.out.println("输入一个整形数字判断闰年");
		Scanner scanner = new Scanner(System.in);
		int number_input = scanner.nextInt();
		new App().isLeapYear(number_input);
	}
	public void isLeapYear(int year) {
		if (year < 0) {
			if (year < -3200) {
				System.out.println("超出范围");
				return;
			}
			year =-year;
			if (year%400 == 1) {
				System.out.println("公元前" + year + "年是闰年");
			} else {
				if (year%4==1) {
					System.out.println("公元前" + year + "年是闰年");
					return;
				}
				System.out.println("公元" + year + "年不是闰年");
			}
		} else {
			if (year > 3200) {
				System.out.println("超出范围");
				return;
			}
			if (year%400 == 0) {
				System.out.println("公元" + year + "年是闰年");
			} else {
				if (year%4 == 0 && year%100 != 0) {
					System.out.println("公元" + year + "年是闰年");
					return;
				}
				System.out.println("公元" + year + "年不是闰年");
			}
		}
	}
}
