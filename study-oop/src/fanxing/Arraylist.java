package fanxing;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> strList=new ArrayList<String>();
		strList.add("abc");
		strList.add("xyz");
		String first=strList.get(0);
		System.out.println(first);
		
		String[] strs= {"apple","pear","orange"};
		Arrays.sort(strs);
		System.out.println(Arrays.toString(strs));
	}

}
