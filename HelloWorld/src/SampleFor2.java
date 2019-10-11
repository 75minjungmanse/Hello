import java.util.Scanner;

public class SampleFor2 {
	public static void main(String[] args) {
		int money[] = new int[7];
		int money2[] = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
		int won = Integer.parseInt(args[0]);
		
		for(int i = 0; i < money.length; i++) {
			money[i] = won/money2[i];
			won =  money2[i];
			if(money[i] !=0);
			System.out.println(money2[i]+"원"+money[i]+"개");
			
		}
		
	
	}
}

