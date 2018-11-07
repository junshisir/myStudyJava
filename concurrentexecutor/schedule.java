package concurrentexecutor;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class hellotask implements Runnable{
	String name;
	public  hellotask(String name) {
		this.name=name;
	}
	public void run() {
		System.err.println("hell, "+name + "! it is"+LocalTime.now());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println("goodbye, "+name + "! it is"+LocalTime.now());
	}
}
public class schedule {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		ScheduledExecutorService executor=Executors.newScheduledThreadPool(3);
		executor.scheduleAtFixedRate(new hellotask("b"), 2, 5, TimeUnit.SECONDS);
		executor.scheduleWithFixedDelay(new hellotask("a"), 2, 3, TimeUnit.SECONDS);
	}

}
