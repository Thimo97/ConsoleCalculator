package ch.bbw.consolecalculator;

import static org.junit.Assert.*;

import org.junit.Test;



public class CalculatorTest {
	Calculator testee;
	
	@Test
	public void testSummeZweiPositiveIsOk() {
		testee = new Calculator();
		assertTrue(testee.summe(10, 25) == 35);
	}
	
	@Test
	public void testSubZweiPositiveIsOk() {
		testee = new Calculator();
		assertTrue(testee.minus(50, 25) == 25);
	}
	
	@Test
	public void testSubZweiPositiveIsWrong(){
		testee = new Calculator();
		assertTrue(testee.minus(20, 88) != 88);
	}
}
