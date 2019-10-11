package com.yedam;

public class DmbCellPhone extends CellPhone {
	int channel;

	public DmbCellPhone(int channel) {
		super();
		this.channel = channel;
	}

	public DmbCellPhone(String model, String color, int channel) {
		super(model, color);
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("채널 " channel + "번 방송 수신을 시작합니다.");
	}
	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 채널을 변경합니다.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송을 종료합비낟.");
	}
	
	
}
