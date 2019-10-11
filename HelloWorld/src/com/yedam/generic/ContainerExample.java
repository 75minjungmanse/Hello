package com.yedam.generic;

public class ContainerExample {
	public static void main(String[] args) {
		Container<String> con = new Container<String>();
		con.setObj(new String("apple"));
		String str = con.getObj();
		
		Container<Integer> intCon = new Container<Integer>();
		intCon.setObj(10);
		int intValue = intCon.getObj();
		
		System.out.println(str);
		System.out.println(intCon);
	}

}
