package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Resta;

public class TestResta {

	@Test
	public void testRes2() {
		assertEquals(0, Resta.res(2, 2));
	}
	
	@Test
	public void testRes3() {
		assertEquals(0, Resta.res(6, 2, 4));
	}
	
 	@Test
 	public void testNeg() {
 		assertEquals(1, Resta.res(2, 2, 2));
 	}
 	
 	@Test
 	public void testNumNeg() {
 		assertEquals(6, Resta.res(2, -2, -2));
 	}

}
