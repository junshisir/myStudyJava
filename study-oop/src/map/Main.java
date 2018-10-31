package map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> list=Arrays.asList(new Person("ming",12), new Person("hong",15),new Person("jun",18));
		Map<String, Person> map=new HashMap<>();	
		for(Person p:list) {
			map.put(p.getName(), p);
		}
		for(String key:map.keySet()) {
			System.out.println(key+"->"+map.get(key));
		}
		for(Map.Entry<String, Person>entry:map.entrySet()) {
			System.out.println(entry.getKey()+"->"+entry.getValue());
		};
		System.out.println(map.get("jun"));
		System.out.println(map.get("Mark"));

	}

}
