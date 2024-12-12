/*
 *	Author: chanseo lee	
 *  Date: 11/9/24
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
    public static void main(String args[]) {
        
        System.out.println("These are the 20 numbers: ");
        
        int[] arr = new int[20];
        
        for(int i = 0; i < arr.length; i++){
            
            arr[i] = (int)(Math.random()*10)+1;
            
            System.out.print(arr[i] + " ");
                
        }
        
        int randomNumber = (int)(Math.random()*10)+1;
        System.out.println("");
        System.out.println("The random number that you are looking for is:"+randomNumber);
        
        int count = 0;
        
        for(int i = 0; i < arr.length; i++){
            
            if(arr[i] == randomNumber){
                System.out.println("Duplicate found at index: " + i);
                count++;
            }
            
        }
        
        System.out.println("Your total number of duplicates for " + randomNumber + " is " + count);
        
        for(int i = 0; i < arr.length-1; i++){
            
            if(arr[i] == arr[i+1]){
                System.out.println("Two in a row found at indexes " + i + " and " + (i+1) + ". The number is " + arr[i]);
            }
            
        }
        

    }
}
	}
}
