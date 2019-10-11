package classes;

public class Student {
	// 특성

	String name;
	String major;
	int studentNo;
	
	// 생성자
	Student() {
		
	}
	Student(String name){
		this.name = name;
	}
	
	Student(String name, String major) {
		this.name = name;
		this.major = major;
	}
	
	// 기능
	void study() {
		System.out.println("공부합니다.");

}
	
	void goToSchool() {
		System.out.println("학교 갑니다.");
		
	}

}