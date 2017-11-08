package katas.test;
import static org.junit.Assert.*;

import org.junit.Test;

import katas.PythagoreanTriple;

public class PythagoreanTripleTest {

	@Test
	public void test() {
		 PythagoreanTriple pr = new PythagoreanTriple();
		 int [] p1={3,4,5};
		
		 int[] p2={3,5,7};
		 assertEquals(1,pr.pythagoreanTriple(p1));
		 assertEquals(0,pr.pythagoreanTriple(p2));

		 }

}
