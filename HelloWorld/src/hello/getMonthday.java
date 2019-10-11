package hello;

public class getMonthday {
	public static void main(String[] args) {
		showCal(10);
		
		
		}
	
	
	public static void showCal(int mon) {
		String[] week = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
		int month = mon;
		int monthDay = getMonthday(month);
		int sDay = getStartday(month);
		System.out.println("          <<"+month+"월>>");
		for (String str : week) {
			System.out.print(" " + str);
		}
		System.out.println();

		for (int i = 1; i < sDay; i++) {
			System.out.printf("%4s", "");
		}
		for (int i = 1; i <= monthDay; i++) {
			System.out.printf("%4d", i);
			if ((sDay + i - 1) % 7 == 0)
				System.out.println(); }
	}

	public static int getStartday(int month) {
		int startDay = 0;
		if (month == 9) {
			startDay = 1;
		} else if (month == 10) {
			startDay = 3;
		} else if (month == 11) {
			startDay = 6;
		} else if (month == 9) {
			startDay = 5;
		}
		return startDay;
	}

	public static int getMonthday(int month) {
		int day = 0;
		if (month == 2) {
			day = 28;
		} else if (month <= 7 && month % 2 == 1) {
			day = 31;
		} else if (month >= 8 && month % 2 == 0) {
			day = 31;
		} else {
			day = 30;
		}
		return day;
	}
}
