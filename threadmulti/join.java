package threadmulti;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class hellothread1 extends Thread{
	String name;
	public hellothread1 (String name) {
		this.name=name;
		
	}
	@Override
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println("hello,"+name+"!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("goodbye,"+name+"!");
			}
		}
	}
}
public class join {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		List<Thread> threads=new ArrayList<>();
		for (String name:Arrays.asList("b","a","t")) {
			threads.add(new hellothread1(name));
		}
		System.out.println("start");
		for (Thread t : threads) {
			t.start();
			t.join();
		}
		System.out.println("end");
	}

}
