package com.yedam.example;

public class KeumhoTire extends Tire {
	public KeumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		this.accumulatedRotation++;
		if (maxRotation > accumulatedRotation) {
			System.out.println(location + " Keumho 타이어 수명: " + (maxRotation - accumulatedRotation) + " 회");
			return true;
		} else {
			System.out.println("*** " + location + "Keumho 타이어 펑크 ***");
			return false;
		}
	}
}
