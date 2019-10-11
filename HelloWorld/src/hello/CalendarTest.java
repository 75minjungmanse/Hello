package hello;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("년도");
		int year = sc.nextInt();
		System.out.println("월");
		int month = sc.nextInt();
		getCal(year, month);

	}
	public static void getCal(int year, int month) {
		Calendar cal = Calendar.getInstance();
		int translatedMonth = month - 1;
		cal.set(year, translatedMonth, 1);
		String[] week = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
		int monthday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int sDay = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("          <<"+month+"월>>");
	
		for (String str : week) {
			System.out.print(" " + str);
		}
		System.out.println();

		for (int i = 1; i < sDay; i++) {
		
			System.out.printf("%4s", "");
		}
		for (int i = 1; i <= monthday; i++) {
			System.out.printf("%4d", i);
			if ((sDay + i - 1) % 7 == 0)
				System.out.println(); }
		}
		
	}


