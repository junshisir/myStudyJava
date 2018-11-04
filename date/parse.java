package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class parse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//按系统locale解析日期时间
		String s1="2018-11-05 17:56:23";
		Date date1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(s1);
		System.out.println(date1);
		//解析MMM时默认按照系统locale
		String s2="Nov/20/2016 17:56:23";
		Date date2=new SimpleDateFormat("MMM/dd/yyyy HH:mm:ss",Locale.US).parse(s2);
		System.out.println(date2);
		//按iso 8601标准格式解析
		String iso="2018-11-05T17:56:23";
		Date date3=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").parse(iso);
		System.out.println(date3);
		

	}

}
