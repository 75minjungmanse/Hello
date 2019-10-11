package com.yedam.generic;

public class Util {
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.setObj(t);
		return null;
	}
	
	public static<K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean bool1 = p1.getKey().equals(p2.getKey());
		boolean bool2 = p1.getValue().equals(p2.getValue());
		return bool1 && bool2;
	}
		
		
		
	static<K, V> boolean compareValue(Pair<K, V> a1, Pair<K, V> a2) {
		boolean bool3 = a1.getValue().equals(a2.getValue());
		return bool3;
		
	
	}
	
	public static <T extends Number> int compare(Double t1, Double t2) {
		double d1 = t1.doubleValue();
		double d2 = t2.doubleValue();
		return Double.compare(d1, d2);
	}

}
