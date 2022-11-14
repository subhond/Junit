package junit.tutorial.ex01.e03;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


class CounterTest {

	
	@Test
	void test() {
		Counter counter =new Counter();
		int ans=counter.increment();
		
		assertEquals(1,ans);
		System.out.println(ans);
	}

	@Test

	@ExtendWith(MockitoExtension.class)
	void test1() {
		Counter counter =new Counter();
	counter.increment();
	int a=counter.increment();
    
    assertEquals(2,a);
    System.out.println(a);
 
    
    
	
		
	

		
	}
	@Test
	@ExtendWith(MockitoExtension.class)
	void test2() {
		Counter counter =new Counter();
	int a=50*counter.increment();
	
    
    assertEquals(50,a++);
    System.out.println(a);
 
    
    
	
		
	

		
	}
	
	
		
		
		
		
		
	}

