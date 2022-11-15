package junit.tutorial.ex01.e01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringUtilsTest {

	@Test
	void testTostring() {
	
		String results=StringUtils.toSnakeCase("aaa");
		assertEquals("aaa",results,"エラー");
	}
	@Test
	void testTostring2() {
	
		String results=StringUtils.toSnakeCase("hello_world");
		assertEquals("hello_world",results,"エラー");
	}
	@Test
	void testTostring3() {
	
		String results=StringUtils.toSnakeCase("practice_junit");
		assertEquals("practice_junite",results,"エラー");
	}


}
