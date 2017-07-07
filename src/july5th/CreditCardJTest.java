package july5th;

import static org.junit.Assert.*;

import org.junit.Test;

public class CreditCardJTest {

	@Test
	public void test() {
		CreditCardJ C=new CreditCardJ(8);
		int ex=C.getReward(27);
		assertEquals(27,ex);
	}

}
