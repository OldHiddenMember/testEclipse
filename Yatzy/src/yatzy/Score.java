package yatzy;

import java.util.Arrays;

public class Score {
	int score = 0;

	public int setScore(int[] diceRoll, int row) {
		score = 0;
		Arrays.sort(diceRoll);
		switch (row) {
		case 1:
			for (int i : diceRoll) {
				if (i == 1) {
					score += i;
				}
			}
			break;
		case 2:
			for (int i : diceRoll) {
				if (i == 2) {
					score += i;
				}
			}
			break;
		case 3:
			for (int i : diceRoll) {
				if (i == 3) {
					score += i;
				}
			}
			break;
		case 4:
			for (int i : diceRoll) {
				if (i == 4) {
					score += i;
				}
			}
			break;
		case 5:
			for (int i : diceRoll) {
				if (i == 5) {
					score += i;
				}
			}
			break;
		case 6:
			for (int i : diceRoll) {
				if (i == 6) {
					score += i;
				}
			}
			break;

		case 7: // ett par
			for (int i = 0; i < 4; i++) {
				if (diceRoll[i] == diceRoll[i+1]) {
					score = diceRoll[i] * 2;
				}
			}

			break;
			
		case 8: // två par
			boolean twoPairs = false;
			for (int i = 0; i < 4; i++) {
				if (diceRoll[i] == diceRoll[i+1]) {
					score += (diceRoll[i] * 2);
				}
			}
			break;
		case 11: // liten stege

			for (int i = 0; i < diceRoll.length; i++) {
				if (diceRoll[i] == i + 1) {
					score = 15;
				} else {
					score = 0;
					break;
				}

			}
			break;

		case 12: // stor stege

			for (int i = 0; i < diceRoll.length; i++) {
				if (diceRoll[i] == i + 2) {
					score = 20;
				} else {
					score = 0;
					break;
				}

			}
			break;
		case 13: // kåk

			if (diceRoll[0] == diceRoll[1] && diceRoll[2] == diceRoll[3] && diceRoll[2] == diceRoll[4]
					|| diceRoll[0] == diceRoll[1] && diceRoll[0] == diceRoll[2] && diceRoll[3] == diceRoll[4])
				; {
			for (int i : diceRoll) {
				score += i;
			}
		}

			break;
		case 14:
			for (int i : diceRoll) {
				score += i;
			}
			break;
		case 15: // yatzy

		}
		return score;
	}
}