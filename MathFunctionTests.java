import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MathFunctionTests {
	Functions functions;
	@BeforeEach
	public void setUp() throws Exception {
		functions = new Functions();
	}
	
	@Test
	public void testSumFrom1toN_Nis0() {
		assertEquals(IllegalArgumentException.class, functions.SumFrom1toN(0));
	}

	@Test
	public void testSumFrom1toN_Nis1() {
		assertEquals(1, functions.SumFrom1toN(1));
	}
	
	@Test
	public void testSumFrom1toN_Nis2() {
		assertEquals(3, functions.SumFrom1toN(2));
	}
	
	@Test
	public void testSumFrom1toN_Nis1000() {
		assertEquals(500500, functions.SumFrom1toN(1000));
	}

	@Test
	public void testExponent_Base1Exponent1() {
		assertEquals(1, functions.Exponent(1, 1));
	}
	
	@Test
	public void testExponent_Base2Exponent2() {
		assertEquals(4, functions.Exponent(2, 2));
	}

}
