package com.yedam;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		DmbCellPhone dmbCell = new DmbCellPhone("510", "white", 10);
		System.out.println("mode: " + dmbCell.model); // 부모 필드
		System.out.println("color: " + dmbCell.color); // 부모 필드
		System.out.println("channel: " + dmbCell.channel); // 자신 필드
		dmbCell.powerOn(); // 부모의 메소드
		dmbCell.turnOnDmb(); // 자신 메소드
		dmbCell.turnOffDmb();
		dmbCell.powerOff();
	}

}
