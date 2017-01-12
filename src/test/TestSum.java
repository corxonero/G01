package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Sum;

public class TestSum {
	
	 	@Test
	 	public void testSum2() {
	 		assertEquals(4, Sum.sum(2, 2));
	 	}
	 	
	 	@Test
	 	public void testSum3() {
	 		assertEquals(6, Sum.sum(2, 2, 2));
	 	}
	 	
	 	@Test
	 	public void testNeg() {
	 		assertEquals(8, Sum.sum(2, 2, 2));
	 	}
	 	
	 	@Test
	 	public void testNumNeg() {
	 		assertEquals(2, Sum.sum(2, -2, 2));
	 	}
}
