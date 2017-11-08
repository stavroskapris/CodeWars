package katas.test;
import static org.junit.Assert.*;
import org.junit.Test;

import katas.FindOutlier;

public class FindOutlierTest {
	@Test
	public void testExample() {
		int[] exampleTest1 = { 160, 3, 1719, 19, 11, 13, -21 };
		
		
		int[] exampleTest2 = { 206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781 };
		
	    assertEquals(160, FindOutlier.find(exampleTest1));
	
		assertEquals(206847684, FindOutlier.find(exampleTest2));
		
		
	}
}
