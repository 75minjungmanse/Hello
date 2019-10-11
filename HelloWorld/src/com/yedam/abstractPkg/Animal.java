package com.yedam.abstractPkg;

public abstract class Animal {
	public String kind;
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	public abstract void sound();

}

class Cat extends Animal { // Animal 클래스 상속 받는 모든 클래스들은 sound 재정의 무조건 해야 함
						   // Animal의 sound는 추상이라서 sysout 불가능하지만 하위 클래스들은 가능
	@Override
	public void sound() {
		System.out.println("야옹");
		
	}
	
}

class Dog extends Animal {
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	
}