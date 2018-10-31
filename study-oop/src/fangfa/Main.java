package fangfa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person ming=new Person();
		ming.setName("xiaoming");;
		ming.setAge(14);;
		
		Person hong= new Person();
		hong.setName("xiaohong");
		hong.setAge(12);
		
		System.out.println(ming.getAge());
		System.out.println(ming.getName());
		
		System.out.println(hong.getAge());
		System.out.println(hong.getName());

	}

}
