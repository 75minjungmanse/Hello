package com.yedam;
class Calculator {
	double areaCircle(double r) {
		return 3.14 * r * r;
	}
}

class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		return Math.PI * r * r;
	}
	double areaCircle1(double r) {
		return super.areaCircle(r);
	}
}

public class ComputerExample {
	public static void main(String[] args) {
		Computer com = new Computer();
		System.out.println("결과값: " + com.areaCircle(10));
	}

}
