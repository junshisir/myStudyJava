package collection;


import java.util.ArrayList;
import java.util.List;

public class list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list=new ArrayList<>();
		//List<String> list=new LinkedList<>();
		list.add("apple");
		list.add("apple2");
		list.add("apple3");
		String[] ss=list.toArray(new String[list.size()]);
		for(String s:ss) {
			System.out.println(s);
		}
	}

}
