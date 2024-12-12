/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
    public static void main(String args[]) {
        
        
        Dog x = new Dog("STone");
        x.setAge(12);
        
        Dog y = new Dog("Joshua", "Chihuahua");
       
       boolean a =  x.isSleeping();
       if(a == false){
           x.bark();
       }else{
           System.out.println("It's asleep");
       }
       
       boolean b = y.isSleeping();
       if(b == true && a == false){
           y.bark();
       }
       
       else if(b == false && a == false){
           y.bark();
       }
       
       

       
        
     

    }
}