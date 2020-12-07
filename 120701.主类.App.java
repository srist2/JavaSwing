package pkg;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array2D[][] = {
				{1, 2, 3, 4, 5, 6},
				{7, 8, 9, 10, 0, 12},
				{8, 8, 9, 10, 11, 12},
				{7, 8, 3, 10, 11, 12},
				{88, 66, 92, 102, 151, 999},
				};
		int array2D_1[][] = {
				{0,1},
				{2,3},
				{4,5}
		};
		new Find().findZero(array2D);
	}
}
