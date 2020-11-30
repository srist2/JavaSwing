package pkg;

public class App implements R {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("boy_filePath" + R.boy_filePath);
		System.out.println("girl_filePath" + R.girl_filePath);
		for(int i = 0; i < R.array2d.length; i++) {
			for (int j = 0; j < R.array2d[i].length; j++) {
				System.out.println(R.array2d[i][j]);
			}
		}
	}

}
