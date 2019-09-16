package hello;

public class ForAndForExample {
	public static void main(String[] args) {
		for (int i=2; i<10; i++) {
			for (int j=0; j<5; j++) {
				System.out.println("<< " + i + "단>>");
			}
			System.out.println("i:: " + i);
		}
	}

}
