package yatzy;

public class ResultGenerator {

	public int getResult(int[] diceRolls, int row) {

		int result = 0;

		if (row == 13) {

		} else if (row == 14) {

		}

		for (int i = 0; i < diceRolls.length; i++) {
			result += diceRolls[i];
		}
		return result;

	}

}
