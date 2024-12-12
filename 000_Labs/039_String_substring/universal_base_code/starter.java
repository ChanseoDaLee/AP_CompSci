/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
Scanner sc = new Scanner(System.in);
System.out.println("Please enter a word:");
String text = sc.nextLine();
	for(int i=0; i<text.length(); i++){
		System.out.println(text.substring(i,i+1));
	}

		
	}
}
