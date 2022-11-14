package junit.tutorial.ex02.e03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class RangeTest {
	Range renge=new Range(0, 0);
	@ParameterizedTest
	@ValueSource(doubles= {0.0,10.5})
	
	void test(double n) {
		
		boolean a=renge.contains(-0.1);
		assertFalse(a);
	}
	@ParameterizedTest
	@ValueSource(doubles= {0.0,10.5})
	void test1(double n) {
		boolean d=renge.contains(10.6);
		assertFalse(d);
	}
	@ParameterizedTest
	@ValueSource(doubles= {0.0,10.5})
	void test2(double n) {

		boolean b=renge.contains(0.0);
		assertTrue(b);
	}
	@ParameterizedTest
	@ValueSource(doubles= {0.0,10.5})
	void test3(double n) {
		boolean c=renge.contains(10.5);
		assertFalse(c);}
	
	@ParameterizedTest
	@ValueSource(doubles= {-5.1,5.1})
	void test5(double n) {
		boolean e=renge.contains(-5.2);
		assertFalse(e);}
	
	@ParameterizedTest
	@ValueSource(doubles= {-5.1,5.1})
	void test7(double n) {
		boolean e=renge.contains(-5.1);
		assertFalse(e);}
	@ParameterizedTest
	@ValueSource(doubles= {-5.1,5.1})
	void test8(double n) {
		boolean e=renge.contains(5.1);
		assertFalse(e);}
	@ParameterizedTest
	@ValueSource(doubles= {-5.1,5.1})
	void test9(double n) {
		boolean e=renge.contains(5.2);
		assertFalse(e);}
	
		
		
		
		
		
		
		
	}


