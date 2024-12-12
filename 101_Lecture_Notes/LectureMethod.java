/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        // Your Code Goes here!
        
        printAnimal();
                printAnimal();
                        printAnimal();
                                printAnimal();
                                        printAnimal();
                                                printAnimal();
	
        greeting("John");
        greeting("Jayden");
        greeting("Jimothy II");
        
        double num = raise(10000, 15);
        System.out.println(num);
        num = raise(num, 15);
        System.out.println(num);
    }
    
    public static double raise(double salary, int percent){
        double amount = salary + (salary * (percent/100.0));
        return amount;
    } 
	
	
	public static void greeting(String name){
	    System.out.println("Howdy "+ name);
	}
	
	
	
	public static void printAnimal(){
	    System.out.println("                  ;'-.  ");
	    System.out.println("  `;-._        )  '---.._");
	    System.out.println("    >  `-.__.-'          `'.__");
	    System.out.println("   /_.-'-._         _,   ^ ---)");
	    System.out.println("   `       `'------/_.'----```");
	    return;
	}

}
