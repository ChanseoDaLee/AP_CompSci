/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("Hey user! Let's play a guessing game. Your gonna guess a number from 1-1000, and you'll have infinite tries! Goodluck!");
	System.out.println("So whats ur first guess:");
	int rando =(int)(Math.random()*1000);
	int guess = sc.nextInt();
	while(guess != rando){
		System.out.println("Nah thats wrong, try again!");
		guess = sc.nextInt();
	}
System.out.println("Good job! You got it!");
	}
}
