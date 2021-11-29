package com.greatlearning.service;
import com.greatlearning.model.*;
import java.util.Random;

public class CredentialService {
	
	//Method to generate Emailid
	public String generateEmailAddress(Employee emp) {
		String Emaild;
		String companyDomain = ".abc.com";
		
		Emaild = emp.getFirstName().toLowerCase()+emp.getLastName().toLowerCase()+"@"+emp.getDepartment()+companyDomain;
		return Emaild;
	}
	
	//Method to generate Password
	public String generatePassword() {
		
		Random random = new Random();
		
		String CapitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String SmallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "1234567890";
		String specialCharacters = "!@#$%^&*";
		
		String allowedCharacters = CapitalLetters+SmallLetters+numbers+specialCharacters;
		
		char[] password = new char[8];
		
		for(int i=0;i<8;i++) {
			int idx  = random.nextInt(allowedCharacters.length());
			password[i] = allowedCharacters.charAt(idx);
			}
		
		return new String(password);
	}
	
	//Method to display details in require format
	public void displayCredentials(Employee emp, String email, String password ) {
		
		System.out.println("Dear "+emp.getFirstName()+" your generated credentials are as follows");
		System.out.println("Email        --->   "+ email);
		System.out.println("Password ---> "+password);

	}
	

}


