package com.yedam.interfacePkg;

public interface RemoteControl {
	public static final int MAX_VALUE = 10; // 상수 필드
	int MIN_VALUE = 0; // 추상 메소드
	public abstract void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	}


