package SnakeLadder;

public class snakeLadderProblem {
/**
 * 
 * @param args
 */
	public static final int WINNING_POSITION =100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Snakes & Ladders Game");
	int playerPosition =0;
	System.out.println("player position is " + playerPosition);
		System.out.println("Roll Dice to Move");
		while(playerPosition != WINNING_POSITION) {
			int dice = (int)(Math.floor((Math.random()*6)+1));
			int chance = (int) Math.floor(Math.random()*3);
		if (chance == 0) {
			System.out.println("No Play");
			playerPosition = playerPosition;
		}
		else if (chance == 1) {
			System.out.println("Got a Ladder");
			if (playerPosition < WINNING_POSITION ) {
				playerPosition = playerPosition + dice;
			}
			else {
				playerPosition = playerPosition;
			}
		}
		else {
			System.out.println("Hit with a Snake");
			playerPosition = playerPosition - dice ;
			if (playerPosition < 0 ) {
				playerPosition =0;
			}
		}
			System.out.println("player actual Position is " + playerPosition);
		}
	}

} 