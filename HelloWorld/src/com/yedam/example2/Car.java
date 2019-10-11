package com.yedam.example2;

import com.yedam.example.Tire;

public class Car {
	Tire[] tires = { new Tire("앞의 왼쪽", 6), new Tire("앞의 오른쪽", 2), new Tire("뒤의 왼쪽", 3), new Tire("뒤의 오른쪽", 4) };

	int run() {
		System.out.println("[자동차가 달립니다.]");
		for (int i = 0; i < tires.length; i++) {
		if (tires[i].roll() == false) {
			stop();
			return 1+i;
	
		}
		
	}
	return 0;
}
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}