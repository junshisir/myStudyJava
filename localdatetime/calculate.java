package localdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;

public class calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 获取当前本地时间
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);

		//+5days
		LocalDateTime ldt2=ldt.plusDays(5);
		System.out.println(ldt2);
		//-2hours
		LocalDateTime ldt3=ldt2.minusHours(2);
		System.out.println(ldt3);
		//获取当月第一天
		LocalDate firstday=LocalDate.now().withDayOfMonth(1);
		LocalDate firstday2=LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
		System.out.println(firstday.equals(firstday2));
		
		//获取当月最后一天
		LocalDate lastday=LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
		System.out.println(lastday);
		
		//获取当月第一个星期日
		LocalDate firstSunday=LocalDate.now().with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY));
		System.out.println(firstSunday);
		
		//判断两个日期哪个在前
		System.out.println(firstSunday.isBefore(LocalDate.now()));
		
		//两个日期相差年月日
		Period p=LocalDate.now().until(LocalDate.of(2050, 1, 1));
		System.out.println(p);
		//两个日期一共相差多少天
		System.out.println(LocalDate.of(2050, 1, 1).toEpochDay()-LocalDate.now().toEpochDay());
		
		
	}

}
