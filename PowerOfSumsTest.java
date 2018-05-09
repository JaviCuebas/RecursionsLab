import static org.junit.Assert.*;

import org.junit.Test;

public class PowerOfSumsTest {

	@Test
	public void testPowerOfSumsDirecVariablePassing() {
		assertNotEquals("It cannot return n.",PowerOfSums.powerSum(6),6);
		assertNotEquals("You are returning 0.",PowerOfSums.powerSum(6),0);
	}
	@Test
	public void testPowerOfSums() {
		assertEquals("It is not the correct result",PowerOfSums.powerSum(2),1);
		assertEquals("It is not the correct result",PowerOfSums.powerSum(5),3);
		assertEquals("It is not the correct result",PowerOfSums.powerSum(9),8);
		assertEquals("It is not the correct result",PowerOfSums.powerSum(13),18);
		assertEquals("It is not the correct result",PowerOfSums.powerSum(20),64);
	}

}