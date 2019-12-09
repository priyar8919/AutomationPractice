/**
 * 
 */
package JUnitDemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitIntroduction {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Runs before class");
	}


	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Runs after class");
	}


	@Before
	public void setUp() throws Exception {
		System.out.println("Runs before every test");
	}


	@After
	public void tearDown() throws Exception {
		System.out.println("Runs After every test");
	}

	@Test
	public void test1() {
		System.out.println("Runs test1");
		//fail("Not yet implemented");
	}
	
	@Test
	public void test2() {
		System.out.println("Runs test2");
		//fail("Not yet implemented");
	}

}
