package input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Reading {
	String name;
	String age;
	String degree;
	String branch;
	String contactNumber;
	
	public static void main(String[] args) {
		String name;
		int age;
		String degree;
		String branch;
		String contactNumber;
		
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name");
		name=sc.nextLine();
		System.out.println("Enter your age");
		age=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your Degree");
		degree=sc.nextLine();
		System.out.println("Enter your Branch");
		branch=sc.nextLine();
		System.out.println("Enter your Contact Number ");
		contactNumber=sc.nextLine();
		System.out.println("Name:"+ name);
		System.out.println("Age:"+ age);
		System.out.println("Degree:"+degree);
		System.out.println("Branch:"+branch);
		System.out.println("contactNumber:"+contactNumber);
		
		
}
	
}
