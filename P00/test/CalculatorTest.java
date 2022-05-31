import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAddN(){
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		int expected = 5555;
		assertEquals (expected, actual);

	}
	public void testAddB() {
		int a = 999;
		int b = 0;
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		int expected = 999;
		assertEquals (expected, actual);
		
	}
	public void testAddE() {
		int a = 99;
		int b = -1;
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		String expected = "Error";
		assertnotEquals (expected, actual);
		
	}
	
	
	@Test
	public void testSubtractN(){
		int a = 10;
		int b = 5;
			
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b); 
			 
		int expected = 5;
		assertEquals (expected, actual);

	}
	@Test
	public void testSubtractB(){
		int a = 0;
		int b = 0;
			
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b); 
			 
		int expected = 0;
		assertEquals (expected, actual);

	}
	@Test
	public void testSubtractE(){
		int a =-1;
		int b =99;
			
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b); 
			 
		String expected = "Error";
		assertNotEquals (expected, actual);

	}
	
	
	@Test
	public void testMutlipleN(){
		int a = 10;
		int b = 5;
			
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b); 
			 
		int expected = 50;
		assertEquals (expected, actual);

	}
	@Test
	public void testMutlipleB(){
		int a = 999;
		int b = 0;
			
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b); 
			 
		int expected = 0;
		assertEquals (expected, actual);

	}
	@Test
	public void testMutlipleE(){
		int a =-1;
		int b =99;
			
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b); 
			 
		String expected = "Error";
		assertNotEquals (expected, actual);

	}
	
	@Test
	public void testDivideN(){
		int a = 10;
		int b = 5;
			
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b); 
			 
		int expected = 2;
		assertEquals (expected, actual);

	}
	@Test
	public void testDivideB(){
		int a = 999;
		int b = 999;
			
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b); 
			 
		int expected = 1;
		assertEquals (expected, actual);

	}
	@Test
	public void testDivideE(){
		int a =-1;
		int b =99;
			
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b); 
			 
		String expected = "Error";
		assertNotEquals (expected, actual);

	}
	

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
