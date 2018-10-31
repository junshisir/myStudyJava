package chongzai;

public class Person {
	private String name;

	public void setName(String name) {
		this.name = name;
	}
	
	public void setName(String firstname,String lastname) {
		this.name = firstname + " " +lastname;
	}
	public String getName() {
		return name;
	}
}
