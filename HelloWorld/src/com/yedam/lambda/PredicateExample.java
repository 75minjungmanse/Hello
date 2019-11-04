package com.yedam.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class HighStudent {
	String name;
	String sex;
	int score;
	
	public HighStudent(String name, String sex, int score) {
		super();
		this.name = name;
		this.sex = sex;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public String getSex() {
		return sex;
	}

	public int getScore() {
		return score;
	}
	

}


public class PredicateExample {
	static List<HighStudent> list = Arrays.asList(new HighStudent("스다", "남자", 80),
			new HighStudent("김민정", "여자", 95), new HighStudent("이다연", "여자", 88),
			new HighStudent("조선아", "여자", 83), new HighStudent("김준수", "남자", 77));
	
	static double avg(Predicate<HighStudent> pred) {
		boolean bool = false;
		int sum = 0;
		int cnt = 0;
		for (HighStudent student : list) {
		bool = pred.test(student);
		if (bool) {
			cnt++;
			sum += student.getScore();
		}
		}
		return (double) sum / cnt;
	}
	
	public static void main(String[] args) {
		Predicate<HighStudent> pred = new Predicate<HighStudent>() {
		@Override
		public boolean test(HighStudent t) {
			return t.getSex().equals("남자");
		}
	};
	double avg = avg(pred);
	System.out.println("남학생 평균: " + avg);
	
	avg = avg((t) -> {
		return t.getSex().equals("여자");
	});
	System.out.println("여학생 평균: " + avg);
	}
}
