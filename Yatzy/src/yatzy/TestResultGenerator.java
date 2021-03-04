package yatzy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestResultGenerator {

	@Test
	void testChansReturns19() {
		int[] diceRolls = { 6, 3, 1, 4, 5 };
		ResultGenerator gen = new ResultGenerator();
		int result = gen.getResult(diceRolls, 14);

		assertEquals(19, result);
	}

	@Test
	void testChansReturns21() {
		int[] diceRolls = { 1, 6, 4, 5, 5 };
		ResultGenerator gen = new ResultGenerator();
		int result = gen.getResult(diceRolls, 14);

		assertEquals(21, result);
	}

	@Test
	void testChansReturnsFullhouse28() {
		int[] diceRolls = { 6, 6, 6, 5, 5 };
		ResultGenerator gen = new ResultGenerator();
		int result = gen.getResult(diceRolls, 13);

		assertEquals(28, result);
	}

	@Test
	void testChansReturnsFullhouse0() {
		int[] diceRolls = { 6, 6, 4, 5, 5 };
		ResultGenerator gen = new ResultGenerator();
		int result = gen.getResult(diceRolls, 13);

		assertEquals(0, result);
	}
}
