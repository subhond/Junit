package junit.tutorial.ex01.e02;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test() {
		
			Calculator calculator = new Calculator();
				
				assertThrows(IllegalArgumentException.class, () -> calculator.divide(1,0),"エラー");
			}
	}





