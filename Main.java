public class Main {
	public static void main(String[] args) throws InterruptedException {
		String[][] b = new String[5][5];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				b[i][j] = "□";
			}
		}

		for (int i = 0; i < 5; i++) {
			String line = "";
			for (int j = 0; j < 5; j++) {
				line = line + b[i][j];
			}
			System.out.println(line);
		}
	}
}
