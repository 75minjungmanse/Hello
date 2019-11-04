package com.yedam.lambda;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	static int[] scores = { 92, 95, 87 };
	static int minOrMax(IntBinaryOperator oper) {
		int result = scores[0];
		for (int score : scores) {
			result = oper.applyAsInt(result, score);
		}
		return result;
	}
	
	public static void main(String[] args) {
		IntBinaryOperator oper = new IntBinaryOperator() {
			int result = 0;
			@Override
			public int applyAsInt(int a, int b) {
				result = (a >= b? a : b);
				return result;
			}
		};
		int result = minOrMax(oper);
		System.out.println("max: " + result);
		
		result = minOrMax((a, b) -> {
			int res = Integer.MAX_VALUE;
			res =  (a >= b? b : a);
			return res;
		});
		System.out.println("min: " + result);
	}

}
