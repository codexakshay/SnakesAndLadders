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
						 winPlayer();
					 } 
					
				 	if (playerOne < 100)
				 	{
				 		playerOne = playerOne + roll;
				 		System.out.println("Player One Rolled : "+roll);
				 	}
					
						if (playerOne + roll > 100)
					{
						roll = 0;
						playerOne=playerOne + roll;
					}

 	}

	public void snakeBites()
	{
		/*
		51-11	56-15	62-57	26-5	75-25	92-42	98-8	 
		 */
		if(playerOne==51)
		{
			System.out.println("Snake Bite --> Player One , Now You are on 11");
			playerOne=11;
		}
		
		if(playerOne==56)
		{
			System.out.println("Snake Bite --> Player One , Now You are on 15");
			playerOne=15;
		}
		
		if(playerOne==62)
		{
			System.out.println("Snake Bite --> Player One , Now You are on 57");
			playerOne=57;
		}
		
		if(playerOne==26)
		{
			System.out.println("Snake Bite --> Player One , Now You are on 5");
			playerOne=5;
		}
		
		if(playerOne==75)
		{
			System.out.println("Snake Bite --> Player One , Now You are on 25");
			playerOne=25;
		}
		
		if(playerOne==92)
		{
			System.out.println("Snake Bite --> Player One , Now You are on 42");
			playerOne=42;
		}
		
		if(playerOne==98)
		{
			System.out.println("Snake Bite --> Player One , Now You are on 8");
			playerOne=8;
		}
	}

	public void ladderUps()
	{
		/*
		2-38	4-14	9-31	17-41	33-85	52-88	80-99	
		 */

		if(playerOne==2)
		{
			System.out.println("Climbed Ladder --> Player One , Now You are on 38");
			playerOne=38;
			
		}
		
		if(playerOne==4)
		{
			System.out.println("Climbed Ladder --> Player One , Now You are on 14");
			playerOne=14;
			
		}
		
		if(playerOne==9)
		{
			System.out.println("Climbed Ladder --> Player One , Now You are on 31");
			playerOne=31;
			playerOneTurn=playerOneTurn-1;
		}
		
		if(playerOne==17)
		{
			System.out.println("Climbed Ladder --> Player One , Now You are on 41");
			playerOne=41;
			
		}
		
		if(playerOne==33)
		{
			System.out.println("Climbed Ladder --> Player One , Now You are on 85");
			playerOne=85;
			
		}
		
		if(playerOne==52)
		{
			System.out.println("Climbed Ladder --> Player One , Now You are on 88");
			playerOne=88;
		
		}
		
		if(playerOne==80)
		{
			System.out.println("Climbed Ladder --> Player One , Now You are on 99");
			playerOne=99;
			
		}
	}
	
	public void winPlayer()
	{
		System.out.print("\nPLAYER WON");
		System.exit(0);
	}

	public void playGame()
	{
		while(true) 
		{
			diceRoll();
			ladderUps();
			snakeBites();
		}
		
	}
	
	public static void main(String[] args) {
		SnakesAndLadders object = new SnakesAndLadders();
		object.playGame();
	}

}


//UC5
