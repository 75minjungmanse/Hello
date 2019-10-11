package com.yedam.abstractPkg;

public class AnimalExample {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog  = new Dog();
		cat.sound();
		dog.sound();
		System.out.println("------------------");
		Animal animal = null;
		animal = cat;
		animalSound(animal);
		animal = dog;
		animalSound(animal); // 매개 변수의 다형성
	}
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}

// 추상 클래스 통해서 sound라는 함수를 재정의하도록 만들 때