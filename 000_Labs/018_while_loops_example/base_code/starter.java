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
System.out.println("Hey user! What's ur name?");
String name = sc.nextLine();
System.out.println("Cool name! How many times would you like me to write it out?");
int count=0;
int times = sc.nextInt();
	while(count<times){
		System.out.println(name);
		count=count+1;
	}
	}
}
