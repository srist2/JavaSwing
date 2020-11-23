package pkg;

public class App {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int array[][] = {{10,500}, {150, 570}, {500, 700}, {300, 400}};
		while (true) {
			Thread.sleep(1000);
			int rdm = (int)(Math.random()*10%4);
			System.out.println(array[rdm][0]+","+array[rdm][1]);
		}
	}

}
