package duotai;

import org.w3c.dom.html.HTMLIsIndexElement;

public class Student extends Person {
	public Student(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	private int score;

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public void run(){
		System.out.println("student" + getName()+"is running");
	}


}
