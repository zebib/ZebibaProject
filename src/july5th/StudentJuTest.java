package july5th;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentJuTest {

	@Test
	public void getGradetest() {
		StudentJu S=new StudentJu(12,"mmm",52);
		String ex=S.getGrade(70);
		assertEquals(ex,"F");
		
	}

}
