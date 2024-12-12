/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner sc = new Scanner(System.in);
	int x= (int)((Math.random()*1000-1)+1);
	System.out.println("I have chosen a number between 1 and 1000. Try guessing it.");
	int y = sc.nextInt();
	if(y > x){
		System.out.println("Your too high");
	}
	else if(y < x){
		System.out.println("Nah u lower");
	}
	else{
		System.out.println("Good guess, thats correct!");
		}
	}
}