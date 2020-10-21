package com.codex;

import java.util.Random;

public class SnakesAndLadders 
{	
	static int playerOne = 0;
	private static Random rand = new Random();
	public void diceRoll()
	{
		 	int roll = rand.nextInt(6) + 1;
		 	System.out.println("Player One : " +playerOne);

				 	if (playerOne  == 100)
					 {
						 System.exit(0);
					 } 
				 	
					if (playerOne + roll > 100)
					 {
						roll = 0;
						playerOne=playerOne + roll;
					
					 }
					
				 	if (playerOne < 100)
				 	{
				 		playerOne = playerOne + roll;
				 		System.out.println("Player One Rolled : "+roll);
				 	}

 	}

	public void playGame()
	{
		while(true) 
		{
			diceRoll();
		}
		
	}
	
	public static void main(String[] args) {
		SnakesAndLadders object = new SnakesAndLadders();
		object.playGame();
	}

}

//UC2
