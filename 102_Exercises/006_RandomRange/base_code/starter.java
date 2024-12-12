/*
 *	Author: Chanseo Lee
 *  Date: 9.16.24
 *	Collaborator(s): Joshua Stone
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers to create a range for your random number");
		System.out.print("Please enter an integer: ");
		int bob= sc.nextInt(); 
		System.out.print("Please enter another integer (bigger than the first): ");
		int josh= sc.nextInt();
		System.out.println(" ");
		System.out.println("Your range is "+bob+" to "+josh+".");
		System.out.println("Here are 5 numbers generated in that range");
		System.out.println((int)((Math.random()*josh-bob)+bob) + ", " + (int)((Math.random()*josh-bob)+bob) + ", " + (int)((Math.random()*josh-bob)+bob) + ", " + (int)((Math.random()*josh-bob)+bob) + ", " + (int)((Math.random()*josh-bob)+bob));
	
		
	}
}
