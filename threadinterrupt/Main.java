package threadinterrupt;
class hellothread3 extends Thread{}
public class Main {
	volatile boolean running=true;
	//@Override
    public void run() {
		while (running) {

			System.out.println("hello");
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println("Interrupted");
				break;
			}
		}
			System.out.println("thread end");

	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		hellothread3 t=new hellothread3();
		t.start();
		Thread.sleep(1000);
		t.running=false;
		System.out.println("Main end");
	}

}
