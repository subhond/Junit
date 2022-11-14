package junit.tutorial.ex02.e01;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class    FizzBuzzTest {

	@Test
	void test() {
	 FizzBuzz fizzbuzz =new FizzBuzz();
		
			List<String> expected = fizzbuzz.createFizzBuzzList(16);
			List<String> actual   =fizzbuzz.createFizzBuzzList(30);
//			assertEquals(expected, actual); // 不一致時のメッセージの出方が違う
			System.out.println(expected);
			System.out.println(actual);
			assertIterableEquals(expected,actual);
			System.out.println(expected);
			System.out.println(actual);
		}
	}


