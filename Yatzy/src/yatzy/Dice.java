package yatzy;

public class Dice {

	
	private int result;

	public Dice() {
		result = 0;
	}

	public void roll() {

		int max = 6;
		int min = 1;
		int roll = (int) (Math.random() * (max - min + 1) + min);

		
		result = roll;

	}

	public int getResult() {
		return result;
	}

}
