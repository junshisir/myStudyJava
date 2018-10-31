package junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
public class testbefor {
	Calculator calc;
	@Before
	public void setUp() {
		calc=new Calculator();
	}
	
	@Test
	public void testCalculate() {
		int r=calc.calculaotr("1+2");
		assertEquals(3, r);
	}

}
