package date;

import java.util.Date;

public class date2string {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Date now =new Date();
		//�Ե�ǰʧȥ��ӡ����ʱ��
		System.out.println(now.toString());
		System.out.println(now.toGMTString());
		System.out.println(now.toLocaleString());
		

	}

}
