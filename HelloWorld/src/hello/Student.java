package hello;

public class Student {
	private int studentNo;
	private String studentName;
	private int korScore;
	private int engScore;
	private int mathScore;
	private int totalScore;
	private int avgScore;
	
	
	public Student(int studentNo, String studentName, int korScore, int engScore, int mathScore) {
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
		this.totalScore = totalScore;
		this.avgScore = avgScore;
	}


	public int getStudentNo() {
		return studentNo;
	}


	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public int getKorScore() {
		return korScore;
	}


	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}


	public int getEngScore() {
		return engScore;
	}


	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}


	public int getMathScore() {
		return mathScore;
	}


	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}


	public int getTotalScore() {
		return totalScore;
	}


	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}


	public int getAvgScore() {
		return avgScore;
	}


	public void setAvgScore(int avgScore) {
		this.avgScore = avgScore;
	}
	
	
	
	



	
}