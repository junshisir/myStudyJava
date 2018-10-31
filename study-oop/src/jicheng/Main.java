package jicheng;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person("xiao minh");
		Student s=new Student("xiao hong");
		Person ps=s;
		if (p instanceof Student) {
			Student s2= (Student)ps;
			s2.run();

		}
		
	}

}
