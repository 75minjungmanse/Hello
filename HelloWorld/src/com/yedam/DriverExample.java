package com.yedam;

class Driver {
	void drive(Vehicle vehicle) {
		vehicle.run();
	}
}
public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Vehicle vehicle = new Vehicle();
		vehicle = new Bus();
		vehicle = new Taxi();
		
		driver.drive(vehicle); // 괄호 안 매개값에 따라 차가 달립니다, 버스가 달립니다로 바뀜
								// 다형성 개념. 똑같은 구문 실행해도 값 달라지는 것.
	}
}
