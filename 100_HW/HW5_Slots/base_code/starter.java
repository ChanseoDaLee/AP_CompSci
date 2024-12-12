/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner sc = new Scanner(System.in);
	Random a = new Random();
	int b = 100;
	boolean c = false;
	boolean d = false;
	boolean e = false;
	boolean f = false;
	new String(" ");
	System.out.println("Slot machine rules:");
	System.out.println("1. Every player begins with $100.");
	System.out.println("2. Input a wager less than your total amount of money.");
	System.out.println("3. The slot machine rolls 3 numbers from 1 to 10.");
	System.out.println(" i. If two #s match, your cash doubles.");
	System.out.println(" ii. If three #s match, your cash now triples.");
	System.out.println(" iii. If none match, you lose the money you wagered.");
	   while(true) {
         System.out.println("--------------------------------------------------");
         System.out.println();
         System.out.print("Would you like to play? (Yes/yes/Y/y) : ");
         String g = sc.nextLine();
         if (!g.equals("yes") && !g.equals("Yes") && !g.equals("y") && !g.equals("Y")) {
            if (g.equals("No") || g.equals("no") || g.equals("N") || g.equals("n")) {
               System.out.println("Alright Buddy. However you still got " + b + " left. Come again soon! Thanks!");
               break;
            }

            System.out.println("Try Again buddy!");
         } else {
            System.out.print("You have $" + b + ". How much would you like to gamble!? ");
            int h = sc.nextInt();
            sc.nextLine();

            while(h > b || h <= 0) {
               if (h <= 0) {
                  System.out.println("Can't do a negative or 0 gang try again.");
                  System.out.print("Please enter a smaller number : ");
               } else {
                  System.out.print("You only have $" + b + "! Please enter a smaller number : ");
               }

               h = sc.nextInt();
               sc.nextLine();
            }

            System.out.println();
            System.out.println("Lets gooo!!");
            System.out.println("Your numbers are: ");
            int i = a.nextInt(10) + 1;
            int j = a.nextInt(10) + 1;
            int k = a.nextInt(10) + 1;
            System.out.println("_______________________");
            System.out.println(" | " + i + " | " + j + " | " + k + " |");
            System.out.println("_______________________");
            if (i == j && j == k) {
               b += h * b;
               System.out.println("You finally got a jackpot, keep going!");
               System.out.println("You now have $" + b + ".");
            } 
            else if (i != j && i != k && j != k) {
               b -= h;
               System.out.println("Aww. It's ok! 99% of gamblers quit before a big win! Try again!");
               System.out.println("You now have $" + b + ".");
            }
            else {
               b += h;
               System.out.println("You won! Your wager is now double what it was!");
               System.out.println("You now have $" + b + ".");
            }

            if (b == 0) {
               System.out.println("--------------------------------------------------");
               System.out.println();
               System.out.println("Bru you out of money. It's alr you can't always win!");
               break;
            }

         }
	}
}
}