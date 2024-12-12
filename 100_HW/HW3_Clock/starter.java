/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/


import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner whatDay = new Scanner(System.in);
	System.out.println("Do you know what day it is tomorrow?");
	System.out.println("1=Sunday, 2=Mon, 3=Tues, 4=Wed, 5=Thurs, 6=Fri, 7=Sat");
	int day = whatDay.nextInt();
	if(day==1||day==7){
		System.out.println("Alarm set for 10:00 AM");
	}
	else{
		System.out.println("Alarm set for 7:00 AM");
	}
	}
}
