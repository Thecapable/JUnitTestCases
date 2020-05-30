import org.junit.Test;

import junit.framework.TestCase;

public class testAddNum extends TestCase {

	@Test
	void testAddNum() {
		Methods jufNumbers = new Methods();
		int result = jufNumbers.addNum(100,200);
		assertEquals(300,result);
	}

}
