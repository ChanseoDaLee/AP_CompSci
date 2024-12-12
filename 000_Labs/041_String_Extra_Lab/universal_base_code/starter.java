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
	Scanner sc = new Scanner(System.in);
	System.out.println("Yo enter a sentence:");
	String sent = new String(sc.nextLine() + " ");
	int x = sent.length();
	boolean y = false;
	String space = new String("");
	for(int i = 0; i < sent.length(); ++i){
		if(sent.substring(i, i+1).compareTo(" ") == 0){
			String z = sent.substring(0, i);
			space = z + " " + space;
			sent = sent.substring(i + 1, sent.length());
			i = 0;
		}
	}
System.out.print(space);

		
	}
}
