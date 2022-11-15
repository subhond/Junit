package junit.tutorial.ex02.e01;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;



class    FizzBuzzTest {

	@Test
	void test() {
	 FizzBuzz fizzbuzz =new FizzBuzz();
		List<String> actual = Arrays.asList("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz","16");
			List<String> expected = fizzbuzz.createFizzBuzzList(16);
			
//			assertEquals(expected, actual); // 不一致時のメッセージの出方が違う
			
			assertIterableEquals(expected,actual);
			System.out.println(expected);
			System.out.println(actual);
		}
	}


