package classes;

public class Sample {
	public static void main(String[] args) {
		int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		int[] moneyAr = new int[7];
		int price = 567580;
	
		
		int fiveMan = price/50000;
		int oneMan = price%50000/10000;
		int fiveChun = price%10000/5000;
		int oneChun = price%5000/1000;
		int fiveHun = price%1000/500;
		int oneHun = price%500/100;
		int fiveTen = price%100/50;
		int oneTen = price%50/10;
		
		System.out.println("5만 원권은 " + fiveMan);
		System.out.println("만 원권은 " + oneMan);
		System.out.println("오천원권은 " + fiveChun);
		System.out.println("천원권은 " + oneChun);
		System.out.println("오백원은 " + fiveHun);
		System.out.println("백원은 " + oneHun);
		System.out.println("오십원은 " + fiveTen);
		System.out.println("십원은 " + oneTen);
	}

}
