package equalshashcode;

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
	@Override
	public boolean equals(Object obj) {
		if (obj==this) {
			return true;
		}
		if (obj instanceof Person) {
			Person p=(Person)obj;
			return Objects.equals(this.name, p.name)&& this.age==p.age;
		}
		return false;
	}
	@Override
	public int hashCode() {
		// 
		return Objects.hash(this.name,this.age);
	}
	

	
}
