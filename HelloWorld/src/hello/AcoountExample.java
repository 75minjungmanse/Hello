package hello;

import java.util.Scanner;

public class AcoountExample {
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1. 계좌 생성 2. 계좌 목록 3. 입금 4. 출금 5. 종료");
			System.out.println("-------------------------------------");
			int menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				createAccount();
			} else if (menu == 2) {
				getAccountList();
			} else if (menu == 3) {
				deposit();
			} else if (menu == 4) {
				withdraw();
			} else if (menu == 5) {
				run = false;
			}

		}
		System.out.println("프로그램 종료");
	}

	// 계좌 인스턴스 만드는 메소드
	public static void createAccount() {
		System.out.println("생성할 계좌번호: ");
		String accountNo = sc.nextLine();
		System.out.println("사용자명: ");
		String accountName = sc.nextLine();
		System.out.println("첫 계좌 금액: ");
		int accountBalance = sc.nextInt();
		Account accnt = new Account(accountNo, accountName, accountBalance);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = accnt;
				break;
			}
		}
	}

	// 계좌 리스트 조회 메소드
	public static void getAccountList() {
		for (Account a : accountArray) {
			if (a != null)
				System.out.println("계좌 번호: " + a.getAccNum() + ", 소유자: " + a.getOwner() + ", 잔액: " + a.getBalance());
		}
	}

	// 입금 메소드
	public static void deposit() {
		System.out.println("계좌 번호 입력: ");
		String accNum = sc.nextLine();
		System.out.println("입금액: ");
		int accntBalance = sc.nextInt();
		for(Account accnt : accountArray) {
			if(accnt != null && accnt.getAccNum().equals(accNum)) {
				accnt.setBalance(accntBalance);
			}
		}
	}

	// 출금 메소드
	public static void withdraw() {
		System.out.println("계좌 번호 입력: ");
		String accNum = sc.nextLine();
		System.out.println("출금액: ");
		int accntBalance = sc.nextInt();
		for(Account accnt : accountArray) {
			if(accnt != null && accnt.getAccNum().equals(accNum)) {
				accnt.setBalance(accntBalance*(-1));
			}
		}
	}

	// 원하는 계좌 입력
	public static Account findAccount(String accNum) {
		return null;
	}

}
