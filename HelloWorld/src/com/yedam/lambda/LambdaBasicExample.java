package com.yedam.lambda;
@FunctionalInterface
interface MyInterface { // 람다식 표현 방법
	int print(int a, int b);
}
class MyInterfaceClass implements MyInterface {

	@Override
	public int print(int a, int b) {
		return 0;
	}
}


public class LambdaBasicExample { // 원래 구현 방법
	public static void main(String[] args) {
		MyInterface mi = new MyInterfaceClass();
		int result = mi.print(4, 9);
		System.out.println("결과값: " + result);
		
		mi = (a, b) -> {
				return a*b;
			};
			
		
		result = mi.print(3, 5);
		System.out.println("결과값: " + result);
		
		mi = (a, b) -> {
				return a-b;
		};
		result = mi.print(7, 4);
		System.out.println("결과값: " + result);
		
		mi = (a, b) -> {
			return a / b;
		};
		System.out.println("결과값: " + mi.print(8, 4));
	}

}
