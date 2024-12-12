/*
 *	Author:Chanseo Lee
 *  Date: 10/20/24	
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
System.out.print("Enter a message that you want to decipher: ");
String input = sc.nextLine();
String decodedMessage = decodedMessage1(input);
System.out.print("Your message becomes: ");
System.out.print(decodedMessage);

	}
	public static String decodedMessage1(String message){
		return Cipher.encode(message);
	}
}
