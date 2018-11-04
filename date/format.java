package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class format {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Date now=new Date();
		
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(simpleDateFormat.format(now));
	}

}
