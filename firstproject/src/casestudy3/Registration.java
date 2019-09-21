package casestudy3;

import java.util.Scanner;

import face.Customer;

public class Registration {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		String name;
		String address,a;
		   String contactNumber;
		   String email;
		   String proofType;
		   String proofID,ans;
		   int i=0;
		   do {

		         
		        System.out.println("Registration");
		        i++;
		        System.out.println(" Enter your name");
		        name=sc.nextLine();
		        System.out.println(" Enter your address");
		        address=sc.nextLine();
		        System.out.println(" Enter your Contact number");
		        contactNumber=sc.nextLine();
		        System.out.println(" E-Mail ID");
		        email=sc.nextLine();
		        System.out.println(" Enter proof type");
		        proofType=sc.nextLine();
		        System.out.println(" Enter proof ID");
		        proofID=sc.nextLine();
		        System.out.println(" Thank you for registering. Your id is"+i+"...");
		        System.out.println("Do you want to continue registration? (yes/no)");
		            ans=sc.nextLine();
		     }
		while(ans.equalsIgnoreCase("yes"));
		   System.out.println("Do you want to update the email id?(yes/no)");
		    a=sc.nextLine();

		   while(a.equalsIgnoreCase("yes"))
		   {
		     System.out.println(" Update Email:");
		     email=sc.nextLine();
		     System.out.println("Email updated");
		     System.out.println("Your details are as follows");
		     System.out.println("Name:"+name);
		     System.out.println("Address:"+address);
		     System.out.println("Contact Number:"+contactNumber);
		     System.out.println("E-Mail ID:"+email);
		     System.out.println("Proof type:"+proofType);
		     System.out.println("Proof id:"+proofID);
		     
		     System.exit(0);
		}
		       
		}}
