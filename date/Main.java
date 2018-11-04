package date;

import java.util.Date;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//获取当前时间戳
		System.out.println(System.currentTimeMillis());
		//获取当前时间
		Date now =new Date();
		System.out.println(now);
		
		//把Date转化为long
		long t=now.getTime();
		System.out.println(t);
		//把long 转化为date
		System.out.println(new Date(t));
		
	}

}
