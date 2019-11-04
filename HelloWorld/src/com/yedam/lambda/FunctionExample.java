package com.yedam.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

class Student {
	String name;
	int engScore;
	int mathScore;
	
	public Student(String name, int engScore, int mathScore) {
		super();
		this.name = name;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}
	public String getName() {
		return name;
	}
	
	public int getEngScore() {
		return engScore;
	}

	public int getMathScore() {
		return mathScore;
	}
}


public class FunctionExample {
	static List<Student> list = Arrays.asList(new Student("kim", 90, 89), new Student("hwang", 95, 91));

	public static void printString(Function<Student, String> func) {
		for (Student student : list) {
			System.out.println(func.apply(student));
		}
	}
	
	public static void printInt(ToIntFunction<Student> fun) {
		for (Student student : list) {
			System.out.println(fun.applyAsInt(student));
		}
	}
	
	
	public static double avg(ToIntFunction<Student> func) {
		int sum = 0, cnt = 0;
		for (Student student : list) {
			cnt++;
			sum += func.applyAsInt(student);
		}
		return (double) sum/cnt;
	}
	
	
	
	
	public static void main(String[] args) {
		printString((t) -> {return t.getName();
		});
		ToIntFunction<Student> func = new ToIntFunction<Student>() {

			@Override
			public int applyAsInt(Student value) {
				return value.getEngScore();
			}
			
		};
		System.out.println("영어 점수");
		printInt(func);
		System.out.println("수학 점수");
		printInt((s) -> {
			return s.getMathScore();
		});
		
		System.out.println("영어 평균");
		ToIntFunction<Student> func2 = new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student value) {
				return value.getEngScore();
			}
			
		};
		double result = avg(func2);
		System.out.println("result : " + result);
		
		System.out.println("수학 평균");
		ToIntFunction<Student> func3 = (value) -> {
			return value.getMathScore();
		};
		double result2 = avg((value) -> {
			return value.getMathScore();
		});
		System.out.println("result2 : " + result2);
		
	}
}
