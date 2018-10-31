package assert_;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x= abs(-123.45);
		assert x>=0:"x must >= 0 but x="+x;
		System.out.println(x);
	}

	private static double abs(double d) {
		// TODO Auto-generated method stub
		return d>=0?d:-d;
	}

}
