package junit;

import java.util.Arrays;

public class Calculator {
	public int calculaotr(String expression) {
		String[] ss=expression.split("\\+");
		System.out.println(expression+"=>"+Arrays.toString(ss));
		int sum =0;
		for(String s:ss) {
			sum=sum+Integer.parseInt(s.trim());
		}
		return sum;
	}

	public static void main(String[] args) {
		Calculator c=new Calculator();
		int r=c.calculaotr("1+2+3");
		System.out.println(r);
		
	}
}

