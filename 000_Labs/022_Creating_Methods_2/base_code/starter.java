/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
    public static double pow(int x, int y){
        return Math.pow(x,y);
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Put in two integers, the first as the main and the second as the exponent");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.print(pow(a, b));




    }
}