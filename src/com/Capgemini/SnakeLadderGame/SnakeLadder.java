package com.Capgemini.SnakeLadderGame;

public class SnakeLadder {

	public static final int No_game = 0;
	public static final int Ladder = 1;
	public static final int Snake = 2;
	public static int playerPosition = 0;
	public static int numberOnDice = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
		SnakeLadder sl = new SnakeLadder();
		System.out.println("Welcome to this Snake & Ladder Game");
		System.out.println("Let's Roll The Dice");
		while (playerPosition <= 100) {
			count++;
			numberOnDice = (int) (Math.random() * 7) + 1;
			System.out.println("Number On Dice After Rolling :" + numberOnDice);
			sl.checkOption();
			if (playerPosition < 0) {
				playerPosition = 0;
			}
			if (playerPosition > 100) {
				playerPosition -= numberOnDice;
			}
			System.out.println("Player Position after rolling the dice " +count+ " No. of times is " +playerPosition);

		}
		System.out.println("No. Of Times The Dice Was Rolled For Winning : "+count);
	}

	public void checkOption() {
		int option = (int) (Math.random() * 3);

		switch (option) {
		case No_game:
			break;

		case Ladder:
			playerPosition += numberOnDice;
			break;

		case Snake:
			playerPosition -= numberOnDice;
			break;

		}
	}

}
