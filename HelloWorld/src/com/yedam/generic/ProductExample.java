package com.yedam.generic;

public class ProductExample {
	Product<String, Integer> prd1 = new Product<>();
	prd1.setKind("책상", 10);
	prd1.setModel(10);
	System.out.println(prd1.getKing()+", "+prd1.getModel());
	
	Product<Tv, String> prd2 = new Product<>();
	prd2.setKind(new Tv());
	prd2.setModel("스마트Tv");
	Tv tv = prd2.getKind();
	String str = prd2.getModel();

}
