package junit.tutorial.ex01.e04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberUtilsTest {

	@Test
	void test() {
		boolean a=NumberUtils.isEven(10);
		assertTrue(a,"true");
	
}
	void test1() {
		boolean a=NumberUtils.isEven(7);
		assertFalse(a,"false");
	}
}
