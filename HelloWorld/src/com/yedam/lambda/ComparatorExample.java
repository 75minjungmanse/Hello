package com.yedam.lambda;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Fruits {
	String name;
	int price;
	
	Fruits(String name, int price) {
		this.name = name;
		this.price = price;
	}
}
class ComparatorClass implements Comparator<Fruits> {
	@Override
	public int compare(Fruits o1, Fruits o2) {
		if (o1.price > o2.price)
			return 1;
		else if (o1.price == o2.price)
			return 0;
		else
			return -1;
	}
	
}
public class ComparatorExample {
	public static void main(String[] args) {
		TreeSet<Fruits> tSet = new TreeSet<>(new ComparatorClass());
		tSet.add(new Fruits("apple", 1000));
		tSet.add(new Fruits("melon", 3000));
		tSet.add(new Fruits("strawberry", 1200));
		tSet.add(new Fruits("peach", 2300));
		
		Iterator<Fruits> iter = tSet.iterator();
		while (iter.hasNext()) {
			Fruits fr = iter.next();
			System.out.println(fr.name + ", " + fr.price);
	}
	}
}
