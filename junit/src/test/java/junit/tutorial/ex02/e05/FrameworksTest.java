package junit.tutorial.ex02.e05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

class FrameworksTest {
	Frameworks fr=new Frameworks();
	 boolean result =Frameworks.isSupport(ApplicationServer.GlassFish, Database.Oracle);
	 boolean result1 =Frameworks.isSupport(ApplicationServer.GlassFish, Database.DB2);
	 boolean result2 =Frameworks.isSupport(ApplicationServer.GlassFish, Database.PostgreSQL);
	 boolean result3 =Frameworks.isSupport(ApplicationServer.GlassFish, Database.MySQL);
	 boolean result4 =Frameworks.isSupport(ApplicationServer.JBoss, Database.Oracle);
	 boolean result5 =Frameworks.isSupport(ApplicationServer.JBoss, Database.DB2);
	 boolean result6 =Frameworks.isSupport(ApplicationServer.JBoss, Database.PostgreSQL);
	 boolean result7 =Frameworks.isSupport(ApplicationServer.JBoss, Database.MySQL);
	 boolean result8 =Frameworks.isSupport(ApplicationServer.Tomcat, Database.Oracle);
	 boolean result9 =Frameworks.isSupport(ApplicationServer.Tomcat, Database.DB2);
	 boolean result10 =Frameworks.isSupport(ApplicationServer.Tomcat, Database.PostgreSQL);
	 boolean result11 =Frameworks.isSupport(ApplicationServer.Tomcat, Database.MySQL);
	 
	 
	 
	@Test
	
	void test( ) {
		
		assertTrue(result,"true");
		}
@Test
	
	void test1( ) {
		
		assertTrue(result1,"true");
		}
@Test

void test2( ) {
	
	assertTrue(result2,"true");
	}
@Test

void test3( ) {
	
	assertTrue(result3,"true");
	}
@Test

void test4( ) {
	
	assertFalse(result4,"true");
	}
@Test

void test5( ) {
	
	assertTrue(result5,"true");
	}
@Test

void test6( ) {
	
	assertTrue(result6,"true");
	}
@Test

void test7( ) {
	
	assertFalse(result7,"true");
	}
	
@Test

void test8( ) {
	
	assertFalse(result8,"true");
	}
	
@Test

void test9( ) {
	
	assertFalse(result9,"true");
	}
	
@Test

void test10( ) {
	
	assertFalse(result10,"true");
	}
	
@Test

void test11( ) {
	
	assertTrue(result11,"true");
	}
	
	

}
