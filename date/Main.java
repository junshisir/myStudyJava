package date;

import java.util.Date;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//��ȡ��ǰʱ���
		System.out.println(System.currentTimeMillis());
		//��ȡ��ǰʱ��
		Date now =new Date();
		System.out.println(now);
		
		//��Dateת��Ϊlong
		long t=now.getTime();
		System.out.println(t);
		//��long ת��Ϊdate
		System.out.println(new Date(t));
		
	}

}
