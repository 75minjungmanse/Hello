package com.yedam.example;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		for (int i = 0; i < 10; i++) {
			int problemLocation = car.run();
			switch (problemLocation) {
			case 1:
				System.out.println("앞의 왼쪽 타이어를 Hankook 타이어로 교체.");
				car.frontLeft = new HankookTire("앞의 왼쪽", 15);
				break;
			case 2:
				System.out.println("앞의 오른쪽 타이어를 Keumho 타이어로 교체.");
				car.frontRight = new KeumhoTire("앞의 오른쪽", 17);
				break;
			case 3:
				System.out.println("뒤의 왼쪽 타이어를 Hankook 타이어로 교체.");
				car.backLeft = new HankookTire("뒤의 왼쪽", 16);
				break;
			case 4:
				System.out.println("뒤의 오른쪽 타이어를 Keumho 타이어로 교체.");
				car.backRight = new KeumhoTire("뒤의 오른쪽", 15);
				break;
			}
			System.out.println("---------------------------------");
	}

}
}
