package hello;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println("년: "+cal.get(Calendar.YEAR));
		System.out.println("월: "+cal.get(Calendar.MONTH)); // 0: 1월
		System.out.println("요일: "+cal.get(Calendar.DAY_OF_WEEK));
		System.out.println("일: "+cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("==========================");
		cal.set(2019, 0, 1);
		System.out.println("년: "+cal.get(Calendar.YEAR));
		System.out.println("월: "+cal.get(Calendar.MONTH));
		System.out.println("요일: "+cal.get(Calendar.DAY_OF_WEEK));
		System.out.println("일: "+cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("전체 일수: "+cal.getActualMaximum(Calendar.DAY_OF_MONTH));
	}

}
