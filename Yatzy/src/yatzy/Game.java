package yatzy;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		Dice[] playerDice = new Dice[5];

		for (int i = 0; i < 5; i++) {
			playerDice[i] = new Dice();
		} // Skapar fem t�rningar i en array

		int result;

		for (int i = 0; i < 5; i++) {
			playerDice[i].roll();
			result = playerDice[i].getResult();
			System.out.println("T�rning nr " + (i + 1) + " �r en " + result + ":a");
		}
		int reroll = 0;
		while (reroll < 2) {
			System.out.println("Vill du sl� om en eller flera t�rningar?");
			System.out.println();
			Scanner scanReroll = new Scanner(System.in);
			String choice = scanReroll.nextLine();
			choice.toLowerCase();

			switch (choice) {
			case "j", "ja":
				reroll++;
				Scanner scan = new Scanner(System.in);
				System.out.println("\nAnge t�rningar att sl� om, separerade med mellanslag.\n");

				String input = scan.nextLine();
				String[] stringReRoll = input.split(" ");

				int[] reRoll = new int[stringReRoll.length];
				for (int i = 0; i < stringReRoll.length; i++) {
					reRoll[i] = Integer.parseInt(stringReRoll[i]);
					playerDice[reRoll[i] - 1].roll();

				}
				for (int i = 0; i < 5; i++) {
					result = playerDice[i].getResult();
					System.out.println("T�rning nr " + (i + 1) + " �r en " + result + ":a");
				}
				break;
			case "nej", "n":
				reroll = 2;
				break;
			default:
			}

		}
	}
}
