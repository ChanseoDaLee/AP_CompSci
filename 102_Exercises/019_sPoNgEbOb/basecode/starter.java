/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
	System.out.println("Give me a word or sentence to translate to sPoNgE cAsE:");
	String x = sc.nextLine();

	public static String spongeCase(String word){
		String result = "";
		
	for(int i=0; i < x.length(); i++){
		String letter = word.subtring(i, i+1);
		
		if(i%2 ==0){
			letter = letter.toLowerCase();
		}
		else{
			letter = lettertoUpperCase();
		}
		result = result+letter;
		
	}
	return result;
	}
	}

