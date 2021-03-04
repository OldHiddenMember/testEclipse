package yatzy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ScoreTest {

	@Test
	void testChanceReturns17() {

		// arrange
		int[] diceRoll = { 5, 6, 2, 1, 3 };
		Score newScore = new Score();

		// act
		int result = newScore.setScore(diceRoll, 14);
		// assert
		assertEquals(17, result);
	}

	@Test
	void testOnesReturns4() {

		// arrange
		int[] diceRoll = { 5, 1, 1, 1, 1 };
		Score newScore = new Score();

		// act
		int result = newScore.setScore(diceRoll, 1);
		// assert
		assertEquals(4, result);
	}

	@Test
	void testOnesReturns0() {

		// arrange
		int[] diceRoll = { 5, 2, 3, 3, 2 };
		Score newScore = new Score();

		// act
		int result = newScore.setScore(diceRoll, 1);
		// assert
		assertEquals(0, result);
	}

	@Test
	void testTwosReturns6() {

		// arrange
		int[] diceRoll = { 4, 2, 2, 1, 2 };
		Score newScore = new Score();

		// act
		int result = newScore.setScore(diceRoll, 2);
		// assert
		assertEquals(6, result);
	}

	@Test
	void testThreesReturns6() {

		// arrange
		int[] diceRoll = { 3, 3, 2, 1, 2 };
		Score newScore = new Score();

		// act
		int result = newScore.setScore(diceRoll, 3);
		// assert
		assertEquals(6, result);
	}

	@Test
	void testFoursReturns16() {

		// arrange
		int[] diceRoll = { 4, 2, 4, 4, 4 };
		Score newScore = new Score();

		// act
		int result = newScore.setScore(diceRoll, 4);
		// assert
		assertEquals(16, result);
	}

	@Test
	void testFivesReturns15() {

		// arrange
		int[] diceRoll = { 4, 2, 5, 5, 5 };
		Score newScore = new Score();

		// act
		int result = newScore.setScore(diceRoll, 5);
		// assert
		assertEquals(15, result);
	}

	@Test
	void testSixesReturns12() {

		// arrange
		int[] diceRoll = { 6, 2, 6, 1, 2 };
		Score newScore = new Score();

		// act
		int result = newScore.setScore(diceRoll, 6);
		// assert
		assertEquals(12, result);
	}

	@Test
	void testSmallStraightReturns15() {

		// arrange
		int[] diceRoll = { 2, 5, 3, 1, 4 };
		Score newScore = new Score();

		// act
		int result = newScore.setScore(diceRoll, 11);
		// assert
		assertEquals(15, result);
	}

	@Test
	void testInvalidSmallStraightReturns0() {

		// arrange
		int[] diceRoll = { 2, 5, 3, 6, 4 };
		Score newScore = new Score();

		// act
		int result = newScore.setScore(diceRoll, 11);
		// assert
		assertEquals(0, result);
	}

	@Test
	void testLargeStraightReturns20() {

		// arrange
		int[] diceRoll = { 2, 5, 3, 6, 4 };
		Score newScore = new Score();

		// act
		int result = newScore.setScore(diceRoll, 12);
		// assert
		assertEquals(20, result);
	}

	@Test
	void testInvalidLargeStraightReturns0() {

		// arrange
		int[] diceRoll = { 2, 5, 3, 1, 4 };
		Score newScore = new Score();

		// act
		int result = newScore.setScore(diceRoll, 12);
		// assert
		assertEquals(0, result);
	}
	@Test
	void testFullHouseReturns19() {

		// arrange
		int[] diceRoll = { 3, 5, 3, 3, 5 };
		Score newScore = new Score();

		// act
		int result = newScore.setScore(diceRoll, 13);
		// assert
		assertEquals(19, result);
	}

	@Test
	void testSinglePairTwoHitsReturns10() {

		// arrange
		int[] diceRoll = { 3, 5, 4, 4, 5 };
		Score newScore = new Score();

		// act
		int result = newScore.setScore(diceRoll, 7);
		// assert
		assertEquals(10, result);
	}
	@Test
	void testSinglePairZeroHitsReturns0() {

		// arrange
		int[] diceRoll = { 3, 5, 4, 1, 6 };
		Score newScore = new Score();

		// act
		int result = newScore.setScore(diceRoll, 7);
		// assert
		assertEquals(0, result);
	}
	@Test
	void testSinglePairSameHitTwiceReturns8() {

		// arrange
		int[] diceRoll = { 4, 5, 4, 4, 4 };
		Score newScore = new Score();

		// act
		int result = newScore.setScore(diceRoll, 7);
		// assert
		assertEquals(8, result);
	}
	@Test
	void testDoublePairReturns16() {

		// arrange
		int[] diceRoll = { 4, 5, 4, 4, 4 };
		Score newScore = new Score();

		// act
		int result = newScore.setScore(diceRoll, 8);
		// assert
		assertEquals(16, result);
	}
}
