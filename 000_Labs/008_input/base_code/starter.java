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
        System.out.println("What's your first name?");
        String name = sc.nextLine();
        System.out.println("Nice name, " + name + "!" + " How old are you?");
        String age = sc.nextLine();
		System.out.println("What month were you born?");
		String month = sc.nextLine();
		System.out.println("What about the day?");
		Integer birthday = sc.nextInt();
		System.out.println("The year?");
		Integer birthyear = sc.nextInt();
		System.out.println("And lastly, how much is a buck fifty?");
		Double buckfifty = sc.nextDouble();
		System.out.println("Yep, you're correct " + name + "!! Have a great day!!");

	}
}
