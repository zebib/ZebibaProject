 package july5th;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeNTest {

	@Test
	public void test() {
		PrimeN n=new PrimeN(7,8);
		int ex=n.getPrimenn(9, 2);
		assertEquals(ex,9);
		
	
	}

}
