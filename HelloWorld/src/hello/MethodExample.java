package hello;

public class MethodExample {
	public static void main(String[] args) {
		System.out.println(args[0]);
		showName();
		showAge(25);
		showMe(158.5, 45.0);
		int sum = sum(4, 5);
		int minus = minus(9, 3);
		int multi = multi(2, 7);
		int result = div(8, 4);
		System.out.println("결과값: " +sum);
		System.out.println("결과값: " +minus);
		System.out.println("결과값: " +multi);
		System.out.println("결과값: " +result);
		System.out.println(args[1]);
	}
	
	
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static int minus(int c, int d) {
		return c - d;
	}
	
	public static int multi(int e, int f) {
		return e * f;
	}
	
	public static int div(int g, int h) {
		return g / h;
	}
	
	public static void showMe(double height, double weight) {
		System.out.println("I am "+height+" cm and "+weight+" kg");
	}
	
	public static void showAge(int age) {
		System.out.println("I am "+age+" years old.");
	}
	
	public static void showName() {
		System.out.println("Hello, my name is Minjung.");
	}
	

}
