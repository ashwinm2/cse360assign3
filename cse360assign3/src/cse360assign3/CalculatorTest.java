package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Contains Junit Test cases for the class Calculator
 * @author Ashwin Murthy  PIN - 613  CSE360 Spring 2016
 *
 */
public class CalculatorTest {

	@Test
	public void testCalculator () {
		
		Calculator obj = new Calculator();
		assertNotNull(obj);
	}
	
	@Test
	public void testgetTotal () {
		Calculator obj = new Calculator();
		obj.add(15);
		obj.subtract(6);
		obj.multiply(2);
		obj.divide(3);
		assertEquals("Total must be 14",6,obj.getTotal());
	}
	
	@Test
	public void testadd () {
		Calculator obj = new Calculator();
		obj.add(15);
		obj.add(15);
		assertEquals("Total must be 30",30,obj.getTotal());
		//fail("Not yet implemented");
	}
	
	@Test
	public void testsubtract () {
		Calculator obj = new Calculator();
		obj.add(15);
		obj.subtract(5);
		assertEquals("Total must be 10",10,obj.getTotal());
		//fail("Not yet implemented");
	}
	
	@Test
	public void testmultiply () {
		Calculator obj = new Calculator();
		obj.multiply(15);
		assertEquals("Total must be 0",0,obj.getTotal());
		//fail("Not yet implemented");
	}
	
	@Test
	public void testdividecase0 () {
		Calculator obj = new Calculator();
		obj.add(15);
		obj.divide(0);
		assertEquals("Total must be 0",0,obj.getTotal());
		//fail("Not yet implemented");
	}
	
	@Test
	public void testdivide () {
		Calculator obj = new Calculator();
		obj.add(15);
		obj.divide(5);
		assertEquals("Total must be 3",3,obj.getTotal());
		//fail("Not yet implemented");
	}
	
	@Test
	public void testgetHistory () {
		Calculator obj = new Calculator();
		obj.add(15);
		obj.subtract(6);
		obj.multiply(2);
		obj.divide(3);
		assertEquals("The string must be 0 + 15 - 6 * 2 / 3","0 + 15 - 6 * 2 / 3",obj.getHistory());
		//fail("Not yet implemented");
	}
	

}
