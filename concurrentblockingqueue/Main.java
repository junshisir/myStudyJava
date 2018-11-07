package concurrentblockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class workerthread2 extends Thread{
	BlockingQueue<String> taskqueue;
	public workerthread2(BlockingQueue<String> taskqueue) {
		this.taskqueue=taskqueue;
	}
	
	public void run() {
		while (!isInterrupted()) {
			String name;
			try {
				name=taskqueue.take();
			} catch (InterruptedException e) {
				// TODO: handle exception
				break;
			} 
			String result="hello,"+name+"!";
			System.out.println(result);
		}
	}
}
public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		BlockingQueue<String> taskqueue=new ArrayBlockingQueue<>(1000);
		workerthread2 worker=new workerthread2(taskqueue);
		worker.start();
		taskqueue.put("b");
		Thread.sleep(1000);
		taskqueue.put("a");
		Thread.sleep(1000);
		taskqueue.put("t");
		Thread.sleep(1000);
		worker.interrupt();
		worker.join();
		System.out.println("end");
	}

}
