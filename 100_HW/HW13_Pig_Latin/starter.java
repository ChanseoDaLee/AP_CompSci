/*
   * Author: Chanseo Lee
   * Date: 12/8/24
   * Collaborator(s): Ryan Yoon, helped on call
*/

import java.util.Scanner;
import java.util.Random;

class starter {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Yo enter a sentence, and I'll translate it to Pig Latin: ");
        String sentence = sc.nextLine();
        String a = toSentence(sentence);
        System.out.println("Heres your sentence in Pig Latin: ");
        System.out.println(a);
        
    }
    
    public static String toWord(String word){
        String vowel = ("aAeEiIoOuU");
        String finalWord = "";
        int findVowel = -1;
        
        if(vowel.contains(word.substring(0, 1))){
            finalWord = word + "-" + "way";
        }
        else{
            for(int i = 0; i<word.length(); i++){
                if(vowel.contains(word.substring(i, i+1))){
                    findVowel = i;
                    break;
                }
            }
        }
        if(findVowel != -1){
            finalWord = word.substring(findVowel) + "-" + word.substring(0, findVowel) + "ay";
        }
        else{
            word = word + "ay";
        }
        return finalWord;
    }
    public static String toSentence(String sentence){
        String word = "";
        String finalSentence = "";
        for(int i = 0; i<sentence.length(); i++){
            String letter = sentence.substring(i, i+1);
            if(!letter.equals(" ")){
                word += letter;
            }
            else{
                if(!word.isEmpty()){
                    finalSentence += toWord(word) + " ";
                    word = "";
                }
            }
        }
        if(!word.isEmpty()){
            finalSentence += toWord(word);
        }
        return finalSentence;
   }
}	

