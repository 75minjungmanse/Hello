package com.yedam.example;

public class Tire {
	int maxRotation; // 사용 가능한 최대 회전 수
	int accumulatedRotation; // 축적된 회전 수
	String location; // 바퀴 위치

	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	public boolean roll() {
		accumulatedRotation++;
		if (maxRotation > accumulatedRotation) {
			System.out.println(location + " 타이어 수명: " + (maxRotation - accumulatedRotation) + " 회");
			return true;
		} else {
			System.out.println("*** " + location + " 타이어 펑크 ***");
			return false;
		}
	}
}
