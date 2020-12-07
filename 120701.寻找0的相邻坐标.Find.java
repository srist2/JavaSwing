package pkg;

public class Find {
	public int X, Y;

	public void findZero(int array2D[][]) {
		//获取二维数组x，y
		X = array2D[0].length;
		Y = array2D.length;
		for (int row = 0; row < array2D.length; row++) {
			for (int column = 0; column < array2D[row].length; column++) {
				if (array2D[row][column] == 0) {
					System.out.println("R_zero(" + column + ", " + row + ")");
					findTop(column, row);
					findDown(column, row);
					findLeft(column, row);
					findRight(column, row);
				}
			}
		}
	}

	public void findTop(int x, int y) {
		if (y - 1 < 0) {
			System.out.println("R_up(" + x + ", " + y + ")");
		} else {
			System.out.println("R_up(" + x + ", " + (y - 1) + ")");
		}

	}

	public void findDown(int x, int y) {
		if (y + 1 > Y) {
			System.out.println("R_down(" + x + ", " + y + ")");
		} else {
			System.out.println("R_down(" + x + ", " + (y + 1) + ")");
		}
	}

	public void findLeft(int x, int y) {
		if (x - 1 < 0) {
			System.out.println("R_left(" + x + ", " + y + ")");
		} else {
			System.out.println("R_left(" + (x - 1) + ", " + y + ")");
		}

	}

	public void findRight(int x, int y) {
		if (x + 1 > X) {
			System.out.println("R_right(" + x + ", " + y + ")");
		} else {
			System.out.println("R_right(" + (x + 1) + ", " + y + ")");
		}

	}
}
