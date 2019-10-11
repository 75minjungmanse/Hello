package hello;

public class 적정몸무게 {
	public static void main(String[] args) {
		
	double a = 158.3;
	double goodWeight = (a - 100) * 0.9;
	System.out.println("적정 몸무게는: " +goodWeight+ "입니다.");
	}
	public static double weight(double a) {
		return (a - 100) * 0.9;
		
	}
		
	public static int sum2(int[] ary) {
		int sum = 0;
		for (int i = 0; i < ary.length; i++); {
			sum += ary[i];
		}
		return sum;
		
	}
		
	
	}

}
