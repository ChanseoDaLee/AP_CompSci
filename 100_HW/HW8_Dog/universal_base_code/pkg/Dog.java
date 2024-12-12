package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
    String name = "";
int age  = 0;
String breed = "";
    public Dog() {
        name = "Clifford";
        age = 3;
        breed = "big red dog";
    }
    
    public Dog(String Monkey){
        name = Monkey;
        age = 1;
        breed = "dog dog";
    }
    
    public Dog(String husky, String Monkey){
        name = Monkey;
        age = 1;
        breed = husky;
    }
    
    public Dog(int one, String Monkey){
        name = Monkey;
        age = one;
        breed = "dog dog";
    }
    
    public void setName(String Monkey){
        name = Monkey;
        
    }
    
    public void setAge(int one){
        age = one;
    }
    
    public void setBreed(String husky){
        breed = husky;
        
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public String getBreed(){
        return breed;
    }
    
    public boolean isSleeping(){
    int x = (int) Math.random()*1;
    if(x == 1){
        return false;
        
    }
    else{
        return true;
    }
    }
    
    public void bark(){
        System.out.println(name + " barks");
    }
    
    
     
    
    
    

}