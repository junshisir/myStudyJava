package equals;

import java.util.Objects;

public class Person {
	private final String name;
	private final int age;
	public Person (String name,int age) {
		this.name=name;
		this.age=age;
		
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
		
	}
	@Override
	public String toString () {
		return "(Person:"+name+","+age+")";
	}
	public boolean equals(Object o) {
		if(this==o) {
			return true;
		}
		if (o instanceof Person) {
			Person p=(Person) o;
			return Objects.equals(p.name,this.name)&&p.age==this.age;
			
		}
		return false;
		
	}

}
