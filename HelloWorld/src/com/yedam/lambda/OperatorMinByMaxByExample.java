package com.yedam.lambda;

import java.util.Comparator;
import java.util.function.BinaryOperator;

class Fruit {
	String name;
	int price;
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
}
public class OperatorMinByMaxByExample {
	public static void main(String[] args) {
		BinaryOperator<Fruit> bo;
		Fruit fruit;
		Comparator<Fruit> com = new Comparator<Fruit>() {

			@Override
			public int compare(Fruit o1, Fruit o2) {
				int result = 0;
				if (o1.price > o2.price)
					result = 1;
				else if (o1.price == o2.price)
					result = 0;
				else
					result = -1;
				return result;
			}
		};
		
		
		  bo = BinaryOperator.maxBy((o1, o2) -> { // 밑의 식을 람다식으로 나타낸 것
	         return Integer.compare(o1.price, o2.price);
	         
	      });
	      fruit = bo.apply(new Fruit("banana", 2000), new Fruit("apple", 1000));
	      System.out.println(fruit.name + "," +fruit.price);
	      
	      
	      
		bo = BinaryOperator.maxBy(com); // -> 바나나
		bo = BinaryOperator.minBy(com); // -> 애플
		fruit = bo.apply(new Fruit("apple", 1000), new Fruit("banana", 2000));
		System.out.println(fruit.name + ", " + fruit.price);
		
	}

}
