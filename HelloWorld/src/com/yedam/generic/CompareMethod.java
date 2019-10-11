package com.yedam.generic;

public class CompareMethod {
	public static void main(String[] args) {
		Pair<String, Integer> p1 = new Pair<>("apple", 10);
		Pair<String, Integer> p2 = new Pair<>("apple", 10);
		boolean result = Util.compare(p1, p2);
		if (result)
			System.out.println("두 객체가 논리적으로 동일");
		else
			System.out.println("두 객체가 논리적으로 동일하지 않음");
	
	
	Pair<String, Integer> p3 = new Pair<>("kmj1", 26);
	Pair<String, Integer> p4 = new Pair<>("kmj1", 26);
	result = Util.compare(p3, p4);
	if (result)
		System.out.println("두 객체가 논리적으로 동일");
	else
		System.out.println("두 객체가 논리적으로 동일하지 않음");
	
	
	
	Pair<String, Integer> a1 = new Pair<>("orange", 10);
	Pair<String, Integer> a2 = new Pair<>("apple", 10);
	result = Util.compareValue(a1, a2);
	if (result)
		System.out.println("두 객체가 논리적으로 동일");
	else
		System.out.println("두 객체가 논리적으로 동일하지 않음");
	
	
	
	
	Integer intV1 = Util.compare(12.3, 2.3);
	System.out.println(intV1);
	
	
	
	
	

}
}
