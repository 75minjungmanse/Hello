package com.yedam.example2;

import com.yedam.example.HankookTire;
import com.yedam.example.KeumhoTire;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		for (int i = 0; i < 10; i++) {
			int problemLocation = car.run();
			switch (problemLocation) {
			case 1:
				System.out.println("앞의 왼쪽 타이어를 Hankook 타이어로 교체.");
				car.tires[0] = new HankookTire("앞의 왼쪽", 15);
				break;
			case 2:
				System.out.println("앞의 오른쪽 타이어를 Keumho 타이어로 교체.");
				car.tires[1] = new KeumhoTire("앞의 오른쪽", 17);
				break;
			case 3:
				System.out.println("뒤의 왼쪽 타이어를 Hankook 타이어로 교체.");
				car.tires[2] = new HankookTire("뒤의 왼쪽", 16);
				break;
			case 4:
				System.out.println("뒤의 오른쪽 타이어를 Keumho 타이어로 교체.");
				car.tires[3] = new KeumhoTire("뒤의 오른쪽", 15);
				break;
			}
			System.out.println("---------------------------------");
	}

}
}
