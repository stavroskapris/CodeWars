package katas.test;

import static org.junit.Assert.*;

import org.junit.Test;

import katas.PangramChecker;

public class PangramChekerTest {
	   @Test
	    public void test1() {
	      String pangram1 = "The quick brown fox jumps over the lazy dog.";
	      PangramChecker pc = new PangramChecker();
	      assertEquals(true, pc.check(pangram1));
	    }
	    @Test
	    public void test2() {
	      String pangram2 = "This is a test just a test which should fail";
	      PangramChecker pc = new PangramChecker();
	      assertEquals(false, pc.check(pangram2));
	    }

}
