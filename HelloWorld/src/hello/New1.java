package hello;

public class New1 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		int j = 10;
		for (int x=i; i<=j; i++) {
			if(i%2==0)
			sum += i;
		}
		System.out.println(i+"~"+j+"합은"+sum);
	}
}
