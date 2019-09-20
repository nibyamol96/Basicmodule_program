package reteststudents;

import java.util.Scanner;

public class Findreteststudents {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students");
		int size=sc.nextInt();
		int[] mark = new int[size];
		int c=0;
		
		System.out.println("Enter the mark of students");
		for(int i=0;i<size;i++)
		{
			mark[i]=sc.nextInt();
		}
		for (int i = 0; i < size; i++) 
	    {
	       
	       if(mark[i]<=41)
	    	   c++;
	        
	    }
		
		System.out.println(" Number of students appearing for retest is:"+c);
		
	}

	}