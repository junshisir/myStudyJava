package yichang;

import java.io.UnsupportedEncodingException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test("UTF-8");
		test("ABC");

	}
	static void test(String encoding) {
		System.out.println("Test encoding "+encoding+"...");
		try {
			"test".getBytes(encoding);
			System.out.println("ok");
		} catch (UnsupportedEncodingException e) {
			// TODO: handle exception
			System.out.println("failed");
			System.out.println(e);
		}
	}

}
