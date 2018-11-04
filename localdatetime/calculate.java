package localdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;

public class calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ��ȡ��ǰ����ʱ��
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);

		//+5days
		LocalDateTime ldt2=ldt.plusDays(5);
		System.out.println(ldt2);
		//-2hours
		LocalDateTime ldt3=ldt2.minusHours(2);
		System.out.println(ldt3);
		//��ȡ���µ�һ��
		LocalDate firstday=LocalDate.now().withDayOfMonth(1);
		LocalDate firstday2=LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
		System.out.println(firstday.equals(firstday2));
		
		//��ȡ�������һ��
		LocalDate lastday=LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
		System.out.println(lastday);
		
		//��ȡ���µ�һ��������
		LocalDate firstSunday=LocalDate.now().with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY));
		System.out.println(firstSunday);
		
		//�ж����������ĸ���ǰ
		System.out.println(firstSunday.isBefore(LocalDate.now()));
		
		//�����������������
		Period p=LocalDate.now().until(LocalDate.of(2050, 1, 1));
		System.out.println(p);
		//��������һ����������
		System.out.println(LocalDate.of(2050, 1, 1).toEpochDay()-LocalDate.now().toEpochDay());
		
		
	}

}
