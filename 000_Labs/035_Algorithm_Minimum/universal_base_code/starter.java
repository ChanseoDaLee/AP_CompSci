/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
        int a = (int)(Math.random()*150) + 51;
        
        int [] arr = new int [a];
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        
        for(int i = 0; i<arr.length; i++){
            arr[i] = (int)(Math.random()*100)+1;
            
            if(arr[i] < min){
                min = arr[i];
            }
            
            if(arr[i] > max){
                max = arr[i];
            }
            
            sum = sum + arr[i];
            
        }
        
        double average = sum/(double)arr.length;
        
        System.out.println("Your elements: " + a);
        System.out.println("Your minimum number: " + min);
        System.out.println("Your maximum numer: " + max);
        System.out.println("Your average: " + average);
        
    }
}

	

