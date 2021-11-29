package com.greatlearning.main;
import java.util.Scanner;
import com.greatlearning.model.*;
import com.greatlearning.service.*;

public class Driver {
	
	//Create Objects
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String []args) {
		
		//Declaring variables
		int departmentId;
		
		//Getting input from user
		System.out.println("Enter your FirstName:");
		String FirstName = sc.next();
		
		System.out.println("Enter your LastName:");
		String LastName = sc.next();
	
		System.out.println("Choose your DepartmentId:");
		displayDepartmentList();
		departmentId = sc.nextInt();
		
		//Intialising Employee class object
		Employee emp;
		
		//Setting the details enter by user
		switch(departmentId) {
			
			case 1:
				emp = new Employee(FirstName,LastName,"tech");
				break;
			
			case 2:
				emp = new Employee(FirstName,LastName,"adm");
				break;
			
			case 3:
				emp = new Employee(FirstName,LastName,"hr");
				break;
				
			case 4:
				emp = new Employee(FirstName,LastName,"lg");
				break;
				
			default:
				System.out.println("Incorrect Choice");
				return;
			
			}
		
		//Calling Credential Service Class
		CredentialService cs = new CredentialService();
		String email = cs.generateEmailAddress(emp);
		String password = cs.generatePassword();
		cs.displayCredentials(emp, email, password);
		
	}
	
	//DepartmentList MenuMethod
	private static void displayDepartmentList() {
		
		System.out.println("----------------");
		
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. HumanResource");
		System.out.println("4. Legal");
		
		System.out.println("----------------");
		
		
	}
	
	

}
