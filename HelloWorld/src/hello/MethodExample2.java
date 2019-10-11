package hello;

import java.util.Scanner;

public class MethodExample2 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		
		while(run) {
			menu();
			
			
			int selectNo = sc.nextInt();
			
			if(selectNo == 1) {
				System.out.print("학생 수> ");
				studentNum = sc.nextInt();
				scores = new int[studentNum];
				// 학생의 수만큼 배열 생성
				
			} else if(selectNo == 2) {
				menu2();
				for(int i = 0; i < scores.length; i++) {
					System.out.println("scores["+i+"]> ");
					scores[i] = sc.nextInt();
				}
				// 생성된 배열 점수 입력
				
			} else if(selectNo == 3) {
				for(int i = 0; i < scores.length; i++) {
					System.out.println("scores["+i+"]: " + scores[i]);
				}
				// 배열 입력된 전체 조회
				
			} else if(selectNo == 4) {
				int maxValue = 0, sum = 0;
				double avg = 0.0;
				for(int i = 0; i < scores.length; i++) {
					maxValue = (maxValue > scores[i] ? maxValue : scores[i]);
					sum += scores[i];
				}
				avg = (double)sum / scores.length;
				// 큰값, 평균
				System.out.println("최대값은: " +maxValue);
				System.out.printf("평균은: " +avg);
				System.out.println();
				
			} else if(selectNo == 5) {
				// 종료
			  run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	public static void menu() {
		
		System.out.println("------------------------------------------------------");
		System.out.println("1. 학생수 | 2. 점수 입력 | 3. 점수 리스트 | 4. 분석 | 5. 종료");
		System.out.println("------------------------------------------------------");
		System.out.print("선택> ");
	}
	
	
}
