package localdatetime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class localdatetime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//��ȡ��ǰ����ʱ��
		LocalDateTime d1=LocalDateTime.now();
		System.out.println(d1);
		System.out.println("week="+d1.getDayOfWeek().getValue());
		//ע��11��=11
		LocalDate d2=LocalDate.of(2018, 11, 04);
		System.out.println(d2);
		
		//��ȡ��ǰʱ��
		LocalTime t1=LocalTime.now();
		System.out.println(t1);
		LocalTime t2=LocalTime.of(15, 16,17);
		System.out.println(t2);
		
		//��ȡ��ǰ����ʱ�������
		LocalDateTime dt1=LocalDateTime.now();
		System.out.println(dt1);
		
		//��localdate ��localtime  ���
		LocalDateTime dt2=LocalDateTime.of(d2, t2);
		System.out.println(dt2);
		
	}

}
