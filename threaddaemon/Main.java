package threaddaemon;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
class TimerThread extends Thread{
	@Override
	public void run() {
		while (true) {
			System.out.println(LocalTime.now());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				break;
			}
		}
		
	}
}
public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		System.out.println("main start");
		TimerThread t=new TimerThread();
		t.setDaemon(true);
		t.start();
		Thread.sleep(5000);
		System.out.println("main end");

	}

}
