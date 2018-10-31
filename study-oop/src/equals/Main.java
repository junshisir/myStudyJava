package equals;

import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> list=new ArrayList<>();
		list.add(new Person("ming",12));
		list.add(new Person("hong",15));
		list.add(new Person("jun",18));
		System.out.println(list);
		System.out.println(list.contains(new Person("jun",18)));

	}

}
