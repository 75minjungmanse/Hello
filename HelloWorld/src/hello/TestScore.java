package hello;

import java.util.Scanner;

public class TestScore {
	Scanner sc = new Scanner(System.in);
	Student[] st = new Student[10];

	public void score() {
		while(true) {
			System.out.println("----------------------------------------------------------------------------------------------------");
			System.out.println("1. 학생 성적 등록 | 2. 전체 학생 리스트 | 3. 학생 번호 조회 | 4. 전체 평균 점수 | 5. 총점 기준 석차 | 6. 프로그램 종료");
			System.out.println("----------------------------------------------------------------------------------------------------");
			int menu = sc.nextInt(); sc.nextLine();
			if (menu == 1) {
				newScore();
			} else if (menu == 2) {
				getstudentList();
			} else if (menu == 3) {
				getstudentNum();
			} else if (menu == 4) {
				gettotalAvg();
			} else if (menu == 5) {
				getRank();
			} else if (menu == 6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		System.out.println("프로그램 종료.");
		
	}
		
	


public void newScore() {
	System.out.println("< 학생 성적 등록 >");
	System.out.println("학생 번호 : ");
	int studentNo = sc.nextInt(); sc.nextLine();
	System.out.println("학생 이름 : ");
	String studentName = sc.nextLine();
	System.out.println("국어 점수 : ");
	int korScore = sc.nextInt();
	System.out.println("영어 점수 : ");
	int engScore = sc.nextInt();
	System.out.println("수학 점수 : ");
	int mathScore = sc.nextInt();
	Student student = new Student(studentNo, studentName, korScore, engScore, mathScore);
	for (int i = 0; i < st.length; i++) {
		if (st[i] == null) {
			st[i] = student;
			break;
		}
	}
	
}


public void getstudentList() {
	System.out.println("< 전체 학생 조회 >");
	for (int i = 0; i < st.length; i++) {
		if (st[i]!= null) {
			System.out.println("학생 번호: "+st[i].getStudentNo()+", 학생 이름: "+st[i].getStudentName()+", 국어: "+st[i].getKorScore()+", 영어: "+st[i].getEngScore()+", 수학: "+st[i].getMathScore());
		}
	}
	
}


public void getstudentNum() {
	int totalScore = 0;
	int avgScore = 0;
	
	System.out.println("< 학생 번호 조회 >");
	System.out.println("조회할 번호 입력: ");
	int studentNo = sc.nextInt();
	for (int i = 0; i < st.length; i++) {
		if (st[1]!= null && st[i].getStudentNo() == studentNo) {
			System.out.println("학생 번호: "+st[i].getStudentNo()+", 학생 이름: "+st[i].getStudentName()+", 국어: "+st[i].getKorScore()+", 영어: "+st[i].getEngScore()+", 수학: "+st[i].getMathScore()+", 총점: "+st[i].getTotalScore()+", 평균: "+st[i].getAvgScore());
			
			totalScore = st[i].getKorScore() + st[i].getEngScore() + st[i].getMathScore();
			avgScore = (st[i].getKorScore() + st[i].getEngScore() + st[i].getMathScore()) / 3;
		}
	}
	
}


public void gettotalAvg() {
	System.out.println("< 세 과목의 전체 평균 점수 >");
	System.out.println();
	
	
}


public void getRank() {
	System.out.println("< 총점 기준 석차 >");
	System.out.println("학생 번호: "+st[i].getStudentNo()+", 학생 이름: "+st[i].getStudentName()+", 총점: ");
	
}
}


