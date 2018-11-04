package threadsync;

class Addthread extends Thread{
	public void run() {
		for (int i = 0; i < Main.LOOP; i++) {
			synchronized (Main.LOCK) {
				Main.count +=1;
			}

		}
	}
}
class Decthread extends Thread{
	public void run() {
		for (int i = 0; i <Main.LOOP; i++) {
			synchronized (Main.LOCK) {
				Main.count -=1;
			}
		
		}
		
	}
}
public class Main {
	final static int LOOP=10000;
	public static int count=0;

	public static final Object LOCK =new Object();
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Thread t1=new Addthread();
		Thread t2=new Decthread();
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(count);
	}

}
