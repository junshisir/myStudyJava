package localdatetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class formate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ʽ��
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		System.out.println(dtf.format(LocalDateTime.now()));

		//��ISO��ʽ����
		LocalDateTime dt1=LocalDateTime.parse("2018-11-04T15:16:17");
		System.out.println(dt1);
		
		//����ָ����ʽ����
		LocalDateTime dt2=LocalDateTime.parse("2018-11-04 15:16:17", dtf);
		System.out.println(dt2);
	}

}
