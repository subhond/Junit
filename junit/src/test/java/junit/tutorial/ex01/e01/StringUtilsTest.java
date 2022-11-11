package junit.tutorial.ex01.e01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringUtilsTest {

	@Test
	void testTostring() {
	
		String results=StringUtils.toSnakeCase("aaa");
		assertEquals("aaa",results,"エラー");
	}

}
