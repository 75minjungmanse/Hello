package hello;

public class 구구단 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j + "*" + i + "=" + i * j + " ");
			}
			System.out.println();
		}
	}

}
