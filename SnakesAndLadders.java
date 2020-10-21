package com.codex;

import java.util.Random;

public class SnakesAndLadders 
{
	static int playerOne = 0;
	static int playerTwo = 0;
	
	static int playerOneTurn = 0;
	static int playerTwoTurn = 0;
	
	static int turnSwap = 0;
    
	private static Random rand = new Random();
    static int Turn = 0;
		
	public void diceRoll()
	{
		 	int roll = rand.nextInt(6) + 1;
		 	System.out.println("Player One : " +playerOne);
		 	System.out.println("Player Two : " +playerTwo);
		 	
		 	if(playerOneTurn <= playerTwoTurn)
		 	{
				 	if (playerOne  == 100)
					 {
						 winPlayer(1);
					 } 
				 	
					if (playerOne + roll > 100)
					 {
						roll = 0;
						playerOne=playerOne + roll;
					
					 }
					
				 	if (playerOne < 100)
				 	{
				 		Turn = Turn + 1;
				 		System.out.println("\nTurn : " + Turn);
				 		playerOne = playerOne + roll;
				 		System.out.println("Player One Rolled : "+roll);
				 	}
				 	playerOneTurn=playerOneTurn+1;
		 	}
		 	else
		 	{
		 			
			 	 	if (playerTwo  == 100)
					 {
						 winPlayer(2);
					 } 
				 	
					if (playerTwo + roll > 100)
					 {
						roll = 0;
						playerTwo=playerTwo + roll;
					
					 }
					
				 	if (playerTwo < 100)
				 	{
				 		Turn = Turn + 1;
				 		System.out.println("\nTurn : " + Turn);
				 		playerTwo = playerTwo + roll;
				 		System.out.println("Player Two Rolled : "+roll);
				 	}
				 	playerTwoTurn=playerTwoTurn+1;
		 		
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
		
		
		//Player Two
		
		if(playerTwo==51)
		{
			System.out.println("Snake Bite --> Player Two , Now You are on 11");
			playerTwo=11;
		}
		
		if(playerTwo==56)
		{
			System.out.println("Snake Bite --> Player Two , Now You are on 15");
			playerTwo=15;
		}
		
		if(playerTwo==62)
		{
			System.out.println("Snake Bite --> Player Two , Now You are on 57");
			playerTwo=57;
		}
		
		if(playerTwo==26)
		{
			System.out.println("Snake Bite --> Player Two , Now You are on 5");
			playerTwo=5;
		}
		
		if(playerTwo==75)
		{
			System.out.println("Snake Bite --> Player Two , Now You are on 25");
			playerTwo=25;
		}
		
		if(playerTwo==92)
		{
			System.out.println("Snake Bite --> Player Two , Now You are on 42");
			playerTwo=42;
		}
		
		if(playerTwo==98)
		{
			System.out.println("Snake Bite --> Player Two , Now You are on 8");
			playerTwo=8;
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
			playerOneTurn=playerOneTurn-1;
		}
		
		if(playerOne==4)
		{
			System.out.println("Climbed Ladder --> Player One , Now You are on 14");
			playerOne=14;
			playerOneTurn=playerOneTurn-1;
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
			playerOneTurn=playerOneTurn-1;
		}
		
		if(playerOne==33)
		{
			System.out.println("Climbed Ladder --> Player One , Now You are on 85");
			playerOne=85;
			playerOneTurn=playerOneTurn-1;
		}
		
		if(playerOne==52)
		{
			System.out.println("Climbed Ladder --> Player One , Now You are on 88");
			playerOne=88;
			playerOneTurn=playerOneTurn-1;
		}
		
		if(playerOne==80)
		{
			System.out.println("Climbed Ladder --> Player One , Now You are on 99");
			playerOne=99;
			playerOneTurn=playerOneTurn-1;
		}
		
		//Player Two ladder
		
		if(playerTwo==2)
		{
			System.out.println("Climbed Ladder --> Player Two , Now You are on 38");
			playerTwo=38;
			playerTwoTurn=playerTwoTurn-1;
		}
		
		if(playerTwo==4)
		{
			System.out.println("Climbed Ladder --> Player Two , Now You are on 14");
			playerTwo=14;
			playerTwoTurn=playerTwoTurn-1;
		}
		
		if(playerTwo==9)
		{
			System.out.println("Climbed Ladder --> Player Two , Now You are on 31");
			playerTwo=31;
			playerTwoTurn=playerTwoTurn-1;
		}
		
		if(playerTwo==17)
		{
			System.out.println("Climbed Ladder --> Player Two , Now You are on 41");
			playerTwo=41;
			playerTwoTurn=playerTwoTurn-1;
		}
		
		if(playerTwo==33)
		{
			System.out.println("Climbed Ladder --> Player Two , Now You are on 85");
			playerTwo=85;
			playerTwoTurn=playerTwoTurn-1;
		}
		
		if(playerTwo==52)
		{
			System.out.println("Climbed Ladder --> Player Two , Now You are on 88");
			playerTwo=88;
			playerTwoTurn=playerTwoTurn-1;
		}
		
		if(playerTwo==80)
		{
			System.out.println("Climbed Ladder --> Player Two , Now You are on 99");
			playerTwo=99;
			playerTwoTurn=playerTwoTurn-1;
		}
		
	}
	
	public void winPlayer(int i)
	{
		if(i == 1)
		{
			System.out.print("\nPLAYER ONE WON");
			System.exit(0);
		}
		if(i == 2)
		{
			System.out.print("\nPLAYER TWO WON");
			System.exit(0);
		}
		
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

//MASTER
