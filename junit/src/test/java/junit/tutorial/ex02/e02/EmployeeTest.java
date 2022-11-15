package junit.tutorial.ex02.e02;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	
	void test() {
		
		
		InputStream input=getClass().getResourceAsStream("Employee.txt");
		
		
		List<Employee> empList1 =Employee.load(input);
		//empList1内のempインスタンスの取り出し方↓（そのままassert~に入れるとlist型になる
		Employee emp = empList1.get(0);
		System.out.println(emp);
		

		
	
		
		assertEquals("Ichiro",emp.getFirstName());
		assertEquals("Tanaka",emp.getLastName());
		assertEquals("ichiro@example.com",emp.getEmail());
		
			
			
			
		
		
		
		
	
		
		
	
		
		
		
		}
		
	
	}

