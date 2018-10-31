package set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list1=Arrays.asList("pear","apple","banana","orange","pear");
		List<String> list2=removeDuplicate(list1);
		System.out.println(list2);
	}

	static List<String> removeDuplicate(List<String> list){
		Set<String> set=new HashSet<>(list);
		return new ArrayList<String>(set);
	}
}
