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
	System.out.println("Please enter a number");
	int x = sc.nextInt();
	
	System.out.println("Please enter another number");
	int y = sc.nextInt();
	
	if(x > y){
		System.out.println(x + " is greater than " + y);
	}
	else if(x < y){
		System.out.println(x + " is less than " + y);
	}
	else{
		System.out.println(x + "is equal to " + y);
		}
	}
}
