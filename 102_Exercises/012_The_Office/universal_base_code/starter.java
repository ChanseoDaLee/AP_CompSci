/*
 *	Author: Chanseo Lee
 *  Date: 10/22/24
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
	Employee dwight = new Employee(1987, "Dwight", "Howard", 4416.66);	
	Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
	Employee pam = new Employee(2011, "Pam", "Beesly", 2250);
	Employee stone = new Employee(0000, "Jhase", "De Stone", 100);
	
	michael.raiseSalary(20);
	dwight.raiseSalary(1);
	jim.raiseSalary(15);
	pam.raiseSalary(45);
	stone.raiseSalary(0);

	
	Double michaelSalary = michael.getAnnualSalary();
	Double dwightSalary = dwight.getAnnualSalary();
	Double jimSalary = jim.getAnnualSalary();
	Double pamSalary = pam.getAnnualSalary();
	Double stoneSalary = stone.getAnnualSalary();

	
	stone.employeeToString();
	pam.employeeToString();
	jim.employeeToString();
	dwight.employeeToString();
	michael.employeeToString();
	
	System.out.println("Michael's annual salary is "+ michaelSalary);
	System.out.println("Dwight's annual salary is "+ dwightSalary);
	System.out.println("Jim's annual salary is "+ jimSalary);
	System.out.println("Pam's annual salary is "+ pamSalary);
	System.out.println("Jhase's annual salary is "+ stoneSalary);

	}
}
