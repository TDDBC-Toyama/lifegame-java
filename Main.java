public class Main {
	public static void main(String[] args) throws InterruptedException {
		String[][] b = new String[5][5];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				b[i][j] = "□";
			}
		}
		b[2][1] = "■";
		b[2][2] = "■";
		b[2][3] = "■";

		for (int i = 0; i < 5; i++) {
			String line = "";
			for (int j = 0; j < 5; j++) {
				line = line + b[i][j];
			}
			System.out.println(line);
		}

		for (int times = 0; times < 3; times++) {
			String[][] bb = new String[5][5];

			for (int i = 0; i < 5; i++) {
				bb[i] = new String[5];

				for (int j = 0; j < 5; j++) {
					int count = 0;

					bb[i][j] = b[i][j];

					if (b[i][j].equals("■")) {
						// 生存・過疎・過密の場合
						count = 0;

						if (i > 0 && b[i - 1][j].equals("■")) count += 1;
						if (j > 0 && b[i][j - 1].equals("■")) count += 1;
						if (j < 4 && b[i][j + 1].equals("■")) count += 1;
						if (i < 4 && b[i + 1][j].equals("■")) count += 1;

						if (count == 2) {
							bb[i][j] = b[i][j];
						} else {
							bb[i][j] = "□";
						}
					}
				}
			}

			b = bb;

			System.out.println(times + "==========");

			for (int i = 0; i < 5; i++) {
				String line = "";
				for (int j = 0; j < 5; j++) {
					line = line + b[i][j];
				}
				System.out.println(line);
			}
		}
	}
}
