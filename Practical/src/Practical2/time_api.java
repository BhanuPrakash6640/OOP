package Practical2;

import java.util.Calendar;

public class time_api {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal=Calendar.getInstance();
		int day=cal.get(Calendar.DAY_OF_MONTH);
		int week=cal.get(Calendar.WEEK_OF_YEAR);
		int month=cal.get(Calendar.MONTH);
		int year=cal.get(Calendar.YEAR);
		System.out.println("day: "+day+" week:"+week+" month:"+month+" year:"+year);
		

	}

}