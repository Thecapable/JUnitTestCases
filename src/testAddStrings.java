import org.junit.Test;

import junit.framework.TestCase;

public class testAddStrings extends TestCase {
	@Test
	public void testAddStrings() {
		
		Methods jufStrings = new Methods();
		String result = jufStrings.addString("Hello","World");
		assertEquals("HelloWorld",result);
		
	}
	

}

