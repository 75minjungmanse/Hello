package com.yedam.lambda;

interface MyInterfaceNoArgs { // 매개 값 없고 리턴 타입 void인 인터페이스
	public void method();
}

interface MyInterfaceWithArgs {
	public void method2(int a);
}

interface MyInterfaceWithReturn {
	public int method3(int a, int b);
}



public class LambdaBasicExample2 {
	public static void main(String[] args) {
		MyInterfaceNoArgs fina = () -> {
				System.out.println("no arguments expression");
		};
		fina.method();
		
		MyInterfaceWithArgs fiwa = (a) -> {
			System.out.println("result is " + (a * 3));
		};
		fiwa.method2(5);
		
		MyInterfaceWithReturn fiwr = (a, b) -> {
			return a+b;
		};
		int result = fiwr.method3(5, 10);
		System.out.println("결과값: " + result);
	}

}

