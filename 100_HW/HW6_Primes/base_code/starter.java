/*
 *	Author:chanseo lee
 *  Date:10/14/2024
*/

import java.util.Scanner;

class starter {
    public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Yo put in a number and I'll print every prime number until it's: ");
    int a = sc.nextInt();

    int b;
	 jit(a);

    }

    public static boolean bum(int b){
        for(int a = 2; a < b; ++a){
            if(b % a == 0){
                return false;
            }
        }

        return true;

    }

    public static void jit(int b){
        for(int a = 2; a < b + 1; ++a){
            if(bum(a)){
                System.out.println(a);
            }
        }
    }

}