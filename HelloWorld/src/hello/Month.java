package hello;

public class Month {
	public static void main(String[] args) {
		int a = 1;
		for (int i = 0; i < 35; i++) {
			System.out.printf("%3d", a++);
			if (a % 7 == 1)
				System.out.println();
		}
	}

}
