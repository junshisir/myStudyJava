package threadmulti;

class hellothread extends Thread{
	String name;
	public hellothread (String name) {
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
				e.printStackTrace();
			}
		}
	}
}
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Thread t1=new hellothread("bob");
		Thread t2=new hellothread("bobbbbb");
		t1.start();
		t2.start();
		for (int i = 0; i < 3; i++) {
			System.out.println("Main!");
			Thread.sleep(1000);
		}
	}

}
