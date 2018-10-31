package equalshashcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> list=Arrays.asList(new Person("ming",12), new Person("hong",15),new Person("jun",18));
		Map< Person,String> map=new HashMap<>();	
		for(Person p:list) {
			map.put(p,p.getName());
		}
		System.out.println(map.get(new Person("jun",18)));

	}

}
