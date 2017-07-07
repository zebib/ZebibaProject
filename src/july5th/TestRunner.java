package july5th;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
		Result result=JUnitCore.runClasses(PrimeNTest.class,CreditCardJTest.class,StudentJuTest.class);
		
		for(Failure r:result.getFailures()) {
			System.out.println(r.toString());
		}
System.out.println(result.wasSuccessful());
	}

}
