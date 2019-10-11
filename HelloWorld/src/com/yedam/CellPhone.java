package com.yedam;

public class CellPhone {
	String model;
	String color;
	
	public CellPhone() {
		super(); // super는 부모 클래스 나타냄, 여기에서는 디폴트 최상위 클래스 object 뜻함
	}
	
	public CellPhone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}

}
