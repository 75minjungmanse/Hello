package hello;

import java.util.Scanner;

public class MemberTest {
	private static Member[] accountAry = new Member[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("-----------------------------------------");
			System.out.println("1. 계정 생성 2. 계정 목록 3. ID/PSSWD 4. 종료");
			System.out.println("-----------------------------------------");
			int menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				createMember();
			} else if (menu == 2) {
				getMember();
			} else if (menu == 3) {
				idPasswd();
			} else if (menu == 4) {
				run = false;
			}

		}
		System.out.println("프로그램 종료");
	}

	public static void createMember() {
		System.out.println("생성할 계정의 사용자명: ");
		String accountName = sc.nextLine();
		System.out.println("ID: ");
		String accountId = sc.nextLine();
		System.out.println("PASSWORD: ");
		String accountPasswd = sc.nextLine();
		System.out.println("사용자 나이: ");
		int accountAge = sc.nextInt();

		Member mem = new Member(accountName, accountId, accountPasswd, accountAge);
		for (int i = 0; i < accountAry.length; i++) {
			if (accountAry[i] == null) {
				accountAry[i] = mem;
				break;

			}
		}
	}

	public static void getMember() {
		for (Member m : accountAry) {
			if (m != null)
				System.out.println("이름: " + m.getName() + ", ID: " + m.getId() + ", PASSWD: " + m.getPasswd()
						+ ", Age: " + m.getAge());
		}
	}

	public static void idPasswd() {
		System.out.println("ID: ");
		String accountId = sc.nextLine();
		System.out.println("PASSWD: ");
		String accountPasswd = sc.nextLine();
		boolean isId = false, isPw = false;
		String name = null;
		int age = 0;

		for (Member m : accountAry) {
			if (m != null && m.getId().equals(accountId)) {
				if (m.getPasswd().equals(accountPasswd)) {
					isId = true;
					isPw = true; 
					name = m.getName();
					age = m.getAge();
				
			} else if (m != null && m.getId().equals(accountId) && m.getPasswd() != accountPasswd) {
				isId = true;
				isPw = false; break;
				
			} else if (m != null && accountId != m.getId() && accountPasswd != m.getPasswd()) {
				isId = false;
				isPw = false;
						

			
			}
		}
			if (isId == true && isPw == true)
				System.out.println("이름: " + m.getName() + ", 나이: " + m.getAge());
			else if (isId == true && isPw == false)
				System.out.println("패스워드가 잘못되었습니다.");
			else if (isId == false && isPw == false)
				System.out.println("존재하지 않는 ID입니다.");
		}
	}
}
	

