package com.techlab.pigdice;
import java.util.Random;
import java.util.Scanner;

public class PigDiceTest {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		Random rand = new Random(); 
		System.out.println("Let's Play PIG!");
		System.out.println("* See how many turns it takes you to get 20");
		System.out.println("Turn ends whn you hold or roll a 1");
		System.out.println("If you roll a 1, you will lose all points for the turn");
		System.out.println("If you hold, you save all points for the turn");

		int max_score=20,turn=1,total_score=0,score=0;
		char myinput;
		
		
		while(total_score<max_score)
		{
			System.out.println("\nTURN "+turn);
			boolean ans=true;
			while(ans==true)
			{
				//System.out.println("TURN "+turn);
				System.out.print("Roll or hold? (r/h) : ");
				myinput = sc.next().charAt(0);
				if(myinput=='r') {
					int die = rand.nextInt(6)+1; 
					System.out.println("Die : "+die);
					if(die>1)
					{
						score=score+die;
						ans=true;
					}
					else
					{
						System.out.println("Turn over. No score.");
						score=0;
						turn++;
						break;
					}
				}
				if(myinput=='h') {
					System.out.println("Score for turn : "+score);
					total_score+=score;
					score=0;
					System.out.println("Total score : "+total_score);
					turn++;
					break;
				}
				
			}
		}
		turn--;
		System.out.println("You finished in "+turn+" turns!");
		System.out.println("Game over!");
	}
}
