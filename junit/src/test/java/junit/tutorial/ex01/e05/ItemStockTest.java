package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ItemStockTest {

	@Test
	void test() {
		Item item=new Item("book",300);
		
		ItemStock itemstock=new ItemStock();
	int a=itemstock.getNum(item);
	assertEquals(0,a,"a");
	
		
	
	
		
		}
	@Test
	void test2() {
		Item item=new Item("book",300);
		ItemStock itemstock=new ItemStock();
	
	itemstock.add(item);
	int a=itemstock.getNum(item);
	assertEquals(1,a,"a");
		
		
	}
	@Test
	void test3() {
		Item item=new Item("book",300);
		Item item2=new Item("CD",300);
		
		
		ItemStock itemstock=new ItemStock();
	
	itemstock.add(item);
	itemstock.add(item);
	
	int a=itemstock.getNum(item);
	int as=itemstock.getNum(item2);
		
			
	
	
	assertEquals(2,a,"a");
		
		
	}
	@Test
	void test4() {
		Item item=new Item("book",300);
		Item item2=new Item("CD",300);
		
		
		ItemStock itemstock=new ItemStock();
	
	itemstock.add(item);
	itemstock.add(item2);
	
	int a=itemstock.getNum(item);
	int as=itemstock.getNum(item2);
		
			
	
	
	assertEquals(1,a,"a");
	}
	
	
	
	
		
		
	
		
	}


