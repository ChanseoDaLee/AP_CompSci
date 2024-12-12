/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner sc = new Scanner(System.in);
	System.out.println("Hey buddy whats your name?");
	String name =sc.nextLine();
	System.out.println("Nice name, now tell me your title:");
	String title =sc.nextLine();
	System.out.println("Excellent! Welcome, "+name+" the "+title+"!");
	
	
	System.out.println("Do you want to be a Wizard, Warrior, or a Rogue?");
	String x = sc.nextLine();
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
		System.out.println("Wrong input, thats not a option");
	}
	System.out.println("Now, you have 20 points to put into your stats, which are Strength, Dexterity, Intelligence, and Charisma, with a max of 10 in one stat.");
	int points = 20;
	System.out.println("How many points would you like to put into strength?");
	int strength= sc.nextInt();
	int r1=points-strength;
		int r11=points-(-strength);
	if(strength<0){
		System.out.println("Thats a negative number dummy, try again.");
		int strength2=sc.nextInt();
		System.out.println("Well done! You have put "+strength2+ " points into strength. You have "+r11+" points remaining!");
	}
	else if(strength>10){
		System.out.println("Thats exceeding the 10 point limit, try again.");
		int strength2=sc.nextInt();
		int r21 = points-strength2;
		System.out.println("Well done! You have put "+strength2+ " points into strength. You have "+r21+" points remaining!");
	}
	else {
		System.out.println("Well done! You have put "+strength+ " points into strength. You have "+r1+" points remaining!");
	}
	System.out.println("Now, how many points would you like to put into Dexterity?");
	int dexterity= sc.nextInt();
	int r2=r1-dexterity;
	int r12 = r11-(-dexterity);
	if(dexterity<0){
		System.out.println("Thats a negative number dummy, try again.");
		int dexterity2=sc.nextInt();
		int r22=r1-dexterity2;
		System.out.println("Well done! You have put "+dexterity2+ " points into dexterity. You have "+r22+" points remaining!");
	}
	else if(dexterity>10){
		System.out.println("Thats exceeding the 10 point limit. Try again.");
		int dexterity2=sc.nextInt();
		System.out.println("Well done! You have put "+dexterity2+ " points into dexterity. You have "+(r1-dexterity2)+" points remaining!");
	}
	else if(dexterity>r1){
		System.out.println("You don't have enough points to do that. Try again.");
		dexterity=sc.nextInt();
		System.out.println("Well done! You have put "+dexterity+ " points into dexterity. You have "+r2+" points remaining!");
	}
	else {
		System.out.println("Well done! You have put "+dexterity+ " points into dexterity. You have "+r2+" points remaining!");
	}
	if(r2 == 0){
		System.out.println("You've used up all your points. Well done!");
		System.out.println("Your name is "+name+ " the "+title);
		System.out.println("You have "+strength+ " points in strength and "+dexterity+" points in dexterity. You have 0 points in intelligence and charisma!");
	}
	if(r12 == 0){
		System.out.println("You've used up all your points. Good for you!");
		System.out.println("Your name is "+name+ " the "+title);
		System.out.println("You have "+(-strength)+ " points in strength and "+(-dexterity)+" points in dexterity. You also have no points into intelligence. And finally, you have no points in charisma. Well done!");
	}
	else{
		System.out.println("Now, how many points would you like to put in intelligence?");
	int intelligence = sc.nextInt();
	int r3 = r2 - intelligence;
	int r13 = r12-(-intelligence);
	if(intelligence<0){
		System.out.println("Thats a negative number dummy, try again.");
		int intelligence2=sc.nextInt();
		System.out.println("Well done! You have put "+intelligence2+ " points into intelligence. You have "+r13+" points remaining!");
	}
	else if(intelligence>10){
		System.out.println("Thats exceeding the limit dummy, try again.");
		intelligence=sc.nextInt();
			System.out.println("Well done! You have put "+intelligence+ " points into intelligence. You have "+r3+" points remaining!");
	}
	else if(intelligence>r2){
		System.out.println("You don't have enough points to do that. Try again!");
		intelligence=sc.nextInt();
			System.out.println("Well done! You have put "+intelligence+ " points into intelligence. You have "+r3+" points remaining!");
	}
	else{
			System.out.println("Well done! You have put "+intelligence+ " points into intelligence. You have "+r3+" points remaining!");
	}
	if(r3 == 0){
		System.out.println("You've used up all your points. Well done!");
		System.out.println("Your name is "+name+ " the "+title);
		System.out.println("You have "+strength+ " points in strength and "+dexterity+" points in dexterity. You also have "+intelligence+" points into intelligence. You have no points in charisma.");
	}
	if(r13 == 0){
		System.out.println("You've used up all your points. Good for you!");
		System.out.println("Your name is "+name+ " the "+title);
		System.out.println("You have "+(-strength)+ " points in strength and "+(-dexterity)+" points in dexterity. You also have "+(-intelligence)+" points into intelligence. And finally, you have no points in charisma. Well done!");
	}
	else{
		System.out.println("Now, how many points would you like to put into charisma?");
	int charisma= sc.nextInt();
	int r4= r3-charisma;
	int r14= r13-(-charisma);
	if(charisma<0){
		System.out.println("Thats a negative number dummy, try again.");
		int charisma2=sc.nextInt();
		System.out.println("Well done! You have put "+charisma2+ " points into charisma. You have "+r14+" points remaining!");
	}
	else if(charisma>10){
		System.out.println("Thats over the 10 point limit dummy, try again.");
		charisma=sc.nextInt();
		System.out.println("Well done! You have put "+charisma+ " points into charisma. You have "+r4+" points remaining!");
	}
	else if(charisma>r3){
		System.out.println("You don't have enough points for that, try again.");
		charisma=sc.nextInt();
		System.out.println("Well done! You have put "+charisma+ " points into charisma. You have "+r4+" points remaining!");
	}
	else{
		System.out.println("Well done! You have put "+charisma+ " points into charisma. You have "+r4+" points remaining!");
	}
	if(r4 == 0){
		System.out.println("You've used up all your points. Good for you!");
		System.out.println("Your name is "+name+ " the "+title);
		System.out.println("You have "+strength+ " points in strength and "+dexterity+" points in dexterity. You also have "+intelligence+" points into intelligence. And finally, you have "+charisma+" points in charisma. Well done!");
	}
	if(r14 == 0){
		System.out.println("You've used up all your points. Good for you!");
		System.out.println("Your name is "+name+ " the "+title);
		System.out.println("You have "+(-strength)+ " points in strength and "+(-dexterity)+" points in dexterity. You also have "+(-intelligence)+" points into intelligence. And finally, you have "+(-charisma)+" points in charisma. Well done!");
	}
	}
	}
	}
}

