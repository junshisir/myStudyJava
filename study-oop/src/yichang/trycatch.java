package yichang;

public class trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process("abc");

	}
	static void process(String s) {
		try {
			int n=Integer.parseInt(s);
			int m=100/n;
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println("bad input");
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println("bad input");
		}finally {
			System.out.println("end");
		}
	}

}
