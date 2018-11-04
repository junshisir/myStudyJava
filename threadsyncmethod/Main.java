package threadsyncmethod;
class Counter{
	int count=0;
	public synchronized void add(int n) {
		count+=n;
	}
	public synchronized void dec(int n) {
		count-=n;
	}
	public int get() {
		return count;
	}
}

class ADDthread extends Thread{
	Counter counter;
	public ADDthread(Counter counter) {
		this.counter=counter;
	}
	public void run() {
		for (int i = 0; i < Main.LOOP; i++) {
			counter.add(1);
		}
	}
}
class DECthread extends Thread{
	Counter counter;
	public DECthread(Counter counter) {
		this.counter=counter;
	}
	public void run() {
		for (int i = 0; i < Main.LOOP; i++) {
			counter.dec(1);
		}
	}
}
public class Main {

	final static int LOOP=10000;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		Counter counter=new Counter();
		Thread t1=new ADDthread(counter) ;
		Thread t2=new DECthread(counter);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(counter.get());
	}

}
