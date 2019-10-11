package hello;

import java.util.Scanner;

public class Baseball {
	public static void main(String[] args) {
		int com[] = new int[3];
		int user[] = new int[3];
		int ch = 0;
		int counter = 0;
		
		boolean randomball = true; 
		
		while (randomball) {
			for (int i = 0; i < com.length; i++) {
				com[i] = (int) (Math.random() * 9) + 1; }
			
			if (com[0] != com[1] && com[0] != com[2] && com[1] != com[2]) {
				randomball = false;
			}
		}
		randomball = true;
		
		System.out.println("야구 게임 시작!");
		while (randomball) {
			int strike = 0;
			int ball = 0;
			System.out.println("숫자를 입력하세요.");
			Scanner sc = new Scanner(System.in);
			
			for (int i = 0; i < user.length; i++) {
				try {
					ch = sc.nextInt();
					user[i] = ch;
					if (ch > 10 || ch < 0) {
						System.out.println("1 ~ 9의 숫자를 입력하세요.");
					}
				}
			
			}
				for ( int i = 0; i < com.length; i++) {
					for (int j = 0; j < user.length; j++) {
						if (com[i] == user[j] && i == j) {
							strike++;
						} else if (com[i] == user[j] && i != j) {
							ball++;
						}
						
					}
				}
				System.out.println(strike+"Strike"+ball+"Ball");
				if (strike == 3) {
					randomball = false;
				}
				counter++;
			}
			System.out.println("횟수: "+counter);
			System.out.println("게임 끝!");
		}
	}


