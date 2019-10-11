package com.yedam.exception;

public class ThrowsExample {
	public static void main(String[] args) {
		try {
		findClass();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("findClass() 호출 후");
		
	}
	public static void findClass() throws ClassNotFoundException {
		Class clazz = null;
		clazz = Class.forName("java.lang.String2");
		System.out.println(clazz.getName());
	}

}
