package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculaotr() {
		assertEquals(3, new Calculator().calculaotr("1+2"));
		assertEquals(4, new Calculator().calculaotr("2+2"));
	}
	@Test
	public void testCalculate() {
		assertEquals(3, new Calculator().calculaotr("1 + 2"));
	}

}
