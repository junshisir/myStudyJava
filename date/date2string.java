package date;

import java.util.Date;

public class date2string {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Date now =new Date();
		//以当前失去打印日期时间
		System.out.println(now.toString());
		System.out.println(now.toGMTString());
		System.out.println(now.toLocaleString());
		

	}

}
