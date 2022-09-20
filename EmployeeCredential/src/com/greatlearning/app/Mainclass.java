package com.greatlearning.app;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

public class Mainclass {

	public static void main(String[] args) {
		 Employee e1=new Employee(); //default constructor
		 
		 CredentialService cs=new CredentialService(); 
		 String generateEmail="";
		   
		 char[] generatePassword =null;
		 java.util.Scanner sc=new java.util.Scanner(System.in);
		 
		 do {
		 System.out.println("Please choose your department");
		 System.out.println("1. Tech");
		 System.out.println("2. Admin");
		 System.out.println("3. HR");
		 System.out.println("4. Legal");
		 System.out.println("5. Exit");
		 
		 int choice=sc.nextInt();
		 
		 switch(choice) {
		 case 1:
			 generateEmail=cs.generateEmailID(e1.getFirstName().toLowerCase(),e1.getLastName().toLowerCase(),"tech");
			 generatePassword=cs.generatePassword();
			 break;
		 case 2:
			 generateEmail=cs.generateEmailID(e1.getFirstName().toLowerCase(),e1.getLastName().toLowerCase(),"admin");
			 generatePassword=cs.generatePassword();
			 break;
		 case 3:
			 generateEmail=cs.generateEmailID(e1.getFirstName().toLowerCase(),e1.getLastName().toLowerCase(),"hr");
			 generatePassword=cs.generatePassword();
			 break;
		 case 4:
			 generateEmail=cs.generateEmailID(e1.getFirstName().toLowerCase(),e1.getLastName().toLowerCase(),"legal");
			 generatePassword=cs.generatePassword();
			 break;
		 case 5:
			 System.exit(0);
		 default:
			 System.out.println("Please enter valid choice");
				 
		 
		 }
		 cs.displayEmpDetails(e1.getFirstName(),e1.getLastName(),generateEmail,generatePassword);
		 //System.out.println("Email ID:"+generateEmail);
		 //System.out.println("Password is:"+generatePassword);
		 } while(true);
	}

}
