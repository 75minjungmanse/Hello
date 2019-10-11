package com.mycompany.kmj;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("kim");
		p1.setAge(26);
		p1.setHeight(158.3);
		p1.setWeight(45.0);
		System.out.println("이름은: "+p1.getName()+" 나이는: "+p1.getAge()+" 키는: "
							+p1.getHeight()+" 몸무게는: "+p1.getWeight());
	}

}
