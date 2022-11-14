package junit.tutorial.ex02.e04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ConsumptionTaxTest {
//
//	@ParameterizedTest
//	@CsvSource({
//			    "100,105"})
//	void test(int price,int apply) {
//		
//		ConsumptionTax cx=new ConsumptionTax(5);
//		int result=cx.apply( price);
//	
//		assertEquals(105,result);
//		System.out.println(result);
//		
//		
//	}
//	@ParameterizedTest
//	@CsvSource({
//			    "3000,3150"})
//	void test1(int price,int apply) {
//		
//		ConsumptionTax cx=new ConsumptionTax(5);
//		int result=cx.apply( price);
//	
//		assertEquals(3150,result);
//		System.out.println(result);
//		
//		
//	}
//	@ParameterizedTest
//	@CsvSource({
//			    "50,55"})
//	void test2(int price,int apply) {
//		
//		ConsumptionTax cx=new ConsumptionTax(10);
//		int result=cx.apply( price);
//	
//		assertEquals(55,result);
//		System.out.println(result);
//		
//		
//		
//	}
//	@ParameterizedTest
//	@CsvSource({
//			    "50,52"})
//	void test3(int price,int apply) {
//		
//		ConsumptionTax cx=new ConsumptionTax(5);
//		int result=cx.apply( price);
//	
//		assertEquals(52,result);
//		System.out.println(result);
//		
//		
//	}
//	@ParameterizedTest
//	@CsvSource({
//			    "50,51"})
//	void test4(int price,int apply) {
//		
//		ConsumptionTax cx=new ConsumptionTax(3);
//		int result=cx.apply( price);
//	
//		assertEquals(51,result);
//		System.out.println(result);
//		
//		
//	}
	@ParameterizedTest
	@CsvSource({"3,50,51",
		"5,100,105",
		"5,3000,3150",
		"10,50,55",
		"5,50,52"})
	void test5(int tax,int price,int apply) {
		
		ConsumptionTax cx=new ConsumptionTax(tax);
		int result=cx.apply( price);
	
		assertEquals(apply,result);
		System.out.println(result);
		
		
	}
	







}
