package katas.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import katas.WhichAreIn;

public class WhichAreInTest {
	WhichAreIn wa = new WhichAreIn();

	@Test
	public void test1() {
		String[] a1 = { "arp", "live", "strong" };
		String[] a2 = { "lively", "alive", "harp", "sharp", "armstrong" };
		String res[] = { "arp", "live", "strong" };
		assertArrayEquals(res, wa.WhichAre(a1, a2));
	}
}