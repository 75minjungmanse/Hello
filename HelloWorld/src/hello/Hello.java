package hello;

public class Hello {
	public static void main(String[] args) {
		
		System.out.println("Hello, World");
		int num1 = 0;
		
		num1++; // num1 = num1 + 1;
		int a = 5, b = 7;
		num1 = a++ + ++b; // a++ -> 6, ++b -> 8
		System.out.println(a++ + "," + ++b);
		System.out.println("num1 : " + num1);
	}
}
