package com.yedam.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<Member> memSet = new HashSet<>();
		
		memSet.add(new Member("홍길동", 30));
		memSet.add(new Member("김길동", 30));
		System.out.println("memSet의 객체 수: " + memSet.size());
		for (Member m : memSet) {
			System.out.println(m.name + "/" + m.age);
		}
		
		
		
		
		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("World");
		set.add("Nice");
		set.add("Java");
		set.add("World");
		System.out.println("객체 수: "+ set.size()); // 중복 허용 안 함
		
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("반복자 소진 후: ");
		iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("확장 for: ");
		for (String str : set) {
			System.out.println(str);
		}
	}
}
