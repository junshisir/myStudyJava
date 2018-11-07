package concrrentatomic;

import java.util.concurrent.atomic.AtomicInteger;

class  counter3{
	private AtomicInteger value=new AtomicInteger(0);
	public int add(int m) {
		return this.value.addAndGet(m);
	}
	public int dec(int m) {
		return this.value.addAndGet(-m);
	}
	public int get() {
		return this.value.get();
	}
}
public class Main {

	final static int LOOP=100;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		counter3 counter3=new counter3();
		Thread t1=new Thread() {
			public void run() {
				for (int i = 0; i <LOOP; i++) {
					counter3.add(1);
					
				}
			}
		};
		Thread t2=new Thread() {
			public void run() {
				for (int i = 0; i <LOOP; i++) {
					counter3.dec(1);
					
				}
			}
		};
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(counter3.get());
	}

}
