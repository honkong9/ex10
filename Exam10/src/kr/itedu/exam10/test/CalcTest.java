package kr.itedu.exam10.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import kr.itedu.ex10.Calc;

class CalcTest {

	@Test
	void test() {
		Calc ca = new Calc();
		assertEquals(3,ca.sum(1, 2));
		
	}

}
