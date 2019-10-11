package test;

import java.util.Scanner;

import com.board.model.Board;

import hello.Member;

public class Sports {
	private static SportsCenter[] accountAry = new SportsCenter[100];
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------------");
			System.out.println("1. 회원 등록 2. 회원 번호 조회 3. 과정별 조회 4. 종료");
			System.out.println("----------------------------------------------");
			int menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				createMember();
			} else if (menu == 2) {
				getMember();
			} else if (menu == 3) {
				courseList();
			} else if (menu == 4) {
				run = false;
			}

		}
		System.out.println("프로그램 종료");
	}
	
	
	public static void createMember() {
		System.out.println("< 회원 등록 >");
		System.out.println("회원 이름: ");
		String name = sc.nextLine();
		System.out.println("회원 번호: ");
		String id = sc.nextLine();
		System.out.println("등록할 과정: ");
		String course = sc.nextLine();

		SportsCenter sp = new SportsCenter(name, id, course);
		for (int i = 0; i < accountAry.length; i++) {
			if (accountAry[i] == null) {
				accountAry[i] = sp;
				break;

			}
		}
	}
	
	public static void getMember() {
		System.out.println("< 회원 번호 조회 >");
		System.out.println("조회할 번호 입력: ");
		String id = sc.nextLine();
		sp.getId(id, accountAry);
		SportsCenter sp = sp.getId(id, accountAry);
		System.out.println(sp);

}
	
	
	public static void courseList() {
		System.out.println("< 과정별 회원 조회 >");
		System.out.println("1. 수영 | 2. 테니스 | 3. 배드민턴");
		int menuu = sc.nextInt();
		sc.nextLine();
		if (menuu == 1) {
			
		} else if (menuu == 2) {
			
		} else if (menuu == 3) {
			
		}
	}
}
