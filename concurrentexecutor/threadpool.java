package concurrentexecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class printtask implements Runnable{
	String name;
	public  printtask(String name) {
		this.name=name;
		
	}
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.err.println("hello"+name+"!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
}
public class threadpool {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		ExecutorService executor=Executors.newFixedThreadPool(3);
		executor.submit(new printtask("b"));
		executor.submit(new printtask("a"));
		executor.submit(new printtask("t"));
		executor.submit(new printtask("j"));

		Thread.sleep(1000);
		executor.shutdown();
	}

}
