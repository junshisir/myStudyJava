package junit;

import org.junit.Before;
import org.junit.Test;

public class expected {
	
	Calculator calc;
	@Before
	public void setUp() {
		calc=new Calculator();
	}
	
	@Test(expected=NumberFormatException.class)
	public void testExpected() {
		calc.calculaotr(" ");
	}

}
