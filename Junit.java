package junitdemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/*
 * This program will test @BeforeClass, @AfterClass, @Before, @After
 * 
 * Run this program to see the "sequence" of the method call
 */
public class Junit {
	Swim swim;
	@BeforeClass
	public static void m1() {
		
		System.out.println("@BeforeClass");
	}

	@AfterClass
	public static void m2() {
		System.out.println("@AfterClass");
	}

	@Before
	public void m3() {
		swim = new Swim();
		System.out.println("@Before");
	}

	@After
	public void m4() {
		swim = null;
		System.out.println("@After");
	}

	@Test
	public void testPrice() {
		//normal
		assertEquals(swim.Price(10, 00, 1, 25, true, true),100);
		//modify age
		assertEquals(swim.Price(10, 0, 1, -1, false, false),999);
		assertEquals(swim.Price(10, 0, 1, 0, false, false),160);
		assertEquals(swim.Price(10, 0, 1, 1, false, false),160);
		assertEquals(swim.Price(10, 0, 1, 11, false, false),160);
		assertEquals(swim.Price(10, 0, 1, 12, false, false),200);
		assertEquals(swim.Price(10, 0, 1, 13, false, false),200);
		assertEquals(swim.Price(10, 0, 1, 59, false, false),200);
		assertEquals(swim.Price(10, 0, 1, 60, false, false),160);
		assertEquals(swim.Price(10, 0, 1, 61, false, false),160);
		assertEquals(swim.Price(10, 0, 1, 119, false, false),160);
		assertEquals(swim.Price(10, 0, 1, 120, false, false),160);
		assertEquals(swim.Price(10, 0, 1, 121, false, false),999);
		//modify time
		assertEquals(swim.Price(4, 59, 1, 25, false, false),999);
		assertEquals(swim.Price(5, 0, 1, 25, false, false),160);
		assertEquals(swim.Price(5, 1, 1, 25, false, false),160);
		assertEquals(swim.Price(6, 59, 1, 25, false, false),160);
		assertEquals(swim.Price(7, 0, 1, 25, false, false),200);
		assertEquals(swim.Price(7, 1, 1, 25, false, false),200);
		assertEquals(swim.Price(21, 59, 1, 25, false, false),200);
		assertEquals(swim.Price(22, 0, 1, 25, false, false),200);
		assertEquals(swim.Price(22, 1, 1, 25, false, false),999);
		//modify week
		assertEquals(swim.Price(10, 0, 0, 25, false, false),999);
		assertEquals(swim.Price(10, 0, 1, 25, false, false),200);
		assertEquals(swim.Price(10, 0, 2, 25, false, false),200);
		assertEquals(swim.Price(10, 0, 3, 25, false, false),200);
		assertEquals(swim.Price(10, 0, 4, 25, false, false),200);
		assertEquals(swim.Price(10, 0, 5, 25, false, false),200);
		assertEquals(swim.Price(10, 0, 6, 25, false, false),250);
		assertEquals(swim.Price(10, 0, 7, 25, false, false),250);
		assertEquals(swim.Price(10, 0, 8, 25, false, false),999);
	}
	@Test
	public void testPrice2(){
		//time normal
		assertEquals(swim.Price(10, 00, 1, 25, true, true),100);
		assertEquals(swim.Price(10, 00, 1, 25, true, false),140);
		assertEquals(swim.Price(10, 00, 1, 25, false, true),100);
		assertEquals(swim.Price(10, 00, 1, 25, false, false),200);
		
		assertEquals(swim.Price(10, 00, 1, -1, true, true),999);
		assertEquals(swim.Price(10, 00, 1, -1, true, false),999);
		assertEquals(swim.Price(10, 00, 1, -1, false, true),999);
		assertEquals(swim.Price(10, 00, 1, -1, false, false),999);
		
		assertEquals(swim.Price(10, 00, 1, 0, true, true),100);
		assertEquals(swim.Price(10, 00, 1, 0, true, false),140);
		assertEquals(swim.Price(10, 00, 1, 0, false, true),100);
		assertEquals(swim.Price(10, 00, 1, 0, false, false),160);
		
		assertEquals(swim.Price(10, 00, 1, 1, true, true),100);
		assertEquals(swim.Price(10, 00, 1, 1, true, false),140);
		assertEquals(swim.Price(10, 00, 1, 1, false, true),100);
		assertEquals(swim.Price(10, 00, 1, 1, false, false),160);
		
		assertEquals(swim.Price(10, 00, 1, 11, true, true),100);
		assertEquals(swim.Price(10, 00, 1, 11, true, false),140);
		assertEquals(swim.Price(10, 00, 1, 11, false, true),100);
		assertEquals(swim.Price(10, 00, 1, 11, false, false),160);
		
		assertEquals(swim.Price(10, 00, 1, 12, true, true),100);
		assertEquals(swim.Price(10, 00, 1, 12, true, false),140);
		assertEquals(swim.Price(10, 00, 1, 12, false, true),100);
		assertEquals(swim.Price(10, 00, 1, 12, false, false),200);
		
		assertEquals(swim.Price(10, 00, 1, 13, true, true),100);
		assertEquals(swim.Price(10, 00, 1, 13, true, false),140);
		assertEquals(swim.Price(10, 00, 1, 13, false, true),100);
		assertEquals(swim.Price(10, 00, 1, 13, false, false),200);
		
		assertEquals(swim.Price(10, 00, 1, 59, true, true),100);
		assertEquals(swim.Price(10, 00, 1, 59, true, false),140);
		assertEquals(swim.Price(10, 00, 1, 59, false, true),100);
		assertEquals(swim.Price(10, 00, 1, 59, false, false),200);
		
		assertEquals(swim.Price(10, 00, 1, 60, true, true),100);
		assertEquals(swim.Price(10, 00, 1, 60, true, false),140);
		assertEquals(swim.Price(10, 00, 1, 60, false, true),100);
		assertEquals(swim.Price(10, 00, 1, 60, false, false),160);
		
		assertEquals(swim.Price(10, 00, 1, 61, true, true),100);
		assertEquals(swim.Price(10, 00, 1, 61, true, false),140);
		assertEquals(swim.Price(10, 00, 1, 61, false, true),100);
		assertEquals(swim.Price(10, 00, 1, 61, false, false),160);
		
		assertEquals(swim.Price(10, 00, 1, 119, true, true),100);
		assertEquals(swim.Price(10, 00, 1, 119, true, false),140);
		assertEquals(swim.Price(10, 00, 1, 119, false, true),100);
		assertEquals(swim.Price(10, 00, 1, 119, false, false),160);
		
		assertEquals(swim.Price(10, 00, 1, 120, true, true),100);
		assertEquals(swim.Price(10, 00, 1, 120, true, false),140);
		assertEquals(swim.Price(10, 00, 1, 120, false, true),100);
		assertEquals(swim.Price(10, 00, 1, 120, false, false),160);
		
		assertEquals(swim.Price(10, 00, 1, 121, true, true),999);
		assertEquals(swim.Price(10, 00, 1, 121, true, false),999);
		assertEquals(swim.Price(10, 00, 1, 121, false, true),999);
		assertEquals(swim.Price(10, 00, 1, 121, false, false),999);
		// age over
		
		
		assertEquals(swim.Price(10, 00, 6, 25, true, true),125);
		assertEquals(swim.Price(10, 00, 6, 25, true, false),250);
		assertEquals(swim.Price(10, 00, 6, 25, false, true),125);
		assertEquals(swim.Price(10, 00, 6, 25, false, false),250);
		
		assertEquals(swim.Price(10, 00, 6, -1, true, true),999);
		assertEquals(swim.Price(10, 00, 6, -1, true, false),999);
		assertEquals(swim.Price(10, 00, 6, -1, false, true),999);
		assertEquals(swim.Price(10, 00, 6, -1, false, false),999);
		
		assertEquals(swim.Price(10, 00, 6, 0, true, true),125);
		assertEquals(swim.Price(10, 00, 6, 0, true, false),250);
		assertEquals(swim.Price(10, 00, 6, 0, false, true),125);
		assertEquals(swim.Price(10, 00, 6, 0, false, false),250);
		
		assertEquals(swim.Price(10, 00, 6, 1, true, true),125);
		assertEquals(swim.Price(10, 00, 6, 1, true, false),250);
		assertEquals(swim.Price(10, 00, 6, 1, false, true),125);
		assertEquals(swim.Price(10, 00, 6, 1, false, false),250);
		
		assertEquals(swim.Price(10, 00, 6, 11, true, true),125);
		assertEquals(swim.Price(10, 00, 6, 11, true, false),250);
		assertEquals(swim.Price(10, 00, 6, 11, false, true),125);
		assertEquals(swim.Price(10, 00, 6, 11, false, false),250);
		
		assertEquals(swim.Price(10, 00, 6, 12, true, true),125);
		assertEquals(swim.Price(10, 00, 6, 12, true, false),250);
		assertEquals(swim.Price(10, 00, 6, 12, false, true),125);
		assertEquals(swim.Price(10, 00, 6, 12, false, false),250);
		
		assertEquals(swim.Price(10, 00, 6, 13, true, true),125);
		assertEquals(swim.Price(10, 00, 6, 13, true, false),250);
		assertEquals(swim.Price(10, 00, 6, 13, false, true),125);
		assertEquals(swim.Price(10, 00, 6, 13, false, false),250);
		
		assertEquals(swim.Price(10, 00, 6, 59, true, true),125);
		assertEquals(swim.Price(10, 00, 6, 59, true, false),250);
		assertEquals(swim.Price(10, 00, 6, 59, false, true),125);
		assertEquals(swim.Price(10, 00, 6, 59, false, false),250);
		
		assertEquals(swim.Price(10, 00, 6, 60, true, true),125);
		assertEquals(swim.Price(10, 00, 6, 60, true, false),250);
		assertEquals(swim.Price(10, 00, 6, 60, false, true),125);
		assertEquals(swim.Price(10, 00, 6, 60, false, false),250);
		
		assertEquals(swim.Price(10, 00, 6, 61, true, true),125);
		assertEquals(swim.Price(10, 00, 6, 61, true, false),250);
		assertEquals(swim.Price(10, 00, 6, 61, false, true),125);
		assertEquals(swim.Price(10, 00, 6, 61, false, false),250);
		
		assertEquals(swim.Price(10, 00, 6, 119, true, true),125);
		assertEquals(swim.Price(10, 00, 6, 119, true, false),250);
		assertEquals(swim.Price(10, 00, 6, 119, false, true),125);
		assertEquals(swim.Price(10, 00, 6, 119, false, false),250);
		
		assertEquals(swim.Price(10, 00, 6, 120, true, true),125);
		assertEquals(swim.Price(10, 00, 6, 120, true, false),250);
		assertEquals(swim.Price(10, 00, 6, 120, false, true),125);
		assertEquals(swim.Price(10, 00, 6, 120, false, false),250);
		
		assertEquals(swim.Price(10, 00, 6, 121, true, true),999);
		assertEquals(swim.Price(10, 00, 6, 121, true, false),999);
		assertEquals(swim.Price(10, 00, 6, 121, false, true),999);
		assertEquals(swim.Price(10, 00, 6, 121, false, false),999);
		//week over
		
		//time 4:59
		assertEquals(swim.Price(4, 59, 1, 25, true, true),999);
		assertEquals(swim.Price(4, 59, 1, 25, true, false),999);
		assertEquals(swim.Price(4, 59, 1, 25, false, true),999);
		assertEquals(swim.Price(4, 59, 1, 25, false, false),999);
		
		assertEquals(swim.Price(4, 59, 1, -1, true, true),999);
		assertEquals(swim.Price(4, 59, 1, -1, true, false),999);
		assertEquals(swim.Price(4, 59, 1, -1, false, true),999);
		assertEquals(swim.Price(4, 59, 1, -1, false, false),999);
		
		assertEquals(swim.Price(4, 59, 1, 0, true, true),999);
		assertEquals(swim.Price(4, 59, 1, 0, true, false),999);
		assertEquals(swim.Price(4, 59, 1, 0, false, true),999);
		assertEquals(swim.Price(4, 59, 1, 0, false, false),999);
		
		assertEquals(swim.Price(4, 59, 1, 1, true, true),999);
		assertEquals(swim.Price(4, 59, 1, 1, true, false),999);
		assertEquals(swim.Price(4, 59, 1, 1, false, true),999);
		assertEquals(swim.Price(4, 59, 1, 1, false, false),999);
		
		assertEquals(swim.Price(4, 59, 1, 11, true, true),999);
		assertEquals(swim.Price(4, 59, 1, 11, true, false),999);
		assertEquals(swim.Price(4, 59, 1, 11, false, true),999);
		assertEquals(swim.Price(4, 59, 1, 11, false, false),999);
		
		assertEquals(swim.Price(4, 59, 1, 12, true, true),999);
		assertEquals(swim.Price(4, 59, 1, 12, true, false),999);
		assertEquals(swim.Price(4, 59, 1, 12, false, true),999);
		assertEquals(swim.Price(4, 59, 1, 12, false, false),999);
		
		assertEquals(swim.Price(4, 59, 1, 13, true, true),999);
		assertEquals(swim.Price(4, 59, 1, 13, true, false),999);
		assertEquals(swim.Price(4, 59, 1, 13, false, true),999);
		assertEquals(swim.Price(4, 59, 1, 13, false, false),999);
		
		assertEquals(swim.Price(4, 59, 1, 59, true, true),999);
		assertEquals(swim.Price(4, 59, 1, 59, true, false),999);
		assertEquals(swim.Price(4, 59, 1, 59, false, true),999);
		assertEquals(swim.Price(4, 59, 1, 59, false, false),999);
		
		assertEquals(swim.Price(4, 59, 1, 60, true, true),999);
		assertEquals(swim.Price(4, 59, 1, 60, true, false),999);
		assertEquals(swim.Price(4, 59, 1, 60, false, true),999);
		assertEquals(swim.Price(4, 59, 1, 60, false, false),999);
		
		assertEquals(swim.Price(4, 59, 1, 61, true, true),999);
		assertEquals(swim.Price(4, 59, 1, 61, true, false),999);
		assertEquals(swim.Price(4, 59, 1, 61, false, true),999);
		assertEquals(swim.Price(4, 59, 1, 61, false, false),999);
		
		assertEquals(swim.Price(4, 59, 1, 119, true, true),999);
		assertEquals(swim.Price(4, 59, 1, 119, true, false),999);
		assertEquals(swim.Price(4, 59, 1, 119, false, true),999);
		assertEquals(swim.Price(4, 59, 1, 119, false, false),999);
		
		assertEquals(swim.Price(4, 59, 1, 120, true, true),999);
		assertEquals(swim.Price(4, 59, 1, 120, true, false),999);
		assertEquals(swim.Price(4, 59, 1, 120, false, true),999);
		assertEquals(swim.Price(4, 59, 1, 120, false, false),999);
		
		assertEquals(swim.Price(4, 59, 1, 121, true, true),999);
		assertEquals(swim.Price(4, 59, 1, 121, true, false),999);
		assertEquals(swim.Price(4, 59, 1, 121, false, true),999);
		assertEquals(swim.Price(4, 59, 1, 121, false, false),999);
		// age over
		
		
		assertEquals(swim.Price(4, 59, 6, 25, true, true),999);
		assertEquals(swim.Price(4, 59, 6, 25, true, false),999);
		assertEquals(swim.Price(4, 59, 6, 25, false, true),999);
		assertEquals(swim.Price(4, 59, 6, 25, false, false),999);
		
		assertEquals(swim.Price(4, 59, 6, -1, true, true),999);
		assertEquals(swim.Price(4, 59, 6, -1, true, false),999);
		assertEquals(swim.Price(4, 59, 6, -1, false, true),999);
		assertEquals(swim.Price(4, 59, 6, -1, false, false),999);
		
		assertEquals(swim.Price(4, 59, 6, 0, true, true),999);
		assertEquals(swim.Price(4, 59, 6, 0, true, false),999);
		assertEquals(swim.Price(4, 59, 6, 0, false, true),999);
		assertEquals(swim.Price(4, 59, 6, 0, false, false),999);
		
		assertEquals(swim.Price(4, 59, 6, 1, true, true),999);
		assertEquals(swim.Price(4, 59, 6, 1, true, false),999);
		assertEquals(swim.Price(4, 59, 6, 1, false, true),999);
		assertEquals(swim.Price(4, 59, 6, 1, false, false),999);
		
		assertEquals(swim.Price(4, 59, 6, 11, true, true),999);
		assertEquals(swim.Price(4, 59, 6, 11, true, false),999);
		assertEquals(swim.Price(4, 59, 6, 11, false, true),999);
		assertEquals(swim.Price(4, 59, 6, 11, false, false),999);
		
		assertEquals(swim.Price(4, 59, 6, 12, true, true),999);
		assertEquals(swim.Price(4, 59, 6, 12, true, false),999);
		assertEquals(swim.Price(4, 59, 6, 12, false, true),999);
		assertEquals(swim.Price(4, 59, 6, 12, false, false),999);
		
		assertEquals(swim.Price(4, 59, 6, 13, true, true),999);
		assertEquals(swim.Price(4, 59, 6, 13, true, false),999);
		assertEquals(swim.Price(4, 59, 6, 13, false, true),999);
		assertEquals(swim.Price(4, 59, 6, 13, false, false),999);
		
		assertEquals(swim.Price(4, 59, 6, 59, true, true),999);
		assertEquals(swim.Price(4, 59, 6, 59, true, false),999);
		assertEquals(swim.Price(4, 59, 6, 59, false, true),999);
		assertEquals(swim.Price(4, 59, 6, 59, false, false),999);
		
		assertEquals(swim.Price(4, 59, 6, 60, true, true),999);
		assertEquals(swim.Price(4, 59, 6, 60, true, false),999);
		assertEquals(swim.Price(4, 59, 6, 60, false, true),999);
		assertEquals(swim.Price(4, 59, 6, 60, false, false),999);
		
		assertEquals(swim.Price(4, 59, 6, 61, true, true),999);
		assertEquals(swim.Price(4, 59, 6, 61, true, false),999);
		assertEquals(swim.Price(4, 59, 6, 61, false, true),999);
		assertEquals(swim.Price(4, 59, 6, 61, false, false),999);
		
		assertEquals(swim.Price(4, 59, 6, 119, true, true),999);
		assertEquals(swim.Price(4, 59, 6, 119, true, false),999);
		assertEquals(swim.Price(4, 59, 6, 119, false, true),999);
		assertEquals(swim.Price(4, 59, 6, 119, false, false),999);
		
		assertEquals(swim.Price(4, 59, 6, 120, true, true),999);
		assertEquals(swim.Price(4, 59, 6, 120, true, false),999);
		assertEquals(swim.Price(4, 59, 6, 120, false, true),999);
		assertEquals(swim.Price(4, 59, 6, 120, false, false),999);
		
		assertEquals(swim.Price(4, 59, 6, 121, true, true),999);
		assertEquals(swim.Price(4, 59, 6, 121, true, false),999);
		assertEquals(swim.Price(4, 59, 6, 121, false, true),999);
		assertEquals(swim.Price(4, 59, 6, 121, false, false),999);
		//week over
		
		//time 22, 01
		assertEquals(swim.Price(22, 01, 1, 25, true, true),999);
		assertEquals(swim.Price(22, 01, 1, 25, true, false),999);
		assertEquals(swim.Price(22, 01, 1, 25, false, true),999);
		assertEquals(swim.Price(22, 01, 1, 25, false, false),999);
		
		assertEquals(swim.Price(22, 01, 1, -1, true, true),999);
		assertEquals(swim.Price(22, 01, 1, -1, true, false),999);
		assertEquals(swim.Price(22, 01, 1, -1, false, true),999);
		assertEquals(swim.Price(22, 01, 1, -1, false, false),999);
			
		assertEquals(swim.Price(22, 01, 1, 0, true, true),999);
		assertEquals(swim.Price(22, 01, 1, 0, true, false),999);
		assertEquals(swim.Price(22, 01, 1, 0, false, true),999);
		assertEquals(swim.Price(22, 01, 1, 0, false, false),999);
		
		assertEquals(swim.Price(22, 01, 1, 1, true, true),999);
		assertEquals(swim.Price(22, 01, 1, 1, true, false),999);
		assertEquals(swim.Price(22, 01, 1, 1, false, true),999);
		assertEquals(swim.Price(22, 01, 1, 1, false, false),999);
		
		assertEquals(swim.Price(22, 01, 1, 11, true, true),999);
		assertEquals(swim.Price(22, 01, 1, 11, true, false),999);
		assertEquals(swim.Price(22, 01, 1, 11, false, true),999);
		assertEquals(swim.Price(22, 01, 1, 11, false, false),999);
			
		assertEquals(swim.Price(22, 01, 1, 12, true, true),999);
		assertEquals(swim.Price(22, 01, 1, 12, true, false),999);
		assertEquals(swim.Price(22, 01, 1, 12, false, true),999);
		assertEquals(swim.Price(22, 01, 1, 12, false, false),999);
				
		assertEquals(swim.Price(22, 01, 1, 13, true, true),999);
		assertEquals(swim.Price(22, 01, 1, 13, true, false),999);
		assertEquals(swim.Price(22, 01, 1, 13, false, true),999);
		assertEquals(swim.Price(22, 01, 1, 13, false, false),999);
			
		assertEquals(swim.Price(22, 01, 1, 59, true, true),999);
		assertEquals(swim.Price(22, 01, 1, 59, true, false),999);
		assertEquals(swim.Price(22, 01, 1, 59, false, true),999);
		assertEquals(swim.Price(22, 01, 1, 59, false, false),999);
				
		assertEquals(swim.Price(22, 01, 1, 60, true, true),999);
		assertEquals(swim.Price(22, 01, 1, 60, true, false),999);
		assertEquals(swim.Price(22, 01, 1, 60, false, true),999);
		assertEquals(swim.Price(22, 01, 1, 60, false, false),999);
				
		assertEquals(swim.Price(22, 01, 1, 61, true, true),999);
		assertEquals(swim.Price(22, 01, 1, 61, true, false),999);
		assertEquals(swim.Price(22, 01, 1, 61, false, true),999);
		assertEquals(swim.Price(22, 01, 1, 61, false, false),999);
				
		assertEquals(swim.Price(22, 01, 1, 119, true, true),999);
		assertEquals(swim.Price(22, 01, 1, 119, true, false),999);
		assertEquals(swim.Price(22, 01, 1, 119, false, true),999);
		assertEquals(swim.Price(22, 01, 1, 119, false, false),999);
				
		assertEquals(swim.Price(22, 01, 1, 120, true, true),999);
		assertEquals(swim.Price(22, 01, 1, 120, true, false),999);
		assertEquals(swim.Price(22, 01, 1, 120, false, true),999);
		assertEquals(swim.Price(22, 01, 1, 120, false, false),999);
				
		assertEquals(swim.Price(22, 01, 1, 121, true, true),999);
		assertEquals(swim.Price(22, 01, 1, 121, true, false),999);
		assertEquals(swim.Price(22, 01, 1, 121, false, true),999);
		assertEquals(swim.Price(22, 01, 1, 121, false, false),999);
				// age over
				
				
		assertEquals(swim.Price(22, 01, 6, 25, true, true),999);
		assertEquals(swim.Price(22, 01, 6, 25, true, false),999);
		assertEquals(swim.Price(22, 01, 6, 25, false, true),999);
		assertEquals(swim.Price(22, 01, 6, 25, false, false),999);
			
		assertEquals(swim.Price(22, 01, 6, -1, true, true),999);
		assertEquals(swim.Price(22, 01, 6, -1, true, false),999);
		assertEquals(swim.Price(22, 01, 6, -1, false, true),999);
		assertEquals(swim.Price(22, 01, 6, -1, false, false),999);
		
		assertEquals(swim.Price(22, 01, 6, 0, true, true),999);
		assertEquals(swim.Price(22, 01, 6, 0, true, false),999);
		assertEquals(swim.Price(22, 01, 6, 0, false, true),999);
		assertEquals(swim.Price(22, 01, 6, 0, false, false),999);
				
		assertEquals(swim.Price(22, 01, 6, 1, true, true),999);
		assertEquals(swim.Price(22, 01, 6, 1, true, false),999);
		assertEquals(swim.Price(22, 01, 6, 1, false, true),999);
		assertEquals(swim.Price(22, 01, 6, 1, false, false),999);
			
		assertEquals(swim.Price(22, 01, 6, 11, true, true),999);
		assertEquals(swim.Price(22, 01, 6, 11, true, false),999);
		assertEquals(swim.Price(22, 01, 6, 11, false, true),999);
		assertEquals(swim.Price(22, 01, 6, 11, false, false),999);
				
		assertEquals(swim.Price(22, 01, 6, 12, true, true),999);
		assertEquals(swim.Price(22, 01, 6, 12, true, false),999);
		assertEquals(swim.Price(22, 01, 6, 12, false, true),999);
		assertEquals(swim.Price(22, 01, 6, 12, false, false),999);
				
		assertEquals(swim.Price(22, 01, 6, 13, true, true),999);
		assertEquals(swim.Price(22, 01, 6, 13, true, false),999);
		assertEquals(swim.Price(22, 01, 6, 13, false, true),999);
		assertEquals(swim.Price(22, 01, 6, 13, false, false),999);
				
		assertEquals(swim.Price(22, 01, 6, 59, true, true),999);
		assertEquals(swim.Price(22, 01, 6, 59, true, false),999);
		assertEquals(swim.Price(22, 01, 6, 59, false, true),999);
		assertEquals(swim.Price(22, 01, 6, 59, false, false),999);
				
		assertEquals(swim.Price(22, 01, 6, 60, true, true),999);
		assertEquals(swim.Price(22, 01, 6, 60, true, false),999);
		assertEquals(swim.Price(22, 01, 6, 60, false, true),999);
		assertEquals(swim.Price(22, 01, 6, 60, false, false),999);
		
		assertEquals(swim.Price(22, 01, 6, 61, true, true),999);
		assertEquals(swim.Price(22, 01, 6, 61, true, false),999);
		assertEquals(swim.Price(22, 01, 6, 61, false, true),999);
		assertEquals(swim.Price(22, 01, 6, 61, false, false),999);
			
		assertEquals(swim.Price(22, 01, 6, 119, true, true),999);
		assertEquals(swim.Price(22, 01, 6, 119, true, false),999);
		assertEquals(swim.Price(22, 01, 6, 119, false, true),999);
		assertEquals(swim.Price(22, 01, 6, 119, false, false),999);
		
		assertEquals(swim.Price(22, 01, 6, 120, true, true),999);
		assertEquals(swim.Price(22, 01, 6, 120, true, false),999);
		assertEquals(swim.Price(22, 01, 6, 120, false, true),999);
		assertEquals(swim.Price(22, 01, 6, 120, false, false),999);
			
		assertEquals(swim.Price(22, 01, 6, 121, true, true),999);
		assertEquals(swim.Price(22, 01, 6, 121, true, false),999);
		assertEquals(swim.Price(22, 01, 6, 121, false, true),999);
		assertEquals(swim.Price(22, 01, 6, 121, false, false),999);
		//week over
		
		//time 5:00
		assertEquals(swim.Price(5,00, 1, 25, true, true),100);
		assertEquals(swim.Price(5,00, 1, 25, true, false),140);
		assertEquals(swim.Price(5,00, 1, 25, false, true),100);
		assertEquals(swim.Price(5,00, 1, 25, false, false),160);
		
		assertEquals(swim.Price(5,00, 1, -1, true, true),999);
		assertEquals(swim.Price(5,00, 1, -1, true, false),999);
		assertEquals(swim.Price(5,00, 1, -1, false, true),999);
		assertEquals(swim.Price(5,00, 1, -1, false, false),999);
		
		assertEquals(swim.Price(5,00, 1, 0, true, true),100);
		assertEquals(swim.Price(5,00, 1, 0, true, false),140);
		assertEquals(swim.Price(5,00, 1, 0, false, true),100);
		assertEquals(swim.Price(5,00, 1, 0, false, false),160);
		
		assertEquals(swim.Price(5,00, 1, 1, true, true),100);
		assertEquals(swim.Price(5,00, 1, 1, true, false),140);
		assertEquals(swim.Price(5,00, 1, 1, false, true),100);
		assertEquals(swim.Price(5,00, 1, 1, false, false),160);
		
		assertEquals(swim.Price(5,00, 1, 11, true, true),100);
		assertEquals(swim.Price(5,00, 1, 11, true, false),140);
		assertEquals(swim.Price(5,00, 1, 11, false, true),100);
		assertEquals(swim.Price(5,00, 1, 11, false, false),160);
		
		assertEquals(swim.Price(5,00, 1, 12, true, true),100);
		assertEquals(swim.Price(5,00, 1, 12, true, false),140);
		assertEquals(swim.Price(5,00, 1, 12, false, true),100);
		assertEquals(swim.Price(5,00, 1, 12, false, false),160);
		
		assertEquals(swim.Price(5,00, 1, 13, true, true),100);
		assertEquals(swim.Price(5,00, 1, 13, true, false),140);
		assertEquals(swim.Price(5,00, 1, 13, false, true),100);
		assertEquals(swim.Price(5,00, 1, 13, false, false),160);
		
		assertEquals(swim.Price(5,00, 1, 59, true, true),100);
		assertEquals(swim.Price(5,00, 1, 59, true, false),140);
		assertEquals(swim.Price(5,00, 1, 59, false, true),100);
		assertEquals(swim.Price(5,00, 1, 59, false, false),160);
		
		assertEquals(swim.Price(5,00, 1, 60, true, true),100);
		assertEquals(swim.Price(5,00, 1, 60, true, false),140);
		assertEquals(swim.Price(5,00, 1, 60, false, true),100);
		assertEquals(swim.Price(5,00, 1, 60, false, false),160);
		
		assertEquals(swim.Price(5,00, 1, 61, true, true),100);
		assertEquals(swim.Price(5,00, 1, 61, true, false),140);
		assertEquals(swim.Price(5,00, 1, 61, false, true),100);
		assertEquals(swim.Price(5,00, 1, 61, false, false),160);
		
		assertEquals(swim.Price(5,00, 1, 119, true, true),100);
		assertEquals(swim.Price(5,00, 1, 119, true, false),140);
		assertEquals(swim.Price(5,00, 1, 119, false, true),100);
		assertEquals(swim.Price(5,00, 1, 119, false, false),160);
		
		assertEquals(swim.Price(5,00, 1, 120, true, true),100);
		assertEquals(swim.Price(5,00, 1, 120, true, false),140);
		assertEquals(swim.Price(5,00, 1, 120, false, true),100);
		assertEquals(swim.Price(5,00, 1, 120, false, false),160);
		
		assertEquals(swim.Price(5,00, 1, 121, true, true),999);
		assertEquals(swim.Price(5,00, 1, 121, true, false),999);
		assertEquals(swim.Price(5,00, 1, 121, false, true),999);
		assertEquals(swim.Price(5,00, 1, 121, false, false),999);
		// age over
		
		
		assertEquals(swim.Price(5,00, 6, 25, true, true),125);
		assertEquals(swim.Price(5,00, 6, 25, true, false),250);
		assertEquals(swim.Price(5,00, 6, 25, false, true),125);
		assertEquals(swim.Price(5,00, 6, 25, false, false),250);
		
		assertEquals(swim.Price(5,00, 6, -1, true, true),999);
		assertEquals(swim.Price(5,00, 6, -1, true, false),999);
		assertEquals(swim.Price(5,00, 6, -1, false, true),999);
		assertEquals(swim.Price(5,00, 6, -1, false, false),999);
		
		assertEquals(swim.Price(5,00, 6, 0, true, true),125);
		assertEquals(swim.Price(5,00, 6, 0, true, false),250);
		assertEquals(swim.Price(5,00, 6, 0, false, true),125);
		assertEquals(swim.Price(5,00, 6, 0, false, false),250);
		
		assertEquals(swim.Price(5,00, 6, 1, true, true),125);
		assertEquals(swim.Price(5,00, 6, 1, true, false),250);
		assertEquals(swim.Price(5,00, 6, 1, false, true),125);
		assertEquals(swim.Price(5,00, 6, 1, false, false),250);
		
		assertEquals(swim.Price(5,00, 6, 11, true, true),125);
		assertEquals(swim.Price(5,00, 6, 11, true, false),250);
		assertEquals(swim.Price(5,00, 6, 11, false, true),125);
		assertEquals(swim.Price(5,00, 6, 11, false, false),250);
		
		assertEquals(swim.Price(5,00, 6, 12, true, true),125);
		assertEquals(swim.Price(5,00, 6, 12, true, false),250);
		assertEquals(swim.Price(5,00, 6, 12, false, true),125);
		assertEquals(swim.Price(5,00, 6, 12, false, false),250);
		
		assertEquals(swim.Price(5,00, 6, 13, true, true),125);
		assertEquals(swim.Price(5,00, 6, 13, true, false),250);
		assertEquals(swim.Price(5,00, 6, 13, false, true),125);
		assertEquals(swim.Price(5,00, 6, 13, false, false),250);
		
		assertEquals(swim.Price(5,00, 6, 59, true, true),125);
		assertEquals(swim.Price(5,00, 6, 59, true, false),250);
		assertEquals(swim.Price(5,00, 6, 59, false, true),125);
		assertEquals(swim.Price(5,00, 6, 59, false, false),250);
		
		assertEquals(swim.Price(5,00, 6, 60, true, true),125);
		assertEquals(swim.Price(5,00, 6, 60, true, false),250);
		assertEquals(swim.Price(5,00, 6, 60, false, true),125);
		assertEquals(swim.Price(5,00, 6, 60, false, false),250);
		
		assertEquals(swim.Price(5,00, 6, 61, true, true),125);
		assertEquals(swim.Price(5,00, 6, 61, true, false),250);
		assertEquals(swim.Price(5,00, 6, 61, false, true),125);
		assertEquals(swim.Price(5,00, 6, 61, false, false),250);
		
		assertEquals(swim.Price(5,00, 6, 119, true, true),125);
		assertEquals(swim.Price(5,00, 6, 119, true, false),250);
		assertEquals(swim.Price(5,00, 6, 119, false, true),125);
		assertEquals(swim.Price(5,00, 6, 119, false, false),250);
		
		assertEquals(swim.Price(5,00, 6, 120, true, true),125);
		assertEquals(swim.Price(5,00, 6, 120, true, false),250);
		assertEquals(swim.Price(5,00, 6, 120, false, true),125);
		assertEquals(swim.Price(5,00, 6, 120, false, false),250);
		
		assertEquals(swim.Price(5,00, 6, 121, true, true),999);
		assertEquals(swim.Price(5,00, 6, 121, true, false),999);
		assertEquals(swim.Price(5,00, 6, 121, false, true),999);
		assertEquals(swim.Price(5,00, 6, 121, false, false),999);
		//week over
		
		//time 5:01
		assertEquals(swim.Price(5,01, 1, 25, true, true),100);
		assertEquals(swim.Price(5,01, 1, 25, true, false),140);
		assertEquals(swim.Price(5,01, 1, 25, false, true),100);
		assertEquals(swim.Price(5,01, 1, 25, false, false),160);
		
		assertEquals(swim.Price(5,01, 1, -1, true, true),999);
		assertEquals(swim.Price(5,01, 1, -1, true, false),999);
		assertEquals(swim.Price(5,01, 1, -1, false, true),999);
		assertEquals(swim.Price(5,01, 1, -1, false, false),999);
		
		assertEquals(swim.Price(5,01, 1, 0, true, true),100);
		assertEquals(swim.Price(5,01, 1, 0, true, false),140);
		assertEquals(swim.Price(5,01, 1, 0, false, true),100);
		assertEquals(swim.Price(5,01, 1, 0, false, false),160);
		
		assertEquals(swim.Price(5,01, 1, 1, true, true),100);
		assertEquals(swim.Price(5,01, 1, 1, true, false),140);
		assertEquals(swim.Price(5,01, 1, 1, false, true),100);
		assertEquals(swim.Price(5,01, 1, 1, false, false),160);
		
		assertEquals(swim.Price(5,01, 1, 11, true, true),100);
		assertEquals(swim.Price(5,01, 1, 11, true, false),140);
		assertEquals(swim.Price(5,01, 1, 11, false, true),100);
		assertEquals(swim.Price(5,01, 1, 11, false, false),160);
		
		assertEquals(swim.Price(5,01, 1, 12, true, true),100);
		assertEquals(swim.Price(5,01, 1, 12, true, false),140);
		assertEquals(swim.Price(5,01, 1, 12, false, true),100);
		assertEquals(swim.Price(5,01, 1, 12, false, false),160);
		
		assertEquals(swim.Price(5,01, 1, 13, true, true),100);
		assertEquals(swim.Price(5,01, 1, 13, true, false),140);
		assertEquals(swim.Price(5,01, 1, 13, false, true),100);
		assertEquals(swim.Price(5,01, 1, 13, false, false),160);
		
		assertEquals(swim.Price(5,01, 1, 59, true, true),100);
		assertEquals(swim.Price(5,01, 1, 59, true, false),140);
		assertEquals(swim.Price(5,01, 1, 59, false, true),100);
		assertEquals(swim.Price(5,01, 1, 59, false, false),160);
		
		assertEquals(swim.Price(5,01, 1, 60, true, true),100);
		assertEquals(swim.Price(5,01, 1, 60, true, false),140);
		assertEquals(swim.Price(5,01, 1, 60, false, true),100);
		assertEquals(swim.Price(5,01, 1, 60, false, false),160);
		
		assertEquals(swim.Price(5,01, 1, 61, true, true),100);
		assertEquals(swim.Price(5,01, 1, 61, true, false),140);
		assertEquals(swim.Price(5,01, 1, 61, false, true),100);
		assertEquals(swim.Price(5,01, 1, 61, false, false),160);
		
		assertEquals(swim.Price(5,01, 1, 119, true, true),100);
		assertEquals(swim.Price(5,01, 1, 119, true, false),140);
		assertEquals(swim.Price(5,01, 1, 119, false, true),100);
		assertEquals(swim.Price(5,01, 1, 119, false, false),160);
		
		assertEquals(swim.Price(5,01, 1, 120, true, true),100);
		assertEquals(swim.Price(5,01, 1, 120, true, false),140);
		assertEquals(swim.Price(5,01, 1, 120, false, true),100);
		assertEquals(swim.Price(5,01, 1, 120, false, false),160);
		
		assertEquals(swim.Price(5,01, 1, 121, true, true),999);
		assertEquals(swim.Price(5,01, 1, 121, true, false),999);
		assertEquals(swim.Price(5,01, 1, 121, false, true),999);
		assertEquals(swim.Price(5,01, 1, 121, false, false),999);
		// age over
		
		
		assertEquals(swim.Price(5,01, 6, 25, true, true),125);
		assertEquals(swim.Price(5,01, 6, 25, true, false),250);
		assertEquals(swim.Price(5,01, 6, 25, false, true),125);
		assertEquals(swim.Price(5,01, 6, 25, false, false),250);
		
		assertEquals(swim.Price(5,01, 6, -1, true, true),999);
		assertEquals(swim.Price(5,01, 6, -1, true, false),999);
		assertEquals(swim.Price(5,01, 6, -1, false, true),999);
		assertEquals(swim.Price(5,01, 6, -1, false, false),999);
		
		assertEquals(swim.Price(5,01, 6, 0, true, true),125);
		assertEquals(swim.Price(5,01, 6, 0, true, false),250);
		assertEquals(swim.Price(5,01, 6, 0, false, true),125);
		assertEquals(swim.Price(5,01, 6, 0, false, false),250);
		
		assertEquals(swim.Price(5,01, 6, 1, true, true),125);
		assertEquals(swim.Price(5,01, 6, 1, true, false),250);
		assertEquals(swim.Price(5,01, 6, 1, false, true),125);
		assertEquals(swim.Price(5,01, 6, 1, false, false),250);
		
		assertEquals(swim.Price(5,01, 6, 11, true, true),125);
		assertEquals(swim.Price(5,01, 6, 11, true, false),250);
		assertEquals(swim.Price(5,01, 6, 11, false, true),125);
		assertEquals(swim.Price(5,01, 6, 11, false, false),250);
		
		assertEquals(swim.Price(5,01, 6, 12, true, true),125);
		assertEquals(swim.Price(5,01, 6, 12, true, false),250);
		assertEquals(swim.Price(5,01, 6, 12, false, true),125);
		assertEquals(swim.Price(5,01, 6, 12, false, false),250);
		
		assertEquals(swim.Price(5,01, 6, 13, true, true),125);
		assertEquals(swim.Price(5,01, 6, 13, true, false),250);
		assertEquals(swim.Price(5,01, 6, 13, false, true),125);
		assertEquals(swim.Price(5,01, 6, 13, false, false),250);
		
		assertEquals(swim.Price(5,01, 6, 59, true, true),125);
		assertEquals(swim.Price(5,01, 6, 59, true, false),250);
		assertEquals(swim.Price(5,01, 6, 59, false, true),125);
		assertEquals(swim.Price(5,01, 6, 59, false, false),250);
		
		assertEquals(swim.Price(5,01, 6, 60, true, true),125);
		assertEquals(swim.Price(5,01, 6, 60, true, false),250);
		assertEquals(swim.Price(5,01, 6, 60, false, true),125);
		assertEquals(swim.Price(5,01, 6, 60, false, false),250);
		
		assertEquals(swim.Price(5,01, 6, 61, true, true),125);
		assertEquals(swim.Price(5,01, 6, 61, true, false),250);
		assertEquals(swim.Price(5,01, 6, 61, false, true),125);
		assertEquals(swim.Price(5,01, 6, 61, false, false),250);
		
		assertEquals(swim.Price(5,01, 6, 119, true, true),125);
		assertEquals(swim.Price(5,01, 6, 119, true, false),250);
		assertEquals(swim.Price(5,01, 6, 119, false, true),125);
		assertEquals(swim.Price(5,01, 6, 119, false, false),250);
		
		assertEquals(swim.Price(5,01, 6, 120, true, true),125);
		assertEquals(swim.Price(5,01, 6, 120, true, false),250);
		assertEquals(swim.Price(5,01, 6, 120, false, true),125);
		assertEquals(swim.Price(5,01, 6, 120, false, false),250);
		
		assertEquals(swim.Price(5,01, 6, 121, true, true),999);
		assertEquals(swim.Price(5,01, 6, 121, true, false),999);
		assertEquals(swim.Price(5,01, 6, 121, false, true),999);
		assertEquals(swim.Price(5,01, 6, 121, false, false),999);
		//week over
		
		//time 6:59
		assertEquals(swim.Price(6,59, 1, 25, true, true),100);
		assertEquals(swim.Price(6,59, 1, 25, true, false),140);
		assertEquals(swim.Price(6,59, 1, 25, false, true),100);
		assertEquals(swim.Price(6,59, 1, 25, false, false),160);
		
		assertEquals(swim.Price(6,59, 1, -1, true, true),999);
		assertEquals(swim.Price(6,59, 1, -1, true, false),999);
		assertEquals(swim.Price(6,59, 1, -1, false, true),999);
		assertEquals(swim.Price(6,59, 1, -1, false, false),999);
		
		assertEquals(swim.Price(6,59, 1, 0, true, true),100);
		assertEquals(swim.Price(6,59, 1, 0, true, false),140);
		assertEquals(swim.Price(6,59, 1, 0, false, true),100);
		assertEquals(swim.Price(6,59, 1, 0, false, false),160);
		
		assertEquals(swim.Price(6,59, 1, 1, true, true),100);
		assertEquals(swim.Price(6,59, 1, 1, true, false),140);
		assertEquals(swim.Price(6,59, 1, 1, false, true),100);
		assertEquals(swim.Price(6,59, 1, 1, false, false),160);
		
		assertEquals(swim.Price(6,59, 1, 11, true, true),100);
		assertEquals(swim.Price(6,59, 1, 11, true, false),140);
		assertEquals(swim.Price(6,59, 1, 11, false, true),100);
		assertEquals(swim.Price(6,59, 1, 11, false, false),160);
		
		assertEquals(swim.Price(6,59, 1, 12, true, true),100);
		assertEquals(swim.Price(6,59, 1, 12, true, false),140);
		assertEquals(swim.Price(6,59, 1, 12, false, true),100);
		assertEquals(swim.Price(6,59, 1, 12, false, false),160);
		
		assertEquals(swim.Price(6,59, 1, 13, true, true),100);
		assertEquals(swim.Price(6,59, 1, 13, true, false),140);
		assertEquals(swim.Price(6,59, 1, 13, false, true),100);
		assertEquals(swim.Price(6,59, 1, 13, false, false),160);
		
		assertEquals(swim.Price(6,59, 1, 59, true, true),100);
		assertEquals(swim.Price(6,59, 1, 59, true, false),140);
		assertEquals(swim.Price(6,59, 1, 59, false, true),100);
		assertEquals(swim.Price(6,59, 1, 59, false, false),160);
		
		assertEquals(swim.Price(6,59, 1, 60, true, true),100);
		assertEquals(swim.Price(6,59, 1, 60, true, false),140);
		assertEquals(swim.Price(6,59, 1, 60, false, true),100);
		assertEquals(swim.Price(6,59, 1, 60, false, false),160);
		
		assertEquals(swim.Price(6,59, 1, 61, true, true),100);
		assertEquals(swim.Price(6,59, 1, 61, true, false),140);
		assertEquals(swim.Price(6,59, 1, 61, false, true),100);
		assertEquals(swim.Price(6,59, 1, 61, false, false),160);
		
		assertEquals(swim.Price(6,59, 1, 119, true, true),100);
		assertEquals(swim.Price(6,59, 1, 119, true, false),140);
		assertEquals(swim.Price(6,59, 1, 119, false, true),100);
		assertEquals(swim.Price(6,59, 1, 119, false, false),160);
		
		assertEquals(swim.Price(6,59, 1, 120, true, true),100);
		assertEquals(swim.Price(6,59, 1, 120, true, false),140);
		assertEquals(swim.Price(6,59, 1, 120, false, true),100);
		assertEquals(swim.Price(6,59, 1, 120, false, false),160);
		
		assertEquals(swim.Price(6,59, 1, 121, true, true),999);
		assertEquals(swim.Price(6,59, 1, 121, true, false),999);
		assertEquals(swim.Price(6,59, 1, 121, false, true),999);
		assertEquals(swim.Price(6,59, 1, 121, false, false),999);
		// age over
		
		
		assertEquals(swim.Price(6,59, 6, 25, true, true),125);
		assertEquals(swim.Price(6,59, 6, 25, true, false),250);
		assertEquals(swim.Price(6,59, 6, 25, false, true),125);
		assertEquals(swim.Price(6,59, 6, 25, false, false),250);
		
		assertEquals(swim.Price(6,59, 6, -1, true, true),999);
		assertEquals(swim.Price(6,59, 6, -1, true, false),999);
		assertEquals(swim.Price(6,59, 6, -1, false, true),999);
		assertEquals(swim.Price(6,59, 6, -1, false, false),999);
		
		assertEquals(swim.Price(6,59, 6, 0, true, true),125);
		assertEquals(swim.Price(6,59, 6, 0, true, false),250);
		assertEquals(swim.Price(6,59, 6, 0, false, true),125);
		assertEquals(swim.Price(6,59, 6, 0, false, false),250);
		
		assertEquals(swim.Price(6,59, 6, 1, true, true),125);
		assertEquals(swim.Price(6,59, 6, 1, true, false),250);
		assertEquals(swim.Price(6,59, 6, 1, false, true),125);
		assertEquals(swim.Price(6,59, 6, 1, false, false),250);
		
		assertEquals(swim.Price(6,59, 6, 11, true, true),125);
		assertEquals(swim.Price(6,59, 6, 11, true, false),250);
		assertEquals(swim.Price(6,59, 6, 11, false, true),125);
		assertEquals(swim.Price(6,59, 6, 11, false, false),250);
		
		assertEquals(swim.Price(6,59, 6, 12, true, true),125);
		assertEquals(swim.Price(6,59, 6, 12, true, false),250);
		assertEquals(swim.Price(6,59, 6, 12, false, true),125);
		assertEquals(swim.Price(6,59, 6, 12, false, false),250);
		
		assertEquals(swim.Price(6,59, 6, 13, true, true),125);
		assertEquals(swim.Price(6,59, 6, 13, true, false),250);
		assertEquals(swim.Price(6,59, 6, 13, false, true),125);
		assertEquals(swim.Price(6,59, 6, 13, false, false),250);
		
		assertEquals(swim.Price(6,59, 6, 59, true, true),125);
		assertEquals(swim.Price(6,59, 6, 59, true, false),250);
		assertEquals(swim.Price(6,59, 6, 59, false, true),125);
		assertEquals(swim.Price(6,59, 6, 59, false, false),250);
		
		assertEquals(swim.Price(6,59, 6, 60, true, true),125);
		assertEquals(swim.Price(6,59, 6, 60, true, false),250);
		assertEquals(swim.Price(6,59, 6, 60, false, true),125);
		assertEquals(swim.Price(6,59, 6, 60, false, false),250);
		
		assertEquals(swim.Price(6,59, 6, 61, true, true),125);
		assertEquals(swim.Price(6,59, 6, 61, true, false),250);
		assertEquals(swim.Price(6,59, 6, 61, false, true),125);
		assertEquals(swim.Price(6,59, 6, 61, false, false),250);
		
		assertEquals(swim.Price(6,59, 6, 119, true, true),125);
		assertEquals(swim.Price(6,59, 6, 119, true, false),250);
		assertEquals(swim.Price(6,59, 6, 119, false, true),125);
		assertEquals(swim.Price(6,59, 6, 119, false, false),250);
		
		assertEquals(swim.Price(6,59, 6, 120, true, true),125);
		assertEquals(swim.Price(6,59, 6, 120, true, false),250);
		assertEquals(swim.Price(6,59, 6, 120, false, true),125);
		assertEquals(swim.Price(6,59, 6, 120, false, false),250);
		
		assertEquals(swim.Price(6,59, 6, 121, true, true),999);
		assertEquals(swim.Price(6,59, 6, 121, true, false),999);
		assertEquals(swim.Price(6,59, 6, 121, false, true),999);
		assertEquals(swim.Price(6,59, 6, 121, false, false),999);
		//week over
		
		//time 7:00
		assertEquals(swim.Price(7, 00, 1, 25, true, true),100);
		assertEquals(swim.Price(7, 00, 1, 25, true, false),140);
		assertEquals(swim.Price(7, 00, 1, 25, false, true),100);
		assertEquals(swim.Price(7, 00, 1, 25, false, false),200);
		
		assertEquals(swim.Price(7, 00, 1, -1, true, true),999);
		assertEquals(swim.Price(7, 00, 1, -1, true, false),999);
		assertEquals(swim.Price(7, 00, 1, -1, false, true),999);
		assertEquals(swim.Price(7, 00, 1, -1, false, false),999);
		
		assertEquals(swim.Price(7, 00, 1, 0, true, true),100);
		assertEquals(swim.Price(7, 00, 1, 0, true, false),140);
		assertEquals(swim.Price(7, 00, 1, 0, false, true),100);
		assertEquals(swim.Price(7, 00, 1, 0, false, false),160);
		
		assertEquals(swim.Price(7, 00, 1, 1, true, true),100);
		assertEquals(swim.Price(7, 00, 1, 1, true, false),140);
		assertEquals(swim.Price(7, 00, 1, 1, false, true),100);
		assertEquals(swim.Price(7, 00, 1, 1, false, false),160);
		
		assertEquals(swim.Price(7, 00, 1, 11, true, true),100);
		assertEquals(swim.Price(7, 00, 1, 11, true, false),140);
		assertEquals(swim.Price(7, 00, 1, 11, false, true),100);
		assertEquals(swim.Price(7, 00, 1, 11, false, false),160);
		
		assertEquals(swim.Price(7, 00, 1, 12, true, true),100);
		assertEquals(swim.Price(7, 00, 1, 12, true, false),140);
		assertEquals(swim.Price(7, 00, 1, 12, false, true),100);
		assertEquals(swim.Price(7, 00, 1, 12, false, false),200);
		
		assertEquals(swim.Price(7, 00, 1, 13, true, true),100);
		assertEquals(swim.Price(7, 00, 1, 13, true, false),140);
		assertEquals(swim.Price(7, 00, 1, 13, false, true),100);
		assertEquals(swim.Price(7, 00, 1, 13, false, false),200);
		
		assertEquals(swim.Price(7, 00, 1, 59, true, true),100);
		assertEquals(swim.Price(7, 00, 1, 59, true, false),140);
		assertEquals(swim.Price(7, 00, 1, 59, false, true),100);
		assertEquals(swim.Price(7, 00, 1, 59, false, false),200);
		
		assertEquals(swim.Price(7, 00, 1, 60, true, true),100);
		assertEquals(swim.Price(7, 00, 1, 60, true, false),140);
		assertEquals(swim.Price(7, 00, 1, 60, false, true),100);
		assertEquals(swim.Price(7, 00, 1, 60, false, false),160);
		
		assertEquals(swim.Price(7, 00, 1, 61, true, true),100);
		assertEquals(swim.Price(7, 00, 1, 61, true, false),140);
		assertEquals(swim.Price(7, 00, 1, 61, false, true),100);
		assertEquals(swim.Price(7, 00, 1, 61, false, false),160);
		
		assertEquals(swim.Price(7, 00, 1, 119, true, true),100);
		assertEquals(swim.Price(7, 00, 1, 119, true, false),140);
		assertEquals(swim.Price(7, 00, 1, 119, false, true),100);
		assertEquals(swim.Price(7, 00, 1, 119, false, false),160);
		
		assertEquals(swim.Price(7, 00, 1, 120, true, true),100);
		assertEquals(swim.Price(7, 00, 1, 120, true, false),140);
		assertEquals(swim.Price(7, 00, 1, 120, false, true),100);
		assertEquals(swim.Price(7, 00, 1, 120, false, false),160);
		
		assertEquals(swim.Price(7, 00, 1, 121, true, true),999);
		assertEquals(swim.Price(7, 00, 1, 121, true, false),999);
		assertEquals(swim.Price(7, 00, 1, 121, false, true),999);
		assertEquals(swim.Price(7, 00, 1, 121, false, false),999);
		// age over
		
		
		assertEquals(swim.Price(7, 00, 6, 25, true, true),125);
		assertEquals(swim.Price(7, 00, 6, 25, true, false),250);
		assertEquals(swim.Price(7, 00, 6, 25, false, true),125);
		assertEquals(swim.Price(7, 00, 6, 25, false, false),250);
		
		assertEquals(swim.Price(7, 00, 6, -1, true, true),999);
		assertEquals(swim.Price(7, 00, 6, -1, true, false),999);
		assertEquals(swim.Price(7, 00, 6, -1, false, true),999);
		assertEquals(swim.Price(7, 00, 6, -1, false, false),999);
		
		assertEquals(swim.Price(7, 00, 6, 0, true, true),125);
		assertEquals(swim.Price(7, 00, 6, 0, true, false),250);
		assertEquals(swim.Price(7, 00, 6, 0, false, true),125);
		assertEquals(swim.Price(7, 00, 6, 0, false, false),250);
		
		assertEquals(swim.Price(7, 00, 6, 1, true, true),125);
		assertEquals(swim.Price(7, 00, 6, 1, true, false),250);
		assertEquals(swim.Price(7, 00, 6, 1, false, true),125);
		assertEquals(swim.Price(7, 00, 6, 1, false, false),250);
		
		assertEquals(swim.Price(7, 00, 6, 11, true, true),125);
		assertEquals(swim.Price(7, 00, 6, 11, true, false),250);
		assertEquals(swim.Price(7, 00, 6, 11, false, true),125);
		assertEquals(swim.Price(7, 00, 6, 11, false, false),250);
		
		assertEquals(swim.Price(7, 00, 6, 12, true, true),125);
		assertEquals(swim.Price(7, 00, 6, 12, true, false),250);
		assertEquals(swim.Price(7, 00, 6, 12, false, true),125);
		assertEquals(swim.Price(7, 00, 6, 12, false, false),250);
		
		assertEquals(swim.Price(7, 00, 6, 13, true, true),125);
		assertEquals(swim.Price(7, 00, 6, 13, true, false),250);
		assertEquals(swim.Price(7, 00, 6, 13, false, true),125);
		assertEquals(swim.Price(7, 00, 6, 13, false, false),250);
		
		assertEquals(swim.Price(7, 00, 6, 59, true, true),125);
		assertEquals(swim.Price(7, 00, 6, 59, true, false),250);
		assertEquals(swim.Price(7, 00, 6, 59, false, true),125);
		assertEquals(swim.Price(7, 00, 6, 59, false, false),250);
		
		assertEquals(swim.Price(7, 00, 6, 60, true, true),125);
		assertEquals(swim.Price(7, 00, 6, 60, true, false),250);
		assertEquals(swim.Price(7, 00, 6, 60, false, true),125);
		assertEquals(swim.Price(7, 00, 6, 60, false, false),250);
		
		assertEquals(swim.Price(7, 00, 6, 61, true, true),125);
		assertEquals(swim.Price(7, 00, 6, 61, true, false),250);
		assertEquals(swim.Price(7, 00, 6, 61, false, true),125);
		assertEquals(swim.Price(7, 00, 6, 61, false, false),250);
		
		assertEquals(swim.Price(7, 00, 6, 119, true, true),125);
		assertEquals(swim.Price(7, 00, 6, 119, true, false),250);
		assertEquals(swim.Price(7, 00, 6, 119, false, true),125);
		assertEquals(swim.Price(7, 00, 6, 119, false, false),250);
		
		assertEquals(swim.Price(7, 00, 6, 120, true, true),125);
		assertEquals(swim.Price(7, 00, 6, 120, true, false),250);
		assertEquals(swim.Price(7, 00, 6, 120, false, true),125);
		assertEquals(swim.Price(7, 00, 6, 120, false, false),250);
		
		assertEquals(swim.Price(7, 00, 6, 121, true, true),999);
		assertEquals(swim.Price(7, 00, 6, 121, true, false),999);
		assertEquals(swim.Price(7, 00, 6, 121, false, true),999);
		assertEquals(swim.Price(7, 00, 6, 121, false, false),999);
		//week over
		
		//time 7:01
		assertEquals(swim.Price(7, 01, 1, 25, true, true),100);
		assertEquals(swim.Price(7, 01, 1, 25, true, false),140);
		assertEquals(swim.Price(7, 01, 1, 25, false, true),100);
		assertEquals(swim.Price(7, 01, 1, 25, false, false),200);
		
		assertEquals(swim.Price(7, 01, 1, -1, true, true),999);
		assertEquals(swim.Price(7, 01, 1, -1, true, false),999);
		assertEquals(swim.Price(7, 01, 1, -1, false, true),999);
		assertEquals(swim.Price(7, 01, 1, -1, false, false),999);
		
		assertEquals(swim.Price(7, 01, 1, 0, true, true),100);
		assertEquals(swim.Price(7, 01, 1, 0, true, false),140);
		assertEquals(swim.Price(7, 01, 1, 0, false, true),100);
		assertEquals(swim.Price(7, 01, 1, 0, false, false),160);
		
		assertEquals(swim.Price(7, 01, 1, 1, true, true),100);
		assertEquals(swim.Price(7, 01, 1, 1, true, false),140);
		assertEquals(swim.Price(7, 01, 1, 1, false, true),100);
		assertEquals(swim.Price(7, 01, 1, 1, false, false),160);
		
		assertEquals(swim.Price(7, 01, 1, 11, true, true),100);
		assertEquals(swim.Price(7, 01, 1, 11, true, false),140);
		assertEquals(swim.Price(7, 01, 1, 11, false, true),100);
		assertEquals(swim.Price(7, 01, 1, 11, false, false),160);
		
		assertEquals(swim.Price(7, 01, 1, 12, true, true),100);
		assertEquals(swim.Price(7, 01, 1, 12, true, false),140);
		assertEquals(swim.Price(7, 01, 1, 12, false, true),100);
		assertEquals(swim.Price(7, 01, 1, 12, false, false),200);
		
		assertEquals(swim.Price(7, 01, 1, 13, true, true),100);
		assertEquals(swim.Price(7, 01, 1, 13, true, false),140);
		assertEquals(swim.Price(7, 01, 1, 13, false, true),100);
		assertEquals(swim.Price(7, 01, 1, 13, false, false),200);
		
		assertEquals(swim.Price(7, 01, 1, 59, true, true),100);
		assertEquals(swim.Price(7, 01, 1, 59, true, false),140);
		assertEquals(swim.Price(7, 01, 1, 59, false, true),100);
		assertEquals(swim.Price(7, 01, 1, 59, false, false),200);
		
		assertEquals(swim.Price(7, 01, 1, 60, true, true),100);
		assertEquals(swim.Price(7, 01, 1, 60, true, false),140);
		assertEquals(swim.Price(7, 01, 1, 60, false, true),100);
		assertEquals(swim.Price(7, 01, 1, 60, false, false),160);
		
		assertEquals(swim.Price(7, 01, 1, 61, true, true),100);
		assertEquals(swim.Price(7, 01, 1, 61, true, false),140);
		assertEquals(swim.Price(7, 01, 1, 61, false, true),100);
		assertEquals(swim.Price(7, 01, 1, 61, false, false),160);
		
		assertEquals(swim.Price(7, 01, 1, 119, true, true),100);
		assertEquals(swim.Price(7, 01, 1, 119, true, false),140);
		assertEquals(swim.Price(7, 01, 1, 119, false, true),100);
		assertEquals(swim.Price(7, 01, 1, 119, false, false),160);
		
		assertEquals(swim.Price(7, 01, 1, 120, true, true),100);
		assertEquals(swim.Price(7, 01, 1, 120, true, false),140);
		assertEquals(swim.Price(7, 01, 1, 120, false, true),100);
		assertEquals(swim.Price(7, 01, 1, 120, false, false),160);
		
		assertEquals(swim.Price(7, 01, 1, 121, true, true),999);
		assertEquals(swim.Price(7, 01, 1, 121, true, false),999);
		assertEquals(swim.Price(7, 01, 1, 121, false, true),999);
		assertEquals(swim.Price(7, 01, 1, 121, false, false),999);
		// age over
		
		
		assertEquals(swim.Price(7, 01, 6, 25, true, true),125);
		assertEquals(swim.Price(7, 01, 6, 25, true, false),250);
		assertEquals(swim.Price(7, 01, 6, 25, false, true),125);
		assertEquals(swim.Price(7, 01, 6, 25, false, false),250);
		
		assertEquals(swim.Price(7, 01, 6, -1, true, true),999);
		assertEquals(swim.Price(7, 01, 6, -1, true, false),999);
		assertEquals(swim.Price(7, 01, 6, -1, false, true),999);
		assertEquals(swim.Price(7, 01, 6, -1, false, false),999);
		
		assertEquals(swim.Price(7, 01, 6, 0, true, true),125);
		assertEquals(swim.Price(7, 01, 6, 0, true, false),250);
		assertEquals(swim.Price(7, 01, 6, 0, false, true),125);
		assertEquals(swim.Price(7, 01, 6, 0, false, false),250);
		
		assertEquals(swim.Price(7, 01, 6, 1, true, true),125);
		assertEquals(swim.Price(7, 01, 6, 1, true, false),250);
		assertEquals(swim.Price(7, 01, 6, 1, false, true),125);
		assertEquals(swim.Price(7, 01, 6, 1, false, false),250);
		
		assertEquals(swim.Price(7, 01, 6, 11, true, true),125);
		assertEquals(swim.Price(7, 01, 6, 11, true, false),250);
		assertEquals(swim.Price(7, 01, 6, 11, false, true),125);
		assertEquals(swim.Price(7, 01, 6, 11, false, false),250);
		
		assertEquals(swim.Price(7, 01, 6, 12, true, true),125);
		assertEquals(swim.Price(7, 01, 6, 12, true, false),250);
		assertEquals(swim.Price(7, 01, 6, 12, false, true),125);
		assertEquals(swim.Price(7, 01, 6, 12, false, false),250);
		
		assertEquals(swim.Price(7, 01, 6, 13, true, true),125);
		assertEquals(swim.Price(7, 01, 6, 13, true, false),250);
		assertEquals(swim.Price(7, 01, 6, 13, false, true),125);
		assertEquals(swim.Price(7, 01, 6, 13, false, false),250);
		
		assertEquals(swim.Price(7, 01, 6, 59, true, true),125);
		assertEquals(swim.Price(7, 01, 6, 59, true, false),250);
		assertEquals(swim.Price(7, 01, 6, 59, false, true),125);
		assertEquals(swim.Price(7, 01, 6, 59, false, false),250);
		
		assertEquals(swim.Price(7, 01, 6, 60, true, true),125);
		assertEquals(swim.Price(7, 01, 6, 60, true, false),250);
		assertEquals(swim.Price(7, 01, 6, 60, false, true),125);
		assertEquals(swim.Price(7, 01, 6, 60, false, false),250);
		
		assertEquals(swim.Price(7, 01, 6, 61, true, true),125);
		assertEquals(swim.Price(7, 01, 6, 61, true, false),250);
		assertEquals(swim.Price(7, 01, 6, 61, false, true),125);
		assertEquals(swim.Price(7, 01, 6, 61, false, false),250);
		
		assertEquals(swim.Price(7, 01, 6, 119, true, true),125);
		assertEquals(swim.Price(7, 01, 6, 119, true, false),250);
		assertEquals(swim.Price(7, 01, 6, 119, false, true),125);
		assertEquals(swim.Price(7, 01, 6, 119, false, false),250);
		
		assertEquals(swim.Price(7, 01, 6, 120, true, true),125);
		assertEquals(swim.Price(7, 01, 6, 120, true, false),250);
		assertEquals(swim.Price(7, 01, 6, 120, false, true),125);
		assertEquals(swim.Price(7, 01, 6, 120, false, false),250);
		
		assertEquals(swim.Price(7, 01, 6, 121, true, true),999);
		assertEquals(swim.Price(7, 01, 6, 121, true, false),999);
		assertEquals(swim.Price(7, 01, 6, 121, false, true),999);
		assertEquals(swim.Price(7, 01, 6, 121, false, false),999);
		//week over
		
		//time 21:59
		assertEquals(swim.Price(21, 59, 1, 25, true, true),100);
		assertEquals(swim.Price(21, 59, 1, 25, true, false),140);
		assertEquals(swim.Price(21, 59, 1, 25, false, true),100);
		assertEquals(swim.Price(21, 59, 1, 25, false, false),200);
		
		assertEquals(swim.Price(21, 59, 1, -1, true, true),999);
		assertEquals(swim.Price(21, 59, 1, -1, true, false),999);
		assertEquals(swim.Price(21, 59, 1, -1, false, true),999);
		assertEquals(swim.Price(21, 59, 1, -1, false, false),999);
		
		assertEquals(swim.Price(21, 59, 1, 0, true, true),100);
		assertEquals(swim.Price(21, 59, 1, 0, true, false),140);
		assertEquals(swim.Price(21, 59, 1, 0, false, true),100);
		assertEquals(swim.Price(21, 59, 1, 0, false, false),160);
		
		assertEquals(swim.Price(21, 59, 1, 1, true, true),100);
		assertEquals(swim.Price(21, 59, 1, 1, true, false),140);
		assertEquals(swim.Price(21, 59, 1, 1, false, true),100);
		assertEquals(swim.Price(21, 59, 1, 1, false, false),160);
		
		assertEquals(swim.Price(21, 59, 1, 11, true, true),100);
		assertEquals(swim.Price(21, 59, 1, 11, true, false),140);
		assertEquals(swim.Price(21, 59, 1, 11, false, true),100);
		assertEquals(swim.Price(21, 59, 1, 11, false, false),160);
		
		assertEquals(swim.Price(21, 59, 1, 12, true, true),100);
		assertEquals(swim.Price(21, 59, 1, 12, true, false),140);
		assertEquals(swim.Price(21, 59, 1, 12, false, true),100);
		assertEquals(swim.Price(21, 59, 1, 12, false, false),200);
		
		assertEquals(swim.Price(21, 59, 1, 13, true, true),100);
		assertEquals(swim.Price(21, 59, 1, 13, true, false),140);
		assertEquals(swim.Price(21, 59, 1, 13, false, true),100);
		assertEquals(swim.Price(21, 59, 1, 13, false, false),200);
		
		assertEquals(swim.Price(21, 59, 1, 59, true, true),100);
		assertEquals(swim.Price(21, 59, 1, 59, true, false),140);
		assertEquals(swim.Price(21, 59, 1, 59, false, true),100);
		assertEquals(swim.Price(21, 59, 1, 59, false, false),200);
		
		assertEquals(swim.Price(21, 59, 1, 60, true, true),100);
		assertEquals(swim.Price(21, 59, 1, 60, true, false),140);
		assertEquals(swim.Price(21, 59, 1, 60, false, true),100);
		assertEquals(swim.Price(21, 59, 1, 60, false, false),160);
		
		assertEquals(swim.Price(21, 59, 1, 61, true, true),100);
		assertEquals(swim.Price(21, 59, 1, 61, true, false),140);
		assertEquals(swim.Price(21, 59, 1, 61, false, true),100);
		assertEquals(swim.Price(21, 59, 1, 61, false, false),160);
		
		assertEquals(swim.Price(21, 59, 1, 119, true, true),100);
		assertEquals(swim.Price(21, 59, 1, 119, true, false),140);
		assertEquals(swim.Price(21, 59, 1, 119, false, true),100);
		assertEquals(swim.Price(21, 59, 1, 119, false, false),160);
		
		assertEquals(swim.Price(21, 59, 1, 120, true, true),100);
		assertEquals(swim.Price(21, 59, 1, 120, true, false),140);
		assertEquals(swim.Price(21, 59, 1, 120, false, true),100);
		assertEquals(swim.Price(21, 59, 1, 120, false, false),160);
		
		assertEquals(swim.Price(21, 59, 1, 121, true, true),999);
		assertEquals(swim.Price(21, 59, 1, 121, true, false),999);
		assertEquals(swim.Price(21, 59, 1, 121, false, true),999);
		assertEquals(swim.Price(21, 59, 1, 121, false, false),999);
		// age over
		
		
		assertEquals(swim.Price(21, 59, 6, 25, true, true),125);
		assertEquals(swim.Price(21, 59, 6, 25, true, false),250);
		assertEquals(swim.Price(21, 59, 6, 25, false, true),125);
		assertEquals(swim.Price(21, 59, 6, 25, false, false),250);
		
		assertEquals(swim.Price(21, 59, 6, -1, true, true),999);
		assertEquals(swim.Price(21, 59, 6, -1, true, false),999);
		assertEquals(swim.Price(21, 59, 6, -1, false, true),999);
		assertEquals(swim.Price(21, 59, 6, -1, false, false),999);
		
		assertEquals(swim.Price(21, 59, 6, 0, true, true),125);
		assertEquals(swim.Price(21, 59, 6, 0, true, false),250);
		assertEquals(swim.Price(21, 59, 6, 0, false, true),125);
		assertEquals(swim.Price(21, 59, 6, 0, false, false),250);
		
		assertEquals(swim.Price(21, 59, 6, 1, true, true),125);
		assertEquals(swim.Price(21, 59, 6, 1, true, false),250);
		assertEquals(swim.Price(21, 59, 6, 1, false, true),125);
		assertEquals(swim.Price(21, 59, 6, 1, false, false),250);
		
		assertEquals(swim.Price(21, 59, 6, 11, true, true),125);
		assertEquals(swim.Price(21, 59, 6, 11, true, false),250);
		assertEquals(swim.Price(21, 59, 6, 11, false, true),125);
		assertEquals(swim.Price(21, 59, 6, 11, false, false),250);
		
		assertEquals(swim.Price(21, 59, 6, 12, true, true),125);
		assertEquals(swim.Price(21, 59, 6, 12, true, false),250);
		assertEquals(swim.Price(21, 59, 6, 12, false, true),125);
		assertEquals(swim.Price(21, 59, 6, 12, false, false),250);
		
		assertEquals(swim.Price(21, 59, 6, 13, true, true),125);
		assertEquals(swim.Price(21, 59, 6, 13, true, false),250);
		assertEquals(swim.Price(21, 59, 6, 13, false, true),125);
		assertEquals(swim.Price(21, 59, 6, 13, false, false),250);
		
		assertEquals(swim.Price(21, 59, 6, 59, true, true),125);
		assertEquals(swim.Price(21, 59, 6, 59, true, false),250);
		assertEquals(swim.Price(21, 59, 6, 59, false, true),125);
		assertEquals(swim.Price(21, 59, 6, 59, false, false),250);
		
		assertEquals(swim.Price(21, 59, 6, 60, true, true),125);
		assertEquals(swim.Price(21, 59, 6, 60, true, false),250);
		assertEquals(swim.Price(21, 59, 6, 60, false, true),125);
		assertEquals(swim.Price(21, 59, 6, 60, false, false),250);
		
		assertEquals(swim.Price(21, 59, 6, 61, true, true),125);
		assertEquals(swim.Price(21, 59, 6, 61, true, false),250);
		assertEquals(swim.Price(21, 59, 6, 61, false, true),125);
		assertEquals(swim.Price(21, 59, 6, 61, false, false),250);
		
		assertEquals(swim.Price(21, 59, 6, 119, true, true),125);
		assertEquals(swim.Price(21, 59, 6, 119, true, false),250);
		assertEquals(swim.Price(21, 59, 6, 119, false, true),125);
		assertEquals(swim.Price(21, 59, 6, 119, false, false),250);
		
		assertEquals(swim.Price(21, 59, 6, 120, true, true),125);
		assertEquals(swim.Price(21, 59, 6, 120, true, false),250);
		assertEquals(swim.Price(21, 59, 6, 120, false, true),125);
		assertEquals(swim.Price(21, 59, 6, 120, false, false),250);
		
		assertEquals(swim.Price(21, 59, 6, 121, true, true),999);
		assertEquals(swim.Price(21, 59, 6, 121, true, false),999);
		assertEquals(swim.Price(21, 59, 6, 121, false, true),999);
		assertEquals(swim.Price(21, 59, 6, 121, false, false),999);
		//week over
		
		
		//time 22:00
		assertEquals(swim.Price(22, 00, 1, 25, true, true),100);
		assertEquals(swim.Price(22, 00, 1, 25, true, false),140);
		assertEquals(swim.Price(22, 00, 1, 25, false, true),100);
		assertEquals(swim.Price(22, 00, 1, 25, false, false),200);
		
		assertEquals(swim.Price(22, 00, 1, -1, true, true),999);
		assertEquals(swim.Price(22, 00, 1, -1, true, false),999);
		assertEquals(swim.Price(22, 00, 1, -1, false, true),999);
		assertEquals(swim.Price(22, 00, 1, -1, false, false),999);
		
		assertEquals(swim.Price(22, 00, 1, 0, true, true),100);
		assertEquals(swim.Price(22, 00, 1, 0, true, false),140);
		assertEquals(swim.Price(22, 00, 1, 0, false, true),100);
		assertEquals(swim.Price(22, 00, 1, 0, false, false),160);
		
		assertEquals(swim.Price(22, 00, 1, 1, true, true),100);
		assertEquals(swim.Price(22, 00, 1, 1, true, false),140);
		assertEquals(swim.Price(22, 00, 1, 1, false, true),100);
		assertEquals(swim.Price(22, 00, 1, 1, false, false),160);
		
		assertEquals(swim.Price(22, 00, 1, 11, true, true),100);
		assertEquals(swim.Price(22, 00, 1, 11, true, false),140);
		assertEquals(swim.Price(22, 00, 1, 11, false, true),100);
		assertEquals(swim.Price(22, 00, 1, 11, false, false),160);
		
		assertEquals(swim.Price(22, 00, 1, 12, true, true),100);
		assertEquals(swim.Price(22, 00, 1, 12, true, false),140);
		assertEquals(swim.Price(22, 00, 1, 12, false, true),100);
		assertEquals(swim.Price(22, 00, 1, 12, false, false),200);
		
		assertEquals(swim.Price(22, 00, 1, 13, true, true),100);
		assertEquals(swim.Price(22, 00, 1, 13, true, false),140);
		assertEquals(swim.Price(22, 00, 1, 13, false, true),100);
		assertEquals(swim.Price(22, 00, 1, 13, false, false),200);
		
		assertEquals(swim.Price(22, 00, 1, 59, true, true),100);
		assertEquals(swim.Price(22, 00, 1, 59, true, false),140);
		assertEquals(swim.Price(22, 00, 1, 59, false, true),100);
		assertEquals(swim.Price(22, 00, 1, 59, false, false),200);
		
		assertEquals(swim.Price(22, 00, 1, 60, true, true),100);
		assertEquals(swim.Price(22, 00, 1, 60, true, false),140);
		assertEquals(swim.Price(22, 00, 1, 60, false, true),100);
		assertEquals(swim.Price(22, 00, 1, 60, false, false),160);
		
		assertEquals(swim.Price(22, 00, 1, 61, true, true),100);
		assertEquals(swim.Price(22, 00, 1, 61, true, false),140);
		assertEquals(swim.Price(22, 00, 1, 61, false, true),100);
		assertEquals(swim.Price(22, 00, 1, 61, false, false),160);
		
		assertEquals(swim.Price(22, 00, 1, 119, true, true),100);
		assertEquals(swim.Price(22, 00, 1, 119, true, false),140);
		assertEquals(swim.Price(22, 00, 1, 119, false, true),100);
		assertEquals(swim.Price(22, 00, 1, 119, false, false),160);
		
		assertEquals(swim.Price(22, 00, 1, 120, true, true),100);
		assertEquals(swim.Price(22, 00, 1, 120, true, false),140);
		assertEquals(swim.Price(22, 00, 1, 120, false, true),100);
		assertEquals(swim.Price(22, 00, 1, 120, false, false),160);
		
		assertEquals(swim.Price(22, 00, 1, 121, true, true),999);
		assertEquals(swim.Price(22, 00, 1, 121, true, false),999);
		assertEquals(swim.Price(22, 00, 1, 121, false, true),999);
		assertEquals(swim.Price(22, 00, 1, 121, false, false),999);
		// age over
		
		
		assertEquals(swim.Price(22, 00, 6, 25, true, true),125);
		assertEquals(swim.Price(22, 00, 6, 25, true, false),250);
		assertEquals(swim.Price(22, 00, 6, 25, false, true),125);
		assertEquals(swim.Price(22, 00, 6, 25, false, false),250);
		
		assertEquals(swim.Price(22, 00, 6, -1, true, true),999);
		assertEquals(swim.Price(22, 00, 6, -1, true, false),999);
		assertEquals(swim.Price(22, 00, 6, -1, false, true),999);
		assertEquals(swim.Price(22, 00, 6, -1, false, false),999);
		
		assertEquals(swim.Price(22, 00, 6, 0, true, true),125);
		assertEquals(swim.Price(22, 00, 6, 0, true, false),250);
		assertEquals(swim.Price(22, 00, 6, 0, false, true),125);
		assertEquals(swim.Price(22, 00, 6, 0, false, false),250);
		
		assertEquals(swim.Price(22, 00, 6, 1, true, true),125);
		assertEquals(swim.Price(22, 00, 6, 1, true, false),250);
		assertEquals(swim.Price(22, 00, 6, 1, false, true),125);
		assertEquals(swim.Price(22, 00, 6, 1, false, false),250);
		
		assertEquals(swim.Price(22, 00, 6, 11, true, true),125);
		assertEquals(swim.Price(22, 00, 6, 11, true, false),250);
		assertEquals(swim.Price(22, 00, 6, 11, false, true),125);
		assertEquals(swim.Price(22, 00, 6, 11, false, false),250);
		
		assertEquals(swim.Price(22, 00, 6, 12, true, true),125);
		assertEquals(swim.Price(22, 00, 6, 12, true, false),250);
		assertEquals(swim.Price(22, 00, 6, 12, false, true),125);
		assertEquals(swim.Price(22, 00, 6, 12, false, false),250);
		
		assertEquals(swim.Price(22, 00, 6, 13, true, true),125);
		assertEquals(swim.Price(22, 00, 6, 13, true, false),250);
		assertEquals(swim.Price(22, 00, 6, 13, false, true),125);
		assertEquals(swim.Price(22, 00, 6, 13, false, false),250);
		
		assertEquals(swim.Price(22, 00, 6, 59, true, true),125);
		assertEquals(swim.Price(22, 00, 6, 59, true, false),250);
		assertEquals(swim.Price(22, 00, 6, 59, false, true),125);
		assertEquals(swim.Price(22, 00, 6, 59, false, false),250);
		
		assertEquals(swim.Price(22, 00, 6, 60, true, true),125);
		assertEquals(swim.Price(22, 00, 6, 60, true, false),250);
		assertEquals(swim.Price(22, 00, 6, 60, false, true),125);
		assertEquals(swim.Price(22, 00, 6, 60, false, false),250);
		
		assertEquals(swim.Price(22, 00, 6, 61, true, true),125);
		assertEquals(swim.Price(22, 00, 6, 61, true, false),250);
		assertEquals(swim.Price(22, 00, 6, 61, false, true),125);
		assertEquals(swim.Price(22, 00, 6, 61, false, false),250);
		
		assertEquals(swim.Price(22, 00, 6, 119, true, true),125);
		assertEquals(swim.Price(22, 00, 6, 119, true, false),250);
		assertEquals(swim.Price(22, 00, 6, 119, false, true),125);
		assertEquals(swim.Price(22, 00, 6, 119, false, false),250);
		
		assertEquals(swim.Price(22, 00, 6, 120, true, true),125);
		assertEquals(swim.Price(22, 00, 6, 120, true, false),250);
		assertEquals(swim.Price(22, 00, 6, 120, false, true),125);
		assertEquals(swim.Price(22, 00, 6, 120, false, false),250);
		
		assertEquals(swim.Price(22, 00, 6, 121, true, true),999);
		assertEquals(swim.Price(22, 00, 6, 121, true, false),999);
		assertEquals(swim.Price(22, 00, 6, 121, false, true),999);
		assertEquals(swim.Price(22, 00, 6, 121, false, false),999);
		//week over
	}
}

/*
 * The class to be tested
 */
class Swim {

	public int Price(int hour, int min, int week, int age, boolean group, boolean vip){
		//close time 22:01~4:59 age in 0~120 week in 1~7 min in 0~59
		if(hour<5 || hour>22 || min<0 || min>59 || week<1 || week>7 || age<0 || age>120)
			return 999;
		else if(hour==22 && min>0) return 999; //22:01~22:59 close
		else if(vip && week>=1 && week<=5) return 100; //Vip discounts 50% Normal days cost 200 = 100
		else if(vip && week>=6 && week<=7) return 125; //Vip discounts 50% Rest days cost 250 = 125
		else if(group && week>=1 && week<=5) return 140; //Group discounts 70% Normal days cost 200 = 140
		else if(group && week>=6 && week<=7) return 250; //Rest days cost 250 without Vip
		else if(hour<7 || age<12 || age>=60){ //discounts 80% 
			if(week>=1 && week<=5) return 160;
			else return 250;
		}
		else if(week>=1 && week<=5) return 200; //Normal day cost 200
		else return 250; //Rest days cost 250
	}
	
}
