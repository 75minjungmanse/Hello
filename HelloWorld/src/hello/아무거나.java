package hello;

public class 아무거나 {
	public static void main(String[] args) {
		//printStar(5);
		int[] ary = showArray(1, 2, 3, 4, 5);
		for(int i = 0; i < ary.length; i++) {
			System.out.println(ary[i]);
		}
	}
	
	public static int[] showArray(int...is arg) {
		
	}
	
	
	
	public static void printStar(int a) {
		for(int i = 0; i <= a; i++) {
			for(int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

} 


