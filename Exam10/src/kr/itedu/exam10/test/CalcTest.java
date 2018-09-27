package kr.itedu.exam10.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import kr.itedu.ex10.Calc;

class CalcTest {

	@Test
	void test() {
		assertEquals(3,Calc.sum(1, 2));
		assertEquals(4,Calc.sum(2, 2));
		assertEquals(5,Calc.sum(3, 2));
		
	}

}
