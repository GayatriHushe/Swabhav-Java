package com.techlab.guess;
import java.util.Scanner;
import java.util.Random; 
public class FirstGameTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Guess the number!");
		System.out.println("I'm thinking of a number from 1 to 10");
		Random rand = new Random(); 
		int num = rand.nextInt(10)+1; 
		int count =0;
		boolean ans=true;
		while(ans==true)
		{
			System.out.println("Your guess : ");
			double myinput = sc.nextInt(); 
			count++;
			if(myinput<num) {
				System.out.println("Too low.");
			}
			else if(myinput>num) {
				System.out.println("Too high");
			}
			else {
				System.out.println("You guessed it in "+count+" tries.");
				System.out.println("Would you like to play again? (y/n) :");
				char play_again = sc.next().charAt(0);
				if (play_again=='y') {
					ans=true;
					count=0;
					num = rand.nextInt(10)+1; }
				else {
					ans=false;}
			}
		}System.out.println("Bye!");
	}
}
