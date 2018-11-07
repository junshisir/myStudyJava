package concurrentcondition;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class TaskQueue{
	final Queue<String> queue=new LinkedList<>();
	
	final Lock lock=new ReentrantLock();
	final Condition notEmpty=lock.newCondition();
	
	public String getTask() throws InterruptedException{
		lock.lock();
		try {
			while (this.queue.isEmpty()) {
				notEmpty.await();
			}
			return queue.remove();
		} finally {
			lock.unlock();
		}
	}
	public void addTask(String name) {
		lock.lock();
		try {
			this.queue.add(name);
			notEmpty.signalAll();
		} finally {
			lock.unlock();
		}
	}
}

class workerthread extends Thread{
	TaskQueue taskQueue;
	public workerthread(TaskQueue taskQueue) {
		this.taskQueue=taskQueue;
	}
	
	public void run() {
		while (!isInterrupted()) {
			String name;
			try {
				name=taskQueue.getTask();
			} catch (InterruptedException e) {
				break;
			}
			String result="hello,"+name +"!";
			System.out.println(result);
		}
	}
	
}
public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		TaskQueue taskQueue=new TaskQueue();
		workerthread worker=new workerthread(taskQueue);
		worker.start();
		
		//add task
		
		taskQueue.addTask("b");
		Thread.sleep(1000);
		taskQueue.addTask("a");
		Thread.sleep(1000);
		taskQueue.addTask("t");
		Thread.sleep(1000);
		worker.interrupted();
		worker.join();
		
		System.out.println("end");
	}
	
	

}
