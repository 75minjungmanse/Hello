package hello;

public class WhileExample {
	public static void main(String[] args) {
		int i = 1;
		while(true) {
			if (i++ <= 5)
				continue;
			System.out.println(3+"*"+i+"="+3*i);
			if(i == 9)
				break;
//			i++;
		}
	}

}
