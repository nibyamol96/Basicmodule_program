package cricketteam;

import java.util.Scanner;

public class Cricketmatch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of bowlers");
		int size=sc.nextInt();
		int[] runs = new int[size];
		int[] ball = new int[size];
		float[] res=new float[size];
		int c=0;
		float sum=0;
		float avg=0;
		int a=0;
		float b=0;
		System.out.println("Enter the runs conceded by the bowlers");
		for(int i=0;i<size;i++)
		{
			runs[i]=sc.nextInt();
		}
		System.out.println("Enter the number of balls for each bowler");
		for(int i=0;i<size;i++)
		{
			ball[i]=sc.nextInt();
		}
		System.out.println("Economy of the bowlers is");
		for (int i = 0; i < size; i++) 
	    {
	       a=ball[i]/6;
	       b=(float)(runs[i]/a);
	       res[i]=b;
	      
	      System.out.println(res[i]);
	    }
		for (int i = 0; i < size; i++) 
	    {
			sum=sum+res[i];
			if(res[i]<6)
				c++;
			
	    }
		avg=sum/size;
		System.out.println(" The overall economy of the teanm is"+avg);
		System.out.println(" The number of bawlers "+c);
	}

	}