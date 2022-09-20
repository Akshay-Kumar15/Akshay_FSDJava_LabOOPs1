package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialService {

	public  String generateEmailID(String firstname, String lastname, String dept) 
	{
	return firstname+lastname+"@"+dept+".gl.com";	
	}
	public  char[] generatePassword()
	{
		String capLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters="abcdefghijklmnopqrstuvwxyz";
		String numbers="0123456789";
		String splchars="!@#$%^&*";
		String value=capLetters+smallLetters+numbers+splchars;
		int i;
		
		char p[]=new char[8];
		
		Random random=new Random();
		for(i=0;i<8;i++)
		{
		p[i]=value.charAt(random.nextInt(value.length()));
		
		}
		return p;
		
		}
	


	public  void displayEmpDetails(Employee e1) 
	{
		
	}
	public void displayEmpDetails(String firstName, String lastName, String generateEmail, char[] generatePassword) {
		System.out.println("Employee FirstName is "+firstName);
		System.out.println("Employee LastName is "+lastName);
		System.out.println("Employee EmailID is "+generateEmail);
		System.out.println("Employee Password is "+generatePassword);
		
	}
	
}
	
	
