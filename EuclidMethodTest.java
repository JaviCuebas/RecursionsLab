import static org.junit.Assert.*;

import org.junit.Test;

public class EuclidMethodTest {

	@Test

	public void testGCDDirecVariablePassing() {

		assertNotEquals("It cannot return p.",EuclidMethod.gcd(1048, 402),1048);

		assertNotEquals("It cannot return q.",EuclidMethod.gcd(1048, 402),402);

		assertNotEquals("You are returning 0.",EuclidMethod.gcd(1048, 402),0);

	}

	@Test

	public void testGCD() {

		assertEquals("It is not the correct result",EuclidMethod.gcd(1440,408),24);

		assertEquals("It is not the correct result",EuclidMethod.gcd(100,10),10);

		assertEquals("It is not the correct result",EuclidMethod.gcd(4096,512),512);

		assertEquals("It is not the correct result",EuclidMethod.gcd(3567,256),1);

		assertEquals("It is not the correct result",EuclidMethod.gcd(1440,1440),1440);

	}

}