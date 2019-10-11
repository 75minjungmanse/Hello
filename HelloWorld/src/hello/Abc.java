package hello;

public class Abc {
	public static void main(String[] args) {
		char Alp = 'A';
		int num = Alp;
		for (int i = 0; i < 26; i++)
		System.out.println(Alp++ +","+ num++); {
			
		}
		String[] strAry = { "Hello", "World", "Good", "Morning" };
		String[] copyAry = new String[strAry.length];
		for (int i = 0; i < strAry.length; i++) {
			copyAry[i] = strAry[i];
		}
		for (String str : strAry) {
			System.out.println(str);
		}
		System.arraycopy(strAry, 0, copyAry, 0, 2);
		for (String str : copyAry) {
			System.out.println(str);
		}
	}

}
