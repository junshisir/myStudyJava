package localdatetime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class localdatetime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//获取当前本地时间
		LocalDateTime d1=LocalDateTime.now();
		System.out.println(d1);
		System.out.println("week="+d1.getDayOfWeek().getValue());
		//注意11月=11
		LocalDate d2=LocalDate.of(2018, 11, 04);
		System.out.println(d2);
		
		//获取当前时间
		LocalTime t1=LocalTime.now();
		System.out.println(t1);
		LocalTime t2=LocalTime.of(15, 16,17);
		System.out.println(t2);
		
		//获取当前本地时间和日期
		LocalDateTime dt1=LocalDateTime.now();
		System.out.println(dt1);
		
		//用localdate 和localtime  组合
		LocalDateTime dt2=LocalDateTime.of(d2, t2);
		System.out.println(dt2);
		
	}

}
