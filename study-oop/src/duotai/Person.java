package duotai;

public class Person {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void run(){
		System.out.println(name + "is running");
	}

	public Person(String name) {
		this.name=name;
	}
	public String hello () {
		return "hello" + this.name;
		
	}
}
