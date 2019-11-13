

import junit.framework.TestCase;
import xyz.add;
import xyz.division;
import xyz.multiplication;
import xyz.subtract;

public class JTest extends TestCase {
	multiplication mult = new multiplication();
	add addi = new add();
	subtract sub = new subtract();
	division divi = new division();
	
	public void testmult() {
		assertEquals(10, mult.multiply(2,5));
	};
	public void testsub() {
		assertEquals(10, sub.subtract(15,5));
	};
	public void testadd() {
		assertEquals(10, addi.addition(5,5));
	};
	
	public void testdiv() {
		assertEquals(5, divi.div(10,2));
	};
	
}
