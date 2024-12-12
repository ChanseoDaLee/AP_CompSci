/*
 *	Author: chanseo lee
 *  Date:
 * 	Collaborator(s): 
*/
import java.util.Scanner;
import java.util.Random;


class starter {

public static boolean isLeapYear(int a) {
	if( a%4==0) {
	return true;
	}
	else{
		return false;
	}
}

public static int getDigitSum(int a) {
	int addend1 = a%10;
	a = a/10;
	int addend2 = a%10;
	a = a/10;
	int addend3 = a%10;
	a = a/10;
	int addend4 = a%10;
	a = a/10;
	int addend5 = a%10;
	a = a/10;
	int sum = addend1+addend2+addend3+addend4+addend5;
	return sum;
}


public static void printIfConsecutive(int num1, int num2, int num3) {
	if (num1 + 1 == num2 && num2 + 1 == num3) {
		System.out.println("Consecutive");
	}
	else {
		System.out.println("Not consecutive");
	}
}
	public static void main(String args[]) {
		System.out.println("----------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = sc.nextInt();
		System.out.println();
		if(isLeapYear(year)){
			System.out.println(year + " is a leap year!");
		}
		else{
			System.out.println(year + " is not a leap year!");
		}
		
	System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a 5 digit number");
		int number = sc.nextInt();
		int sum = getDigitSum(number);
		System.out.println();
		System.out.println("The sum of the digits of " + number + " is " + sum);

	
	System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a number");
		int num1 = sc.nextInt();
		System.out.println("Enter a number");
		int num2 = sc.nextInt();
		System.out.println("Enter a number");
		int num3 = sc.nextInt();
		System.out.println();
		printIfConsecutive(num1, num2, num3);
		System.out.println();
		System.out.println("----------------------------------------");
	
	}
}













	
