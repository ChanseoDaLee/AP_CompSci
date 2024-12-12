/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {
        // Your Code Goes here
        Scanner sc = new Scanner(System.in);
        System.out.println("You wake up to the sound of your alarm clock blaring. It’s a school day, and you’ve got to get ready. What’s the first thing you do?");
        System.out.println("1. Hit the snooze button");
        System.out.println("2. Jump out of bed");
        System.out.println("3. Lay in bed and scroll through your phone");
    
        int answer1 = sc.nextInt(); 
        
        if(answer1 == 1){
            System.out.println("You hit the snooze and doze off, which makes you behind schedule");
            System.out.println("Next, would you");
            System.out.println("1. Rush through breakfast");
            System.out.println("2. Skip breakfast");
            System.out.println("3. Make a healthy breakfast, very nutritious");
            int answer2 = sc.nextInt();
            if (answer2 ==1)
                System.out.println("You rush your breakfast and eat whatever junk there is");
            else if(answer2 == 2)
                System.out.println("You completely skip breakfast and stay hungry");
            else if(answer2 == 3)
                System.out.println("You make a healthy breakfast and eat like a good little boy");
            else
                System.out.println("You stay asleep");
                
        }
        else if(answer1 == 2){
            System.out.println("You jumped out of bed ready for the day");
            System.out.println("Next would you");
            System.out.println("1. Get dressed fast");
            System.out.println("2. Choose your fit carefully");
            System.out.println("3. Plan your outfit for the entire week");
            int answer2 = sc.nextInt(); 
            if(answer2 == 1)
                System.out.println("You throw on whatever clothes you have out");
            else if(answer2 == 2)
                System.out.println("You pick something you feel very confident in");
            else if(answer2 == 3)
                System.out.println("You lay out clothes for the entire week to save time later");
                
        }
        else if(answer1 == 3){
            System.out.println("You stay in bed like a lazy bum and stay on your phone. When you finally get out of bed, your a lil behind schedule");
            System.out.println("Next would you");
            System.out.println("1. Grab a quick snack");
            System.out.println("2. You skip breakfast");
            System.out.println("3. Make a complete breakfast even when you have no time");
            int answer2 = sc.nextInt();
            if(answer2 == 1)
                System.out.println("You grab a granola bar");
            else if(answer2 == 2)
                System.out.println("You eat absolutely nothing and dip");
            else if(answer2 == 3)
                System.out.println("You enjoy a nice breakfast but now your late");
        }
        else{
            System.out.println("Thats not an option bum");
        }
        
        
    }

}
