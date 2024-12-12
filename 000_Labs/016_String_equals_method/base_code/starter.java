/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Do you want to be a Wizard, Warrior, or a Rogue?");
	String x = scan.nextLine();
	if(x.equals("Wizard")){
		System.out.println("You're a Wizard!");
	}
	else if(x.equals("wizard")){
		System.out.println("You're a wizard!");
	}
	else if(x.equals("Warrior")){
		System.out.println("You're a Warrior!");
	}
	else if(x.equals("warrior")){
		System.out.println("You're a warrior!");
	}
	else if(x.equals("Rogue")){
		System.out.println("You're a Rogue!");
	}
	else if(x.equals("rogue")){
		System.out.println("You're a rogue!");
	}
	else{
		System.out.println("Wrong input");
	}
	}
}

