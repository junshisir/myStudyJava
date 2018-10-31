package yichang;

public class throwss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		process1();
	}
	static void process1() {
		try {
			process2();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			System.out.println("end");
		}
	}
	static void process2() {
		process3();
	}
	static void process3() {
		Integer.parseInt(null);
	}

}
