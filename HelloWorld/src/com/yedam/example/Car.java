package com.yedam.example;

public class Car {
	Tire frontLeft = new Tire("앞의 왼쪽", 6); // 1
	Tire frontRight = new Tire("앞의 오른쪽", 2); // 2
	Tire backLeft = new Tire("뒤의 왼쪽", 3); // 3
	Tire backRight = new Tire("뒤의 오른쪽", 4); // 4

	int run() {
		System.out.println("[자동차가 달립니다.]");
		if (frontLeft.roll() == false) {
			stop();
			return 1;
		} else if (frontRight.roll() == false) {
			stop();
			return 2;
		} else if (backLeft.roll() == false) {
			stop();
			return 3;
		} else if (backRight.roll() == false) {
			stop();
			return 4;
		}
		return 0;

	}

	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}

}
