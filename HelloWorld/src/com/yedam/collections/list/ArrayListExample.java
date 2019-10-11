package com.yedam.collections.list;


import java.util.ArrayList;
import java.util.List;


public class ArrayListExample {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("World");
		list.add("Nice");
		list.add("java");
		list.add("2, Insert");
		int size = list.size();
		System.out.println("객체 수는"+size);
		for (int i = 0; i < size; i++ ) {
			System.out.println(list.get(i));
		}
		String returnVal = list.remove(2);
		System.out.println(returnVal);
		for (String str : list) {
			System.out.println(str);
		}
	}


}
