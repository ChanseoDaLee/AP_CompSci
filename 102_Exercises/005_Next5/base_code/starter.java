/*
 *	Author: Chanseo Lee
 *  Date: 9/11/24
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {

Scanner sc = new Scanner(System.in);
System.out.print("Please enter a number: ");
 int name = sc.nextInt();
 
 sc.nextLine();

 System.out.println("Here are the next 5 numbers!");
 System.out.println((name)+(name+1)+", "+(name+2)+", "+(name+3)+", "+(name+4)+", "+(name+5));
 System.out.println("Here are the next 5 multiples!");
 System.out.println((name)+", "+(name*2)+", "+(name*3)+", "+(name*4)+", "+(name*5)+", "+(name*6));
 System.out.println("Here is "+name+" divided by 100!");
 System.out.println(name/100.0);
 System.out.println("Here is "+name+" divided by 10!");
 System.out.print(name/10.0);
	}
}
