package pi;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.Calculator;

public class PITest {

	PI pi;
	@Before
	public void setUp() {
		pi=new PI();
	}
	@Test(timeout=5000)
	public void test() {
		double r=pi.calculate(10000);
		assertEquals(3.1416, r,0.0001);
	}

}
