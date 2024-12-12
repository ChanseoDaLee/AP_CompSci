/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number of Farenheit: ");
		int bob = sc.nextInt();
		System.out.println("The conversion of "+bob+" to celcious would be: ");
		System.out.print((bob-32)*(5.0/9.0));
	
	}
}
